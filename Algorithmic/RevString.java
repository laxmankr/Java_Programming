/*7. Write a program in java to store the reverse of a string*/


import java.util.*;
import java.io.*;
import java.lang.*;
 public  class RevString
{ 
       public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       String str1,str2="";
System.out.print("Enter string : ");
       str1=in.nextLine();
 System.out.println("\nEnter string is : "+str1);
       int N=str1.length();
         for(int i=0;i<N;i++){
               str2=str2+str1.charAt(N-1-i);
                       }
 System.out.print("reverse string is  : ");
 System.out.println(str2);
      }   
}