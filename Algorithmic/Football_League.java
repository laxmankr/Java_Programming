import java.io.*;
import java.util.*;
import java.lang.*;
public class Football_League
{
	static int A[][];
	static int t[];
	static int N;
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
System.out.print("\n***********************************************************************\n");
	System.out.print("Enter Number of team=");
	N=in.nextInt();
	A=new int[N][4];
	t=new int[4];
System.out.print("-------------------------------------------------------\n");
System.out.println("for_goal, against_goal & points for.......");
	for(int i=0;i<N;i++){
System.out.println("________"+"team"+(int) (i+1)+"_________");
	for(int j=0;j<4;j++)
{
	if(j==0)
	A[i][j]=i+1;
else
	A[i][j]=in.nextInt();
}
                }
System.out.print("-------------------------------------------------------\n");
System.out.println("Teams are..");
System.out.print("team  forgoal  aginst-goal  points\n");
for(int i=0;i<N;i++){
System.out.print("team");
for(int j=0;j<4;j++)
System.out.print(A[i][j]+"	    ");
System.out.print("\n");
                                 }
System.out.print("-------------------------------------------------------\n");
System.out.print("________________________________________________\n");
int w=1;
while(w==1){
System.out.print("1.->>List a/c to points/for_goal/against_goal\n");
System.out.print("2.->>Team in Range with points\n");
System.out.print("3.->>Exit\n");
System.out.print("\nEnter choice=");
int n=in.nextInt();
switch(n){
	case 1:Listall();break;
	case 2:{
	System.out.print("Enter Range of points=");
	int a=in.nextInt();
	int b=in.nextInt();
	Points_in_range(a,b);
};break;
	case 3:{w=n;
System.out.print("\n**********************************************************************\n");
};break;
	default:System.out.print("Sorry! Enter choice wrong.\n");
}
    }}
static void Listall()
{
	for(int i=0;i<N;i++)
{
	int temp=A[i][3];
	int j;
	for(j=i+1;j<N;j++)
{
if(A[j][3]==A[i][3])
	{
	if(A[j][1]==A[i][1])
	{
	if(A[j][2]<A[i][2])
	{
	t=A[i];
	A[i]=A[j];
	A[j]=t;
	}
	}
else  if(A[j][1]>A[i][1])
 {	t=A[i];
	A[i]=A[j];
	A[j]=t;
}
	}
else        if(A[j][3]>A[i][3])
	{
	t=A[i];
	A[i]=A[j];
	A[j]=t;
	}
}
}
System.out.print("-------------------------------------------------------\n");
System.out.print("team  for-goal  aginst-goal  points\n");
for(int i=0;i<N;i++){
System.out.print("team");
for(int j=0;j<4;j++)
System.out.print(A[i][j]+"	    ");
System.out.print("\n");
                                 }
System.out.print("-------------------------------------------------------\n");
}
static void Points_in_range(int x,int y)
{
System.out.print("-------------------------------------------------------\n");
System.out.print("teams................points\n");
        for(int i=0;i<N;i++)
        if(A[i][3]>=x&&A[i][3]<=y)
        System.out.println("team"+A[i][0]+"	 "+"for_goal="+A[i][3]+"	"+"Against_goal="+A[i][3]+"	"+"points="+A[i][3]);
System.out.print("-------------------------------------------------------\n");
}
}
