class shapes
{
	double area;
	double perimeter;
	void Area(){}
	void perimtr(){} 
}
class Rect extends shapes
{
	int length;
	int breadth;
Rect(int x,int y)
{
	length=x;
	breadth=y;
}
void Area(){
	this.area=(double) (length*breadth);
}
void perimtr(){
	this.perimeter=2*(length+breadth);
}
}
class circle extends shapes
{
	int radius;
	
circle(int x)
{
	radius=x;
	
}
void Area(){
	this.area=(double) (3.14*radius*radius);
}
void perimtr(){
	this.perimeter=2*3.14*radius;
}
}
public class Geo
{
public static void main(String[] args){
ArrayList<shapes> shap=new ArrayList<shapes>();
Rect r1=new Rect(10,20);
Rect r2=new Rect(5,6);
circle c1=new circle(4);
circle c2=new circle(10);
r1.Area();r2.Area();c1.Area();c2.Area();
r1.perimtr();r2.perimtr();c1.perimtr();c2.perimtr();
shap.add(r1);
shap.add(r2);
shap.add(c1);
shap.add(c2);
System.out.println("\n\n"+shap);
}
}