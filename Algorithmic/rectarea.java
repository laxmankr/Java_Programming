import java.util.*;
import java.io.*;
class Rectangle
{
	int length;
	int width;
void takedata(int x,int y)
{
	length=x;
	width=y;
}
int rectArea()
{
	int area=length*width;
	return(area);
}
}
class rectarea
{
public static void main(String args[]){
Rectangle rect1=new Rectangle();
Rectangle rect2=new Rectangle();
rect1.length=10;
rect1.width=15;
int area1=rect1.length*rect1.width;
rect2.takedata(12,20);
int area2=rect2.rectArea();
System.out.println("Area1="+area1);
System.out.println("Area2="+area2);
}
}