/*4. Write a program in java to sort an array of integers in an efficient
manner.*/

import java.util.*;
import java.io.*;
import java.lang.*;
public class short4
{
       public static void main(String args[]){
      int a[]=new int[100];
      int temp;
      Scanner in=new Scanner(System.in);
       System.out.print("Enter sizeof Array=");
         int size=in.nextInt();
System.out.print("Enter elements of array:\n");
       for(int i=0;i<size;i++)
            a[i]=in.nextInt();//-----------------------intialization
System.out.print("Initially array is:-\n");
for(int i=0;i<size;i++)         //---------------intial array
 System.out.print(" "+a[i]+" ");
                                            //----------------shorting
            for(int i=0;i<size;i++)
               for(int j=i+1;j<size;j++)
               if(a[i]>a[j]){
                        temp=a[i];
                         a[i]=a[j];
                      a[j]=temp;
                                   }
 System.out.print("\nShorted  Array :-\n");
for(int i=0;i<size;i++)         //---------------printing array
 System.out.print(" "+a[i]+" ");
         }
}