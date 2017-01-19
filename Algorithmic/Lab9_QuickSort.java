import java.util.*;
import java.io.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int key){
		data=key;
	}
	void setdata(int key){
		this.data=key;
	}
	int getdata(){
		return this.data;
	}
}
class Quick{
	int nos=0;
	Node head;
	Node tel;
	void insert(int key){//insert() method
		Node t=new Node(key);
		if(head==null){
			head=t;
			tel=t;
		}
		else{
			t.right=head;
			head.left=t;
			head=t;
		}
	}
	void quickSort(){
		recqs(head,tel);
	}
	void recqs(Node p,Node q){//Recursion for QuickSort
		int pivote=q.data;
		int i=0,j=0;
		Node t=head;
		while(t!=p&&t!=null){
			t=t.right;
			i++;
		}
		t=head;
		while(t!=q&&t!=null){
			t=t.right;
			j++;
		}
		if(i>=j)return;
		Node partition=quick(p,q,pivote);
		if(partition.left!=null)
		recqs(p,partition.left);
	if(partition.right!=null)
		recqs(partition.right,q);
	}
	
	Node quick(Node L,Node R,int pivote){//quick method for getting partition 
		Node l=L;
		Node r=R.left;
		int i=0,j=0;
		Node t=head;
		while(t!=L&&t!=null){
			t=t.right;
			i++;
		}
		t=head;
		while(t!=R&&t!=null){
			t=t.right;
			j++;
		}
		j=j-1;
		while(true){
		while(l.data<pivote&&l.right!=null){
		l=l.right;
		i++;
		}
		while(j>0&&r.data>pivote&&r.left!=null){
			r=r.left;
			j--;
		}
			if(i>=j)break;
			else swap(l,r);
		}
		swap(l,R);
		return l;
	}
	void swap(Node a,Node b){//swaping
		nos++;
		int t=a.data;
		a.data=b.data;
		b.data=t;
	}
	void numofswap(){
		System.out.println("Number of swaps is : "+nos);
	}
	void display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.right;
		}
		System.out.println("");
	}
	void displayrev(){
		Node temp=tel;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.left;
		}
		System.out.println("");
	}
}
class Lab9_QuickSort{
	public static void main(String[] args){
		System.out.println("***************************************************************");
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Input According to Question : ");
		ArrayList<Integer> A=new ArrayList<Integer>();
		File file=new File("Quicksort.txt");//Create File
		String sr;
		try{
			FileWriter fw=new FileWriter(file);//Write into File
			BufferedWriter bw=new BufferedWriter(fw);
				sr=in.nextLine();
				bw.write(sr);
			bw.close();
		}catch(Exception e){
			System.out.println("Somthing error in Writting of File : "+e);
		}
		int i=0,j=0,k=0;
		String line;
		String temp;
		
		try{
			FileReader fr=new FileReader(file);//Read from File
			BufferedReader br=new BufferedReader(fr);
			line=br.readLine();
			int length=line.length();
			for(j=1;j<length;j++){
				if(line.charAt(j)==' '||j==(length-1)){
					if(j<length-1)
					temp=line.substring(i,j);
				else{
					temp=line.substring(i,j+1);
				}
				int t=Integer.parseInt(temp);
				A.add(t);
					i=j+1;;
				}
			}
		}catch(Exception e){
			System.out.println("Somthing error in Reading of File : "+e);
		}
		System.out.println("");
		Quick obj=new Quick();
		for(i=0;i<A.size();i++){
			obj.insert(A.get(i));
		}
		System.out.print("Input (Unsorted) is : ");
		obj.displayrev();
		obj.quickSort();
		System.out.print("Output (Sorted)  is : ");
		obj.display();
		obj.numofswap();
		System.out.println("***************************************************************");
	}
}