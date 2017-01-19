/*9. Write a recursive program in java to find the Fibonacci series till a given
input number*/
import java.util.*;
import java.io.*;
import java.lang.*;
public class FibonacciNo
{
      static  int N,t,f=0,s=1;
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number=");
        N=in.nextInt();
 System.out.print(f+" "+s+" ");
       fibonacci(N-2);
}
static void fibonacci(int count)
{ if(count>=0){
                       t=s+f;
                        f=s;
                        s=t;
 System.out.print(s+" ");
                     fibonacci(count-1);}
}
}

