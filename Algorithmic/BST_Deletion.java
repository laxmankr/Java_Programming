import java.util.*;
import java.io.*;
import java.lang.*;
class Node{
	private int data;
	Node left;
	Node right;
	Node(int key){
		this.data=key;
	}
	void setdata(int key){
		this.data=key;
	}
	int getdata(){
		return this.data;
	}
}
class BST{
	Node root;
	Node P;
	void insert(int key){
		Node node=new Node(key);
		if(root==null){
			root=node;
		}
		else{
			Node temp=root;
			Node parent=root;
			boolean b=true;
			while(temp!=null){
				parent=temp;
				if(temp.getdata()>key){
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
	}
	void display(){
		System.out.print("Print in PreOrder : ");
		print(root);
		System.out.println("");
	}
	void print(Node e){
		if(e==null)return;
		System.out.print(e.getdata()+" ");
		print(e.left);
		print(e.right);
	}
	void Delete(int key,Node node){
		Node temp=node;
		Node parent=node;
		boolean b=true;
		while(temp!=null){
			if(temp.getdata()==key){
				break;
			}
			else if(temp.getdata()>key){
				parent=temp;
				temp=temp.left;
				b=true;
			}
			else if(temp.getdata()<key){
				parent=temp;
				temp=temp.right;
				b=false;
			}
		}
		Node e=temp;
		if(temp!=null){
			System.out.println("Deleted element is : "+temp.getdata());
			if(e.left==null&&e.right==null){
			if(b)
				parent.left=null;
			else parent.right=null;
			System.out.println("Deleted Node having Nochid");
		}
		else if((e.left==null&&e.right!=null)||(e.left!=null&&e.right==null)){
			if(b){
				if(e.left==null)
					parent.left=e.right;
				else parent.left=e.left;
			}
			else{
				if(e.left==null)
					parent.right=e.right;
				else parent.right=e.left;
			}
			System.out.println("Deleted Node having Onechid");
		}
		else{
				Node s=findsuccesor(temp.right);
				System.out.println("Succsesor : "+s.getdata());
				System.out.println("Deleted Node having twochid ");
				int k=s.getdata();
				temp.setdata(s.getdata());
				if(s==temp.right){
					temp.right=s.right;
				}
				else{
					parent=FindP(temp.right);
					parent.left=s.right;
				}
		    }
		}
		else{
			System.out.println("Deleted element is Not Found!");
		}
	}
	Node FindP(Node e){
		Node parent=e;
		while(e.left!=null){
			parent=e;
			e=e.left;
		}
		return parent;
	}
	Node findsuccesor(Node e){
		Node parent=e;
		while(e!=null){
			parent=e;
			e=e.left;
		}
		return parent;
	}
}
class BST_Deletion{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		BST bst=new BST();
		int a=0,j=0;
		System.out.println("***************************************************************");
		System.out.print("Enter Number of Nodes : ");
		int N=in.nextInt();
		System.out.println("Enter input : ");
		for(int i=0;i<N;i++){
			//a=(int) (java.lang.Math.random()*99);
			//if(i==N/2)j=a;
			a=in.nextInt();
			bst.insert(a);
		}
		System.out.println("");
		System.out.print("Enter element for deleting : ");
		j=in.nextInt();
		bst.display();
		bst.Delete(j,bst.root);
		bst.display();
		System.out.println("***************************************************************");
	}
}