//2. Write a program in java to find out the number of duplicate characters in a given string,
// when the string is taken as input from user

import java.util.*;
import java.io.*;
import java.lang.*;
 public  class duplicatechar
{ 
       static  int count=0,k=0;
       public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       String str;
   System.out.print("Enter String : ");
       str=in.nextLine();
       int lth=str.length();
System.out.print("//Length="+lth);
System.out.print("\n");
       char array[]=new char[lth];
            for(int i=0;i<lth;i++)
            array[i]=str.charAt(i);

 for(int i=0;i<lth;i++)
{
             for(int j=i+1;j<lth;)
               {
                      if(array[i]==array[j])
                     {
                       k++;
                        for(int m=j;m<lth-1;m++)
                        array[m]=array[m+1];
                         lth--;
                    }
                        else j++;
            }
for(int p=i+1;p<lth;p++)
   System.out.print(array[p]+"  ");
        System.out.print("//"+array[i]+"="+(k+1)+"\n");
        if(k>0)
        count++;
        k=0;
 }
System.out.print("\n\nNumber of Duplicate charecter="+count);
         }
}