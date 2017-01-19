/*1. Write a program in java to find whether a string taken as input from user
is a palindrome or not.*/


import java.util.*;
import java.io.*;
import java.lang.*;
class chekpalindrome
      {
               static    int k=0;
            public static void main(String[] args){
            Scanner in=new Scanner(System.in);
           String str;
                 System.out.print("Enter string : ");
            str=in.nextLine();
            int len=str.length();
 System.out.println("string str lenggth="+len);
           char array1[]=new char[len];
            char array2[]=new char[len];       
          for(int i=0;i<len;i++)
                {
              array1[i]=str.charAt(i);
              array2[i]=str.charAt(len-1-i);
             }  
                                             System.out.print("String1=");
                                      for(int i=0;i<len;i++)
                                        System.out.print(array1[i]);
                                         System.out.println();
     System.out.print("String2="); 
     for(int i=0;i<len;i++)
     System.out.print(array2[i]);
     System.out.println();

     for(int i=0;i<len;i++){
       if(array1[i]==array2[i])
             k++;
                    }
     System.out.println("No of match charecter="+k);
if(k==len)
    System.out.println("string is palindrome");
else 
          System.out.println("string is Not  palindrome");
     }
}