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
	void insert(int key){
		Node t=new Node(key);//Creat new Node
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
	void mergSort(){
		Node temp=head;
		int j=0;
		while(temp!=null){
			j++;
			temp=temp.right;
		}
		mergsort(0,j-1);
	}
	void mergsort(int l,int r){//recursion methode for sorting
		if(r<=l)return;
			int m=l+(r-l)/2;
		mergsort(l,m);
		mergsort(m+1,r);
		merg(l,m,r);
	}
	void merg(int l,int m,int r){//merging method start
		int i=0,j=0;
		int k=0;
		int n1=m-l+1;
		int n2=r-m;
		Node t1;
		Node t2;
		Node temp=head;
		for(i=0;i<l;i++){
			temp=temp.right;
		}
		t1=temp;
		temp=head;
		for(i=0;i<(m+1);i++){
			temp=temp.right;
		}
		t2=temp;
		int[] a1=new int[m-l+1];//create two array 
		int[] a2=new int[r-m];
		for(i=0;i<(m-l+1);i++){
			a1[i]=t1.data;
			t1=t1.right;
		}
		for(j=0;j<(r-m);j++){
			a2[j]=t2.data;
			t2=t2.right;
		}
		temp=head;
		for(i=0;i<l;i++){
			temp=temp.right;
		}
		i=0;
		j=0;
		while(i<(m-l+1)&&j<(r-m)){
			if(a1[i]<=a2[j]){
				temp.data=a1[i];//modification in data of Node
				temp=temp.right;
				i++;
			}
			else {
				temp.data=a2[j];//modification in data of Node
				temp=temp.right;
				j++;
			}
		}
		while(i<(m-l+1)){
			temp.data=a1[i];//modification in data of Node
			temp=temp.right;
			i++;
		}
		while(j<(r-m)){
			temp.data=a2[j];//modification in data of Node
			temp=temp.right;
			j++;
		}
	}
	void display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.right;
		}
		System.out.println("");
	}
	void displayrev(){//display in revers order
		Node temp=tel;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.left;
		}
		System.out.println("");
	}
}
class Lab9_MergSort{
	public static void main(String[] args){
		System.out.println("***************************************************************");
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Input According to Question : ");
		ArrayList<Integer> A=new ArrayList<Integer>();
		File file=new File("Mergsort.txt");//Create File
		String sr;
		try{
			FileWriter fw=new FileWriter(file);//write into File
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
		obj.mergSort();
		System.out.print("Output (Sorted)  is : ");
		obj.display();
		System.out.println("***************************************************************");
	}
}