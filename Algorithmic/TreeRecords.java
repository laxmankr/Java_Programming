import java.util.*;
import java.io.*;
class Node{
	double data;
	int id;
	int age;
	String name;
	double cpi;
	Node left;
	Node right;
	Node(double k,int a,int i,String n,double c){
		this.data=k;
		this.age=a;
		this.id=i;
		this.name=n;
		this.cpi=c;
	}
}
class BST{
	Node root;
	double Age_Sum=0.0;
	int count=0;
	void insert(int com,double key,int a,int i,String n,double c){
		System.out.println("Record is inserted with "+com+" comparision.");
		Age_Sum+=a;
		count++;
		Node node=new Node(key,a,i,n,c);
		if(root==null){
			root=node;
		}
		else{
			Node temp=root;
			Node parent=root;
			boolean b=true;
			while(temp!=null){
				parent=temp;
				if(temp.data>key){
					temp=temp.left;
					b=false;
				}
				else {
					temp=temp.right;
					b=true;
				}
			}
			if(b)parent.right=node;
			else parent.left=node;
		}
		display();
	}
	void delete(){
		Node temp=root;
		Node parent=root;
		if(root==null)
			System.out.println("Nothig to display.");
		else{
			while(temp.left!=null){
			parent=temp;
			temp=temp.left;
		}
		if(root.left==null)root=root.right;
		else if(temp.left==null&&temp.right!=null){
			parent.left=temp.right;
		}
		else{
			parent.left=null;
		}
		System.out.println("The list of students after deletion is : ");
		display();
		}
	}
	void display(){
		if(root!=null)
		print(root);
	else System.out.println("Nothig to display.");
		System.out.println("");
	}
	void print(Node t){
		if(t==null)return;
		System.out.print("Student {Name="+t.name);
		System.out.print(", Age="+t.age);
		System.out.print(", CPI="+t.cpi);
		System.out.print("}\n");
		print(t.left);
		print(t.right);
	}
	void printNode(Node t){
		System.out.print("Student {Name="+t.name);
		System.out.print(", Age="+t.age);
		System.out.print(", CPI="+t.cpi);
		System.out.print("}\n");
	}
	void AverageAge(){
		if(root!=null)
		System.out.print("AverageAge of students : "+(Age_Sum/count));
	else
		System.out.print("AverageAge of students : "+0);
	}
	void HighestCPI(){
		Node temp=root;
		Node parent=root;
		while(temp!=null){
			printNode(temp);
			parent=temp;
			temp=temp.right;
		}
		if(root==null){
			System.out.println("There is no record so no CPI found.");
		}
	}
}
class TreeRecords{
	public static void main(String[] args){
		System.out.println("***************************************************************");
		Scanner in=new Scanner(System.in);
		int c=0;
		BST obj=new BST();
		boolean b=true;
		while(b){
System.out.println("\nEnter the operation which you want to ");
System.out.print("perform (1.Insertion 2.Deletion 3.AverageAge \n4.Highest CPI 5.Exit) : ");
int N=in.nextInt();
switch(N){
	case 1:{
		System.out.print("Enter Name : ");
		String nm=in.next();
		System.out.print("Enter Age : ");
		int A=in.nextInt();
		System.out.print("Enter CPI : ");
		double cp=in.nextDouble();
		int a=(int) (java.lang.Math.random()*99);
		double key=cp;
		obj.insert(c++,key,A,a,nm,cp);
	};break;
	case 2:{
		obj.delete();
	};break;
	case 3:{
		obj.AverageAge();
	};break;
	case 4:{
		obj.HighestCPI();
	};break;
	case 5:{
	System.out.println("Program exited.");
	b=false;
	};break;
	default:System.out.println("Somthing Error!");break;
}
		}
		System.out.println("***************************************************************");
	}
}
