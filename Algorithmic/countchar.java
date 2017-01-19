/*3. Write a program in java to count the number of vowels, spaces and
special character in an inputted statement.*/

import java.util.*;
import java.io.*;
import java.lang.*;
 public  class countchar
{ 
       static  int count,k=0;
       public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       String str;
   System.out.print("Enter String : ");
       str=in.nextLine();
       int lth=str.length();
System.out.print("//Length="+lth);
System.out.print("\n");
vowel(str);
int cout1=space(str);
int cout2=specialchar(str);
System.out.println("\nNo_of special charecters="+(cout2-cout1));
}
static int specialchar(String str1)
{
    count=0;
         int n=str1.length();
         char a[]=new char[n];
         for(int i=0;i<n;i++)
          a[i]=str1.charAt(i);
       for(int i=0;i<n;i++)
       {
          if(!((a[i]>=65&&a[i]<=90)||(a[i]>=97&&a[i]<=122)))
             count++;
     }
System.out.println("\nNo_of special charecters+spaces="+(count));
return count;
}
static void vowel(String str1)
{
         count=0;
         int n=str1.length();
         char a[]=new char[n];
         for(int i=0;i<n;i++)
          a[i]=str1.charAt(i);
       for(int i=0;i<n;i++)
       {
             char ch=a[i];
         switch(ch){
               case 'a':
               case 'A':
               case 'e':
               case 'E':
               case 'i':
               case 'I':
               case 'o':
               case 'O':
               case 'u':
               case 'U':count++;break;
           default: ;break;
          }
     }
System.out.println("\nNo_of vowels="+count);
}
static int space(String str1)
{
    count=0;
         int n=str1.length();
         char a[]=new char[n];
         for(int i=0;i<n;i++)
          a[i]=str1.charAt(i);
       for(int i=0;i<n;i++)
       {
           if(a[i]==' ')
            count++;
     }
System.out.println("\nNo_of Space="+count);
return count;
}
}