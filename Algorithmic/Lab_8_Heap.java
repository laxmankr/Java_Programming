import java.util.*;
class Node{
	private int data;
	Node left;
	Node right;
	Node(int key){
		data=key;
	}
	int getvalue(){
		return data;
	}
	void setvalue(int k){
		data=k;
	}
}
class tree{
	ArrayList<Node> ar=new ArrayList<Node>();
	private static int rear=0;
	private Node root;
	void insert(int key){
		Node node=new Node(key);
		if(root==null){
			root=node;
		ar.add(root);
		rear++;
		}
		else{
			Node temp=serp();
			if(temp.left==null){
				temp.left=node;
			ar.add(node);
			}
			else{
				temp.right=node;
			ar.add(node);
			}
			swapup(rear);
			rear++;
		}
	}
	void swapup(int r){
		int parent=(r-1)/2;
		Node node=ar.get(r);
		while(r>0&&node.getvalue()<ar.get(parent).getvalue()){
			ar.set(r,ar.get(parent));
			r=parent;
			parent=(r-1)/2;
		}
		ar.set(r,node);
	}
	Node serp(){
		ArrayList<Node> arr=new ArrayList<Node>();
		int re=-1;
		int front=0;
		Node temp=root;
		re++;
		while(temp.left!=null&&temp.right!=null){
			front++;
			arr.add(temp.left);
			re++;
			arr.add(temp.right);
			re++;
			temp=arr.get(front);
		}
		return temp;
	}
	void Serch(int key){
		int l=0;
		for(Node n:ar){
			l++;
			if(n.getvalue()==key){
				System.out.println("Key is Found !");
				break;
			}
			if(l==ar.size())
				System.out.println("Key is Not Found !");
		}
	}
	void display(){
		System.out.println("Print in level Order traversal : ");
		for(Node n:ar){
				System.out.print(n.getvalue()+" ");
			}
			System.out.println("\n");
	}
}
class Lab_8_Heap{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		tree t=new tree();
		t.insert(2);
		t.insert(5);
		t.insert(8);
		t.insert(7);
		t.insert(6);
		t.insert(9);
		t.insert(12);
		t.insert(14);
		t.insert(16);
		t.insert(15);
		t.insert(18);
		t.insert(1);
		t.display();
		System.out.println("Enter i-->>insert");
		System.out.println("Enter s-->>serch");
		System.out.println("Enter d-->>display");
		System.out.println("Enter e-->>exit");
		while(true){
			System.out.print("\nEnter choice : ");
			String str=in.next();
			char c=str.charAt(0);
			switch(c){
				case 'i':{
					System.out.print("Enter data(int) : ");
					int data=in.nextInt();
					t.insert(data);
				};break;
				case 's':{
					System.out.print("Enter data(int) : ");
					int data=in.nextInt();
					t.Serch(data);
				};break;
				case 'd':{
					t.display();
				};break;
				case 'e':{
					System.exit(0);
				};break;
				default:System.out.println("Invalid Input!");
			}
		}
	}
}