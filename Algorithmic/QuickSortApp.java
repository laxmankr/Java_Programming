import java.util.*;
import java.io.*;
import java.lang.*;
class Quick{
	private int ne;
	private long[] A;
	Quick(int max){
		A=new long[max];
		ne=0;
	}
	void insert(long d){
		A[ne]=d;
		ne++;
	}
	void display(){
		System.out.print("A : ");
		for(int i=0;i<ne;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	void QuickSort(){
		recSorting(0,ne-1);
	}
	void recSorting(int left,int right){
		if((right-left)<=0)
			return;
		else{
		long pivote=A[right];
		int partition=quickmethod(left,right,pivote);
		recSorting(left,partition-1);
		recSorting(partition+1,right);
		}
	}
	int quickmethod(int left,int right,long pivote){
		int lptr=left-1;
		int rptr=right;
		while(true){
			while(A[++lptr]<pivote);
			while(rptr>0&&A[--rptr]>pivote);
			if(lptr>=rptr)break;
			else swap(lptr,rptr);
		}
		swap(lptr,right);
		return lptr;
	}
	void swap(int a,int b){
		long t=A[a];
		A[a]=A[b];
		A[b]=t;
	}
}
class QuickSortApp{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Quick k;
		System.out.print("Enter MaxSize : ");
		int N=in.nextInt();
		k=new Quick(N);
		for(int i=0;i<N;i++){
			k.insert(in.nextLong());
		}
		/*for(int i=0;i<N;i++){
			long T=(long) (java.lang.Math.random()*99);
			k.insert(T);
		}*/
		System.out.println("Befor sorting : ");
		k.display();
		System.out.println("After sorting : ");
		k.QuickSort();
		k.display();
	}
}