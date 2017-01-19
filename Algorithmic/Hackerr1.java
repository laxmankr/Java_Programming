import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hackerr1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        int N=in.nextInt();
        int min=3;
        int A[]=new int[N];
        int a[][]=new int[T][2];
        for(int i=0;i<N;i++)
            A[i]=in.nextInt();
        for(int i=0;i<T;i++)
            {
            a[i][0]=in.nextInt();
            a[i][1]=in.nextInt();
        }
        for(int i=0;i<T;i++)
            {
            for(int j=a[i][0];j<=a[i][1];j++)
                {
                if(A[j]<min)
                    min=A[j];
            }
            System.out.println(min);
            min=3;
        }
    }
}