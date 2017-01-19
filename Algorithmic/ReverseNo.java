/*15.Write a program in java to find out the reverse of an input number.*/


import java.util.*;
import java.io.*;
import java.lang.*;
public class ReverseNo
{
       public static void main(String args[]){
    Scanner in=new Scanner(System.in);
System.out.print("Enter number=");
   int N=in.nextInt();
int temp=N;
int r=0,rev=0;
  while(temp!=0){
             r=temp%10;
             rev=rev*10+r;
            temp=temp/10;
                }
System.out.println("Reverse Number is="+rev);
        }
   }