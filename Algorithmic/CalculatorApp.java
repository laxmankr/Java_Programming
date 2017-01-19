import java.util.*;
abstract class myCalculator{
	abstract double calculate(double a,double b);
}
class addition extends myCalculator{
	double a;
	double b;
	double calculate(double a,double b){
		return (a+b);
	}
}
class subst extends myCalculator{
	double calculate(double a,double b){
		return (a-b);
	}
}
class multipl extends myCalculator{
	double calculate(double a,double b){
		return (a*b);
	}
}
class divide extends myCalculator{
	double calculate(double a,double b){
		if(b==0.0){
			throw new ArithmeticException("divide by 0");
		}
		else
			return (a/b);
	}
}
class power extends myCalculator{
	double calculate(double a,double b){
		return (Math.pow(a,b));
	}
}
class mod extends myCalculator{
	double a;
	double b;
	double calculate(double a,double b){
		if(b==0.0){
			throw new ArithmeticException("divide by 0");
		}
		else
		return (a%b);
	}
}
class CalculatorApp{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.print("Expression : ");
		String exp=in.next();
		String str1="";
		String str2="";
		String str3="";
		char chr;
		double a,b;
		int i,sy=0;
		char[] ch={'+','-','*','/','%','^'};
		for(i=0;i<exp.length();i++){
			for(char c:ch){
				if(exp.charAt(i)==c){
					sy=i;
					break;
				}
			}
		}
		if((sy==0)||(sy==(exp.length()-1))){
			System.out.println("Invalid Expression");
			System.exit(1);
		}
		else{
			for(i=0;i<exp.length();i++)
			{
				if(i<sy)
			str1=str1+exp.charAt(i);
			else
				if(i>sy)
				str2=str2+exp.charAt(i);
				else str3=str3+exp.charAt(i);
		    }
		}
		chr=str3.charAt(0);
		a=Double.parseDouble(str1);
		b=Double.parseDouble(str2);
		switch(chr){
			case '+':{
				addition ad=new addition();
				double result=ad.calculate(a,b);
				System.out.println("Addition = "+result);
			};break;
			case '-':{
				subst ad=new subst();
				double result=ad.calculate(a,b);
				System.out.println("Substraction = "+result);
			};break;
			case '*':{
				multipl ad=new multipl();
				double result=ad.calculate(a,b);
				System.out.println("Multiplication = "+result);
			};break;
			case '/':{
				divide ad=new divide();
				try{
				double result=ad.calculate(a,b);
				System.out.println("Divide = "+result);
				}catch(ArithmeticException e){
					System.out.println("My Exception is : "+e);
				}
			};break;
			case '%':{
				mod ad=new mod();
				try{
				double result=ad.calculate(a,b);
				System.out.println("Mod = "+result);
				}catch(ArithmeticException e){
					System.out.println("My Exception is"+e);
				}
			};break;
			case '^':{
				power ad=new power();
				double result=ad.calculate(a,b);
				System.out.println("Power = "+result);
			};break;
			default:break;
		}
	}
}