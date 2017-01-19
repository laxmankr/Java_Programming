import java.util.*;
import java.lang.*;
import java.io.*;
class Lab5_2
{
public static void main(String args[])
{
Random randNo=new Random();
Scanner in=new Scanner(System.in);
System.out.print("enter No.of person=");
int N=in.nextInt();
ArrayList<P> obj=new ArrayList<P>();

String name=in.next();
obj.add(name,randNo.nextInt(N));
}

}
}
class P
{
int rank;
String name;
P(String n,int r)
{
name=n;
rank=r;
}

}