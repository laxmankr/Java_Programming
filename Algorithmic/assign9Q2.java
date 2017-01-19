import java.util.*;
import java.io.*;
class Node{
	String id;
	int atime;
	int PT;
	String toft;
	Node(String ID,int Atime,int P,String TOT){
		this.id=ID;
		this.atime=Atime;
		this.PT=P;
		this.toft=TOT;
	}
	int GetPtime(){
		return this.PT;
	}
}
class Heap{
	int wating=0;
	int F=0;
	int ne;
	int[] ptime;
	String[] tt;
	ArrayList<Node> ar=new ArrayList<Node>();
	int rear=-1;
	void Transaction(int max){
		ptime=new int[max];
		tt=new String[max];
		ne=0;
	}
	void InsertTD(String name,int time){
		ptime[ne]=time;
		tt[ne]=name;
		ne++;
	}
	void insert(String ID,int Atime,String TOT){
		int j=0;
		for(j=0;j<ne;j++){
				if(TOT.equals(tt[j]))
				   break;
			}
		Node node=new Node(ID,Atime,ptime[j],TOT);
		rear++;
		ar.add(node);
		moveup();
	}
	void moveup(){
		int p=(rear-1)/2;
		int ch=rear;
		while(ar.get(p).PT>ar.get(ch).PT&&p>=0){
			swap(p,ch);
			ch=p;
			p=(ch-1)/2;
		}
	}
	
	void swap(int a,int b){
		Node t=ar.get(a);
		ar.set(a,ar.get(b));
		ar.set(b,t);
	}
	void delete(){
		ar.set(0,ar.get(rear));
		rear--;
		movedwon();
	}
	void movedwon(){
		int p=0;
		int ch=(p*2+1);
		while(ch<rear){
			if(ar.get(ch).PT<ar.get(ch+1).PT){
				if(ar.get(p).PT>ar.get(ch).PT){
				swap(p,ch);
				p=ch;
				ch=2*p+1;
				}
				else break;
			}
			else{
				if(ar.get(p).PT>ar.get(ch+1).PT){
				swap(p,ch+1);
				p=ch+1;
				ch=2*p+1;
				}
				else break;
			}
			
		}
	}
	void display(){
		int i=0;
		int f=0;
		System.out.println("ID	ArivalTime	TypeofT	ProccesingTime	starttime	EndTime");
		while(rear>=0){
			Node t=ar.get(0);
			System.out.print(t.id+"	"+t.atime+"		"+t.toft);
			if(i==0){
			System.out.println("		"+t.PT+"	"+t.atime+"		"+(t.atime+t.PT));
			f=t.atime+t.PT;
			}
			else {
				if(f>t.atime){
					System.out.println("		"+t.PT+"	"+f+"		"+(f+t.PT));
					wating=wating+(f-t.atime);
					f=f+t.PT;
				}
				else{
					System.out.println("		"+t.PT+"	"+t.atime+"		"+(t.atime+t.PT));
					f=t.atime+t.PT;
				}
			}
			System.out.println("");
					F++;
				delete();
				i++;
		}
		System.out.println("Wating time in Heap : "+(wating/F));
	}
}
class assign9Q2{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Heap obj=new Heap();
		System.out.print("Enter Number of Transaction Transaction type : ");
		int M=in.nextInt();
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
		System.out.println("Enter Customer details     : ");
		for(int i=0;i<N;i++){
			System.out.print("ID(String)               : ");
			str1=in.next();
			System.out.print("Arival Time(int)         : ");
			n=in.nextInt();
			System.out.print("Transaction time(String) : ");
			str2=in.next();
			obj.insert(str1,n,str2);
		}
		obj.display();
	}
}