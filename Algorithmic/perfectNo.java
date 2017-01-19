/*6. Write a program in java to check whether a number is perfect number or
not.(ex: 6 is a perfect number as the factors of 6 are 1,2,3 whose
summation adds to the number 6.)*/


import java.util.*;
import java.io.*;
import java.lang.*;
 public  class perfectNo
{ 
       public static void main(String[] args){
       Scanner in=new Scanner(System.in);
System.out.print("Enter Number:");
            int N=in.nextInt();
           int sum=0;
           int r;
         for(int i=1;i<N;i++)
{
                if((N%i)==0){
                sum=sum+i;
                      }
}
if(sum==N)
System.out.println("No_is perfect!");
else
System.out.println("No_is Not perfect!");
      }
}