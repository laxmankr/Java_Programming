import java.util.*;
import java.io.*;
class Node{
	String id;
	int atime;
	String toft;
	Node next;
	Node(String ID,int Atime,String TOT){
		this.id=ID;
		this.atime=Atime;
		this.toft=TOT;
	}
	int GetAtime(){
		return this.atime;
	}
}
class Queue{
	Node head;
	Node tail;
	int wating=0;
	int ne;
	int[] A;
	String[] B;
	void Transaction(int max){
		A=new int[max];
		B=new String[max];
		ne=0;
	}
	void InsertTD(String name,int time){
		A[ne]=time;
		B[ne]=name;
		ne++;
	}
	void insert(String ID,int Atime,String TOT){
		Node node=new Node(ID,Atime,TOT);
		if(head==null){
			head=node;
			tail=node;
		}
		else{
			tail.next=node;
			tail=node;
		}
	}
	void Output(){
		Node temp=head;
		int i=0;
		int j=0;
		int t=0;
		System.out.println("ID	ArivalTime	TypeofT	ProccesingTime	starttime	EndTime");
		while(temp!=null){
			for(j=0;j<ne;j++){
				if(temp.toft.equals(B[j]))
				   break;
			}
			System.out.print(temp.id+"	"+temp.atime+"		"+B[j]);
			if(i==0){
			System.out.print("		"+A[j]+"	"+temp.atime+"		"+(A[j]+temp.atime));
				t=A[j]+temp.atime;
			}
		else{
			if(temp.atime>t){
			System.out.print("		"+A[j]+"	"+temp.atime+"		"+(A[j]+temp.atime));
				t=A[j]+temp.atime;
				}
			else {
				System.out.print("		"+A[j]+"	"+t+"		"+(A[j]+t));
				wating=wating+(t-temp.atime);
				t=A[j]+t;
			}
		}
			i++;
			temp=temp.next;
			System.out.println("");
		}
		System.out.println("Wating time in FIFO : "+(wating/i));
	}
}
class assign9Q1{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Queue obj=new Queue();
		System.out.print("Enter Number of Transaction Transaction type : ");
		int M=in.nextInt();
		System.out.println("Enter Transaction details : ");
		obj.Transaction(M);
		int n;
		String str;
		String str1;
		String str2;
		for(int i=0;i<M;i++){
			System.out.print("Enter Transaction Type(String)  : ");
			str=in.next();
			System.out.print("Enter Proccesing  Time (int)    : ");
			n=in.nextInt();
			obj.InsertTD(str,n);
		}
		System.out.print("Enter Number of Records of Customer : ");
		int N=in.nextInt();
		System.out.println("Enter Customer details : ");
		for(int i=0;i<N;i++){
			System.out.print("ID(String)               : ");
			str1=in.next();
			System.out.print("Arival Time(int)         : ");
			n=in.nextInt();
			System.out.print("Transaction time(String) : ");
			str2=in.next();
			obj.insert(str1,n,str2);
		}
		obj.Output();
	}
}