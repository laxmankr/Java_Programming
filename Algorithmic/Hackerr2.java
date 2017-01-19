import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hackerr2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            a[i][j]=in.nextInt();
 for(int i=0;i<n;i++)
{
            for(int j=0;j<n;j++){
             System.out.print(a[i][j]);
}
	 System.out.print("\n");
}
             for(int i=0;i<n;i++)
        {
            if(i==0)
                for(int k=0;k<n;k++)
                 System.out.print(a[i][k]);
              else  if(i>0&&i<n-1)
{
 System.out.print(a[i][0]);
            for(int j=1;j<n-1;j++)
            {
                
            if(a[i][j]>a[i-1][j]&&a[i][j]>a[i+1][j]&&a[i][j]>a[i][j+1]&&a[i][j]>a[i+1][j-1])
                System.out.print("X");
            else
                System.out.print(a[i][j]);
        }
 System.out.print(a[i][n-1]);
}
         else{
                 for(int k=0;k<n;k++)
                 System.out.print(a[i][k]); 
         }
 System.out.print("\n");
        }
    }
}