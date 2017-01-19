import java.util.*;
import java.io.*;
class Node{
	int data;
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
class tree{
	Node root;
	Node rootm;
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
	}
	void insert_mirror(int key){
		Node node=new Node(key);
		if(rootm==null){
			rootm=node;
		}
		else{
			Node temp=rootm;
			Node parent=rootm;
			boolean b=true;
			while(temp!=null){
				parent=temp;
				if(temp.getdata()>key){
					temp=temp.right;
					b=false;
				}
				else {
					temp=temp.left;
					b=true;
				}
			}
			if(b)parent.left=node;
			else parent.right=node;
		}
	}void displayLevel(Node N){
		ArrayList<Node> ar1=new ArrayList<Node>();
		int rear=0;
		int front=0;
		Node t=null;
		ar1.add(N);
		rear++;
		while(true){
			if(ar1.get(front)!=null){
			t=ar1.get(front);
			if(t.left!=null){
			ar1.add(t.left);
			rear++;
			}
		else {
		ar1.add(null);
		rear++;
		}
		    if(t.right!=null){
			ar1.add(t.right);
			rear++;
			}
		else {
			ar1.add(null);
			rear++;
		}
			}
			front++;
			if(front==ar1.size())break;
		}
		int k=0;
		int sum=0;
		System.out.println("LevelOrder : ");
		for(int i=0;i<ar1.size();i++){
			if(ar1.get(i)!=null)
			System.out.print(ar1.get(i).data+" ");
		else System.out.print("");
			if(i==sum){
				System.out.println("");
				if(k==0)
					k++;
				sum=sum+k*2;
				k=k*2;
			}
		}
		System.out.println("");
	}
}
class Endsem_Q1{
	public static void main(String[] args){
		System.out.println("***************************************************************");
		tree obj=new tree();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Input in file Space seperated : ");
		ArrayList<Integer> A=new ArrayList<Integer>();
		File file=new File("EndSem.txt");
		String sr;
		try{
			FileWriter fw=new FileWriter(file);
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
			FileReader fr=new FileReader(file);
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
		int l=A.size();
		for(i=0;i<l;i++){
			obj.insert(A.get(i));
		}
		for(i=0;i<l;i++){
			obj.insert_mirror(A.get(i));
		}
		System.out.println("\nLevelOrder for MainTree: \n");
		obj.displayLevel(obj.root);
		System.out.println("\nLevelOrder for MirrorTree : \n");
		obj.displayLevel(obj.rootm);
		System.out.println("***************************************************************");
	}
}