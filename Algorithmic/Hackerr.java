import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hackerr {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String t1=new String();
        int n1,n2,r;
        String str="";
        t1=in.nextLine();
        if(t1.charAt(8)=='a'||t1.charAt(8)=='A')//Midnight is 12:00:00AM or 00:00:00 and 12 Noon is 12:00:00PM.
        {
             str=str+t1.charAt(0);
             str=str+t1.charAt(1);
            n1=Integer.parseInt(str);
            if(n1==12){
                System.out.print("00");
                 for(int i=2;i<8;i++)
                System.out.print(t1.charAt(i));
            }
            else  
            for(int i=0;i<8;i++)
                System.out.print(t1.charAt(i));
        }
            else
        {
            str=str+t1.charAt(0);
             str=str+t1.charAt(1);
            n1=Integer.parseInt(str);
             r=n1+12;
	if(n1==12){
         System.out.print(n1);
 for(int i=2;i<8;i++)
                System.out.print(t1.charAt(i));
}
else{
             System.out.print(r);
            for(int i=2;i<8;i++)
            System.out.print(t1.charAt(i));
}
        }
    }
}