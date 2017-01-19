import java.util.*;
class Node{
	int data;
	Node next;
	void setval(int a){
		data=a;
	}
	int getvalue(){
		return data;
	}
}
class stack{
	Node top;
	Node current;
	stack(){
		top=new Node();
	}
	void push(int a){
		Node n=new Node();
		n.data=a;
		n.next=top;
		top=n;
	}
	int pop(){
		top=top.next;
		return top.data;
	}
}
class assign6a{
	public static void main(String[] args){
		stack s=new stack();
		stack s1=new stack();
		int i,j,k,N1,N2;
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> ar1=new  ArrayList<Integer>();
		ArrayList<Integer> ar2=new  ArrayList<Integer>();
		System.out.print("Enter InOrder sequence (for exit press -999): ");
		int n=0;
		while(n!=(-999)){
			n=in.nextInt();
			if(n!=(-999))
			ar1.add(n);
		}
		for(Integer I:ar1){
			System.out.print(I+" ");
		}
		System.out.print("\n");
		N1=ar1.size();
		int[] A=new int[N1];
		for(i=0;i<N1;i++){
			A[i]=ar1.get(i);
		}
		System.out.print("Enter PreOrder sequence (for exit press -999): ");
		n=0;
		while(n!=(-999)){
			n=in.nextInt();
			if(n!=(-999))
			ar2.add(n);
		}
		N2=ar2.size();
		int[] B=new int[N2];
		for(i=0;i<N2;i++){
			B[i]=ar2.get(i);
		}
		tree(A,B,N2,s);
		int kk;
		for(i=0;i<N1;i++){
			kk=s.pop();
			s1.push(kk);
			System.out.print(kk+" ");
		}
		System.out.print("\n");
		for(i=0;i<N1;i++){
			System.out.print(s1.pop()+" ");
		}
	}
	static void tree(int[] A,int[] B,int size,stack s){
		int[] a=new int[size];
		int[] b=new int[size];
		int l,k,j,i,N,t=0,m=0,o=0;
		N=B.length;
		for(i=0;i<N;i++){
			for(j=0;j<size;j++){
				if(B[i]==A[j]){
					t=1;
					m=j;
					o=i;
					break;
				}
			}
				if(t==1)break;
		}
			
				for(k=0;k<m;k++){
					a[k]=A[k];
				}
				l=0;
				for(k=m+1;k<size;k++,l++){
					b[l]=A[k];
				}
				s.push(B[o]);
				if(m<size-1)
				tree(b,B,size-1-m,s);
				if(m>0)
				tree(a,B,m,s);
	} 
}