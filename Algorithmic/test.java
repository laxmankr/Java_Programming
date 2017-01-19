import java.util.*;
abstract class student{
	String name;
	String id;
	double grade;
	int age;
	String Addr;
	abstract boolean isPassed();
	student(String n,String i,double g,int a,String A){
		name=n;
		id=i;
		grade=g;
		age=a;
		Addr=A;
	}
	/*boolean  isPassed(){
		return;
	}*/
}
class UnderGrad extends student{
	UnderGrad(String n,String i,double g,int a,String A){
		super(n,i,g,a,A);
	}
	boolean isPassed(){
		if(this.grade>70.0){
			return true;
		}
		else
			return false;
	}
	void display(){
		System.out.println("Name  --->>>   "+name);
		System.out.println("id    --->>>   "+id);
		System.out.println("grade --->>>   "+grade);
		System.out.println("ag e  --->>>   "+age);
		System.out.println("Addr  --->>>   "+Addr);
		System.out.println("");
	}
}
class Grad extends student{
	Grad(String n,String i,double g,int a,String A){
		super(n,i,g,a,A);
	}
	boolean isPassed(){
		if(this.grade>80.0){
			return true;
		}
		else
			return false;
	}
	void display(){
		System.out.println("Name  --->>>   "+name);
		System.out.println("id    --->>>   "+id);
		System.out.println("grade --->>>   "+grade);
		System.out.println("ag e  --->>>   "+age);
		System.out.println("Addr  --->>>   "+Addr);
		System.out.println("");
	}
}
class test{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		Grad stu1=new Grad("Pritesh","1401EE29",65.0,19,"Delhi");
		UnderGrad stu2=new UnderGrad("Netwon","1401CS29",85.0,20,"Bihar");
		//System.out.println("Enter grade for Grad student = ");
		//double N=in.nextDouble();
		if(stu1.isPassed()){
			System.out.println("Grad Student is Passed");
			stu1.display();
		}
		else{
			System.out.println("Grad Student is Not Passed");
		    stu1.display();
		}
		//System.out.println("Enter grade for Grad student = ");
	//double N1=in.nextDouble();
		if(stu2.isPassed()){
			System.out.println("UnderGrad Student is Passed");
			stu2.display();
		}
		else{
			System.out.println("UnderGrad Student is Not Passed");
		    stu2.display();
		}
	}
}