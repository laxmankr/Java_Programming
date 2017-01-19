/*10.Write a program to find the occurrences of a particular input substring in
an input string.*/

import java.util.*;
import java.io.*;
import java.lang.*;
 public  class countsubString
{ 
       static  int count=0,k;
       public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       String str1,str2;
   System.out.print("Enter String : ");
       str1=in.nextLine();
 System.out.print("Enter subString : ");
       str2=in.nextLine();
       int N1=str1.length();
       int N2=str2.length();
char a1[]=new char[N1];
char a2[]=new char[N2];
for(int i=0;i<N1;i++)
a1[i]=str1.charAt(i);
for(int i=0;i<N2;i++)
a2[i]=str2.charAt(i);
for(int i=0;i<=(N1-N2);i++)
{
             k=0;
     for(int j=0;j<N2;j++)
    {
             if((a1[i+j])==(a2[j]))
               k++;
     }

             if(k==N2)
             count++;
}
 System.out.println("No_of subString : "+count);
}
}