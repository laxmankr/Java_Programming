import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;
public class palindrome
{
public static void main(String[] args)
{
Scanner kbd=new Scanner(System.in);
String name;
System.out.print("Enter string=");
name=kbd.nextLine();
StringBuffer reverse=new StringBuffer().reverse();
name=reverse.toString();
System.out.print(name);
}
}
