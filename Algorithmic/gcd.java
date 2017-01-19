/*12.Write a recursive program in java to find the gcd of three numbers.*/

import java.util.*;
import java.io.*;
class gcd
{
public static void main(String args[]){
  Scanner in=new Scanner(System.in);
  System.out.println("Enter 3 Integer");
  int a=in.nextInt();
  int b=in.nextInt();
  int c=in.nextInt();
  int d=gcdf(a,b);
  int e=gcdf(c,d);
System.out.println("gcd="+e);
     }
static int gcdf(int m,int n)
{
       if(m==n)
       return m;
else {
while(m!=n){
        if(m>n)
       m=m-n;
else
       n=n-m;
            }
return m;
}
}
}