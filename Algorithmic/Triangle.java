/*20. Write a program that takes as input three set of (x,y) coordinates. Check
whether these coordinates represent the vertices of a valid triangle. If
not, then prompt the user to provide a fresh set of points. If the triangle
is valid, print the equation of the circle of minimum radius that encircles
the vertices and has center at the centroid of the triangle*/


import java.util.*;
class Triangle
{
static float X=0,Y=0;
static double sum,max=0;
static float Area;
 public static void main(String arga[]){
Scanner in=new Scanner(System.in);
         float x[]=new float[3];
         float y[]=new float[3];
         for(int i=0;i<3;i++)
           {
                   System.out.println("Enter  x"+(i+1)+",y"+(i+1));
                   x[i]=in.nextFloat();
                   y[i]=in.nextFloat();
            }
for(int i=0;i<3;i++)
X+=x[i]/3;
for(int i=0;i<3;i++)
Y+=y[i]/3;
for(int i=0;i<3;i++)
{
sum=Math.sqrt(((X-x[i])*(X-x[i])+(Y-y[i])*(Y-y[i])));
System.out.println("d"+(i+1)+"="+sum);
if(sum>max)
max=sum;
}
Area=(float)  (x[0]*(y[1]-y[2])+x[1]*(y[2]-y[0])+x[2]*(y[0]-y[1]))/2;
if(Area<0)Area=-Area;
   System.out.println("Area="+Area);
int test=0;
while(test!=1){
if(Area>0){  System.out.println("welcome! Triangle formed!");
System.out.print("Equation of Triangle is : ");
System.out.println("(x-"+X+")^2 + (y-"+Y+")^2 ="+(float)(max*max));
test=1;
  }
else {
        System.out.println("Sorry! Triangle is Not possible!");
    for(int i=0;i<3;i++)
           {
                   System.out.println("Enter  x"+(i+1)+",y"+(i+1));
                   x[i]=in.nextFloat();
                   y[i]=in.nextFloat();
            }
  Area=(float)  (x[0]*(y[1]-y[2])+x[1]*(y[2]-y[0])+x[2]*(y[0]-y[1]))/2;
  if(Area<0)Area=-Area;
       }
      }
   }
}