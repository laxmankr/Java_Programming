import java.util.*;
import java.io.*;
import java.lang.*;
class operator
{
static int N,f,s,i=0;
static String str;
public static void main(String[] args){

getresult();
}
static void getresult()
{ 	Scanner in=new Scanner(System.in);
System.out.println("\n\n******************************");
	System.out.print("Enter string:");
	str=in.nextLine();
	N=str.length();
	while((str.charAt(i)!='+')&&(str.charAt(i)!='-')&&(str.charAt(i)!='*')&&(str.charAt(i)!='/')&&(str.charAt(i)!='%'))
	{
	i++;
	}
	
f=i;
	char ch[]=new char[1];
	ch[0]=str.charAt(i);
   String str1="";
   String str2="";
	for(int j=0;j<f;j++)
	{
 	str1=str1+str.charAt(j);	
	}

double numf=Double.parseDouble(str1);
System.out.println("num1="+numf);
	for(int k=(f+1);k<N;k++)
	{
 	str2=str2+str.charAt(k);	
	}

double nums=Double.parseDouble(str2);
System.out.println("num2="+nums);
switch(ch[0]){
                   case '+':System.out.println("Output="+(numf+nums));break;
                   case '-':System.out.println("Output="+(numf-nums));break;
                   case '*':System.out.println("Output="+(numf*nums));break;
                   case '/':System.out.println("Output="+(numf/nums));break;
                   case '%':System.out.println("Output="+((int) (numf%nums)));break;
	 default:System.out.println("Error!");
	}
System.out.println("******************************\n");
}
}