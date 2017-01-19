/*19. Write a program in java to find Floyd triangle till a given range of input.*/


import java.util.*;
import java.io.*;
import java.lang.*;
public class Floydtriangle
{
       public static void main(String args[]){
    Scanner in=new Scanner(System.in);
System.out.print("Enter number of Rows in floyd trianggle=");
   int N=in.nextInt();
int k=1;
System.out.print("Floyd Triangle is !\n");
 System.out.print(" ");
   for(int i=0;i<N;i++){
       for(int j=0;j<=i;j++)
 {
       System.out.print(k+" 	");
       k++;
 }
 System.out.print("\n ");
}
}}