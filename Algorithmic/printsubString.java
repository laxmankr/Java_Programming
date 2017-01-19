/*13. Write a program in java to compare two input strings and find out
whether they have any common substring of length at least 2. You
should print all the common substrings. E.g. Suppose strings are “Apple”
and “Maple”, then you should print “ap”, “ple” and ”le”.*/


import java.util.*;
import java.io.*;
import java.lang.*;
 public  class printsubString
{ 
static int count=0,k, k1,i1,j1; ;
static String str1,str2,str;
       public static void main(String[] args){
       Scanner in=new Scanner(System.in);
   System.out.print("Enter String : ");
       str1=in.nextLine();
 System.out.print("Enter 2nd String : ");
       str2=in.nextLine();
       int N1=str1.length();
       int N2=str2.length();
 System.out.print("Common subString : ");
char a1[]=new char[N1];
char a2[]=new char[N2];
for(int i=0;i<N1;i++)
a1[i]=str1.charAt(i);
for(int i=0;i<N2;i++)
a2[i]=str2.charAt(i);
                                                           
for(int k1=0;k1<N1-1;k1++)
{                                                                   
 for(int i1=0;i1<N1-1-k1;i1++)
 {       count=0;                                                     
        str="";
          for(int j1=0;j1<(k1+2);j1++)
             {
              str=str+a1[(i1+j1)];
             }
for(int i=0;i<=(N2-k1-2);i++)
{                                                                            
             k=0;
     for(int j=0;j<(k1+2);j++)
    {
             if((a2[i+j])==(str.charAt(j)))
               k++;
     }

             if(k==(k1+2))
             count++;
}    
if(count>0)
System.out.print(" "+str+" "); 
 }                                                                        

   }                                                                                                  
}                                                                       
}