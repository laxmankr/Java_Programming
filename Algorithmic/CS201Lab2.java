import java.util.*;
import java.lang.*;
public class CS201Lab2 {
	static int[] a=new int[100];
	static int[] b=new int[100];
	static int[] c=new int[100];
	static int top1=0;
	static int top2=0;
	static int top3=0;
	static int size;
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter height of hanoi=");
		size=in.nextInt();
		System.out.println("Enter element");
		for(int i=0;i<size;i++)
		{
			a[top1++]=in.nextInt();
		}
		print();
		int from,to,nof;
		System.out.println("Enter from,to,number of disk move");
		from=in.nextInt();
		to=in.nextInt();
		nof=in.nextInt();
		moveto(from,to,nof);
		print();
	}
	static void moveto(int from,int to,int n)
	{
		if(n==1)
		{
			movedisk(from,to);
		}
		else
		{if(from==1&&to==3)
		{
			moveto(1,2,n-1);
			c[top3++]=a[top1--];
			moveto(2,3,n-1);
			}
		else if(from==1&&to==2)
			{
				moveto(1,3,n-1);
				b[top2++]=a[top1--];
				moveto(3,2,n-1);
				}
		else
			if(from==2&&to==1)
			{
				moveto(2,3,n-1);
				b[top2++]=a[top1--];
				moveto(3,2,n-1);
				}
			else
				if(from==2&&to==3)
				{
					moveto(2,1,n-1);
					a[top1++]=b[top2--];
					moveto(1,3,n-1);
					}
				else
					if(from==3&&to==1)
					{
						moveto(3,2,n-1);
						a[top1++]=c[top3--];
						moveto(2,1,n-1);
						}
					else
						if(from==3&&to==2)
						{
							moveto(3,1,n-1);
							b[top2++]=c[top3--];
							moveto(1,2,n-1);
							}
		}
		return;
	}
	static void movedisk(int from,int to)
	{
		if(from==1&&to==3)
			c[top3++]=a[top1--];
		else if(from==1&&to==2)
			b[top2++]=a[top1--];
		else if(from==2&&to==1)
			a[top1++]=b[top2--];
		else if(from==2&&to==3)
			c[top3++]=b[top2--];
		else if(from==3&&to==1)
			a[top1++]=c[top3--];
		else if(from==3&&to==2)
			b[top2++]=c[top3--];
	}
	static void print()
	{
		System.out.print("\na=");
		for(int i=0;i<(top1);i++)
		System.out.print(a[top1--]);
		System.out.print("\nb=");
		for(int i=0;i<(top2);i++)
		System.out.print(b[top2--]);
		System.out.print("\nc=");
		for(int i=0;i<(top3);i++)
		System.out.print(c[top3--]+"\n");
	}

}
