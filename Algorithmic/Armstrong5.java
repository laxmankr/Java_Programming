/*5. Write a program in java to check whether a number is an Armstrong
number or not.*/


import java.util.*;
import java.io.*;
import java.lang.*;
public class Armstrong5
{
       public static void main(String args[]){
    Scanner in=new Scanner(System.in);
System.out.print("Enter number=");
   int N=in.nextInt();
int temp=N;
int r=0,sum=0;
  while(temp!=0){
             r=temp%10;
             sum=sum+(r*r*r);
            temp=temp/10;
                }
if(N==sum)
System.out.println("No_is Armstrong!");
else
System.out.println("No_is Not a Armstrong!");
        }
}