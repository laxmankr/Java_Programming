/*8. Write a program in java to find out whether the given number is a power of 2.*/



import java.util.*;
import java.io.*;
import java.lang.*;
 public  class Powerof2
{ 
       public static void main(String[] args){
       Scanner in=new Scanner(System.in);
System.out.print("Enter Number:");
            int N=in.nextInt();
int temp=N;
int r=0,k=0;
while(temp!=0)
{
             if((temp%2)!=0)
              r++;
             k++;
             temp=temp/2;
}
r--;
if(r==0)
System.out.println("2 Has a power "+(k-1));
else
System.out.println("This Number is Not a power of 2!");
}
}