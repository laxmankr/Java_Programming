/*17. Write a program in java to take as input a full name, and then replace all
the vowels in the string with the next character in alphabetical order*/

import java.util.*;
import java.io.*;
import java.lang.*;
 public  class Replacechar17
{ 
       public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       String str1,str2="";
System.out.print("Enter string : ");
       str1=in.nextLine();
 System.out.println("Enter string is : "+str1);
       int N=str1.length();
char array[]=new char[N];
         for(int i=0;i<N;i++){
              array[i]=str1.charAt(i);
                       }
for(int i=0;i<N;i++)
{
 switch(array[i]){
case 'a':array[i]='b';break;
case 'A':array[i]='B';break;
case 'e':array[i]='f';break;
case 'E':array[i]='F';break;
case 'i':array[i]='j';break;
case 'I':array[i]='J';break;
case 'o':array[i]='p';break;
case 'O':array[i]='P';break;
case 'u':array[i]='v';break;
case 'U':array[i]='V';break;
default:break;
}
}
 for(int i=0;i<N;i++){
              str2=str2+array[i];
                       }
 System.out.println("Modifyed string is : "+str2);
      }   
}