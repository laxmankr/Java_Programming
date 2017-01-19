/*18.Write a program in java to find the sum of the even and odd digits of the
number which is given as input.*/


import java.util.*;
import java.io.*;
import java.lang.*;
public class Evenoddsum
{
       public static void main(String args[]){
    Scanner in=new Scanner(System.in);
System.out.print("Enter number=");
   int N=in.nextInt();
int temp=N;
int r=0,evensum=0,oddsum=0;
  while(temp!=0){
             r=temp%10;
             if((r%2)==0)
               evensum+=r;
         else
               oddsum+=r;      
            temp=temp/10;
                }
System.out.println("Even digits sum="+evensum);
System.out.println("Odd  digits sum="+oddsum);
        }

}