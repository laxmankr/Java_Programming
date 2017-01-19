import java.io.*;
import java.util.*;
class adderessbook
{
String name;
String  addr;
String telno;
adderessbook(String n,String a,String t)
{
name=n;
addr=a;
telno=t;
}
public void addentries()
{
Scanner in=new Scanner(System.in);
name=in.nextLine();
addr=in.nextLine();
telno=in.nextLine();
}
public  void printentries()
{
System.out.println("Name is "+name);
System.out.println("Adderess is "+addr);
System.out.println("Telno is "+telno);
System.out.println("\n");
}
}
public class Adderess
{
public static void main(String [] args)
{
adderessbook [] addbook=new adderessbook[5];
for(int i=0;i<5;i++)
{
addbook[i].addentries();
}
for(int i=0;i<5;i++)
{
addbook[i].printentries();
}
}
}