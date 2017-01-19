/*11. Write a program in java to take a full name with surname and middle
name optional) as input, then find the initial of that name, i.e. if the
input is “Sachin Ramesh Tendulkar”, the program should print “S.R.
Tendulkar”.*/

import java.util.*;
import java.io.*;
import java.lang.*;
 public  class NameStd
{ static int k=0,t,r=0;
       public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       String str1;
   System.out.print("Enter Full Name : ");
   str1=in.nextLine();
int N=str1.length();
 System.out.print("Modifyed  Name  : ");
  System.out.print(str1.charAt(0));
for(int i=0;i<N;i++)
if(str1.charAt(i)==' ')
k++;

 for(int i=0;i<N;i++){
if(str1.charAt(i)==' ')
{
r++;
if(r==k)
{
t=i;
System.out.print("."+str1.charAt(i+1));
}
else
System.out.print("."+str1.charAt(i+1));
}
              }
for(int i=t+2;i<N;i++)
System.out.print(str1.charAt(i));
}
}