/*14. Write a program in java to find out the number of strong numbers in a
range specified by the maximum and minimum number.*/

import java.util.*;
import java.io.*;
import java.lang.*;
public class StrongNo
{
     static int count=0;
       public static void main(String args[]){
    Scanner in=new Scanner(System.in);
System.out.print("Enter First number=");
   int N1=in.nextInt();
System.out.print("Enter End number=");
   int N2=in.nextInt();
for(int i=N1;i<N2+1;i++){
if(i==N2)
System.out.println("\nNo_of strong No="+(count));
int temp=i,fect;
int r=0,sum=0;
  while(temp!=0){
             r=temp%10;
             fect=fectorial(r);
             sum=sum+fect;
            temp=temp/10;
                }
if(i==sum){
count++;
System.out.print("\nStrong No"+(count)+" :"+i);}
        }
}
static int fectorial(int f)
{
if(f==0)
return 1;
else {
return(f*fectorial(f-1));
          }
   }
}