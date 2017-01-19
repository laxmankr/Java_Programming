/*16.Write a program that reads in from the user an integer (n) between 1000
and 9999. Then it prompts the user to enter an integer (d) between 0
and 9 and a character (c). Your program should first replace the second
and the last digit in (n) with d. Then it should display the character that
precedes (c) followed by the number after the change and then the
character that comes after (c).*/

import java.util.*;
import java.io.*;
import java.lang.*;
public class Reads16
{
static int temp,n,d;
       public static void main(String args[]){
    Scanner in=new Scanner(System.in);
char ch1,ch2;
System.out.print("Enter number  n(1000 to 9999)=");
   n=in.nextInt();
System.out.print("Enter number  d(0 to 9)=");
 d=in.nextInt();
char c='E';
temp=n;
for(int i=0;i<2;i++)
       temp= temp/10;
for(int i=0;i<2;i++){
       temp= temp*10+d;
}
ch1=(char)(((int)c)-1);
ch2=(char)(((int)c)+1);
System.out.println("Modifyed Number="+ch1+temp+ch2);
}
}