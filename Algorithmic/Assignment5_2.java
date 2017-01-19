import java.util.*;
import java.lang.*;
class Assignment5_2
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
	System.out.print("Enter length of List=");
	int N=in.nextInt();
	int A[]=new int[N];
	int B[]=new int[N];
	for(int i=0;i<N;i++)
	A[i]=in.nextInt();
if(N%2==0)
{
	for(int i=0;i<N;i++)
	if(i<(N/2))
	B[i]=A[(N/2)-1-i];
	else
	B[i]=A[N+(N/2)-1-i];
}
else
{
	for(int i=0;i<N;i++)
	if(i<(N/2))
	B[i]=A[(N/2)-1-i];
	else if(i>(N/2))
	B[i]=A[N+(N/2)-i];
	else
	B[i]=A[i];
}
System.out.println("encrypt List is");
for(int i=0;i<N;i++){
System.out.print(B[i]);
if(i<N-1)
System.out.print(" ->");
}
}
}