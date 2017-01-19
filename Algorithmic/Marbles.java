import java.io.*;
import java.util.*;
import java.lang.*;
public class Marbles
{
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
System.out.println("********************************************************\n");
	System.out.print("Enter No_of Marbles=");
	int N=in.nextInt();
	System.out.println("Enter weight of Marbles all are same except One");
	int[] a=new int[N];
	int k=0;
	for(int i=0;i<N;i++)
	a[i]=in.nextInt();
if(N==1)System.out.println("Position of odd Marbles="+1+"  weight="+a[0]);
else if(N==2){if(a[0]!=a[1])
System.out.println("Position of odd Marbles="+1+"  "+2+"  weight="+a[0]+"  "+a[1]);
else 
System.out.println("Sorry! Both are same");}
else	if(a[0]!=a[1]&&a[0]!=a[2])
	System.out.println("Position of odd Marble="+1+"  weight="+a[0]);
else
	{
for(int i=0;i<N;i++)
	if(a[0]!=a[i])
System.out.println("Position of odd Marble="+(i+1)+"  weight="+a[i]);
}
System.out.print("\n********************************************************\n");
}
}

