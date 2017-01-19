class Node{
	String name;
	String dob;
	String parents;
	String child;
	String cont;
	int key;
	Node left;
	Node right;
	Node(String n,String d,String p,String c,String co,int k){
		this.name=n;
		this.dob=d;
		this.parents=p;
		this.child=c;
		this.cont=co;
		this.key=k;
	}
    public String tostring(){
		String str="";
		str=str+name+"		"+dob+"	"+parents+"	"+child+"	"+cont;
		return str;
	}
}
class familyTree{
	int N=0;
	Node root;
	int[] A=new int[100];
	int raer=-1;;
	int front=-1;
	void insert(String n,String d,String p,String c,String co){
		N++;
		Node node=new Node(n,d,p,c,co,N);
		raer++;
		A[raer]=N;
		Node current;
		if(N==1){
			root=node;
		}
		else{
			front++;
			Node temp=root;
			current=Search(temp,A[front]);
			if(current.left==null){
				current.left=node;
			}
			else
				current.left=node;
		}
	}
/*Node Search(int k){
		Node current1=root;
		
	if(current1==null)
		return null;
	else {
			return current1;
	}
	}*/
	public Node Search(Node node,int l){
		int k=0;
		Node t=null;
		if(node.key==l){
			k=5;
			t=node;
			node=null;
		}
		if(node!=null){
			Search(node.left,l);
			if(k==5){
				node=null;
			}
			Search(node.right,l);
		}
		return t;
	}
	public void InordeTrav(Node node){
		if(node!=null){
			InordeTrav(node.left);
			System.out.println(node.tostring());
			InordeTrav(node.right);
		}
	}
	public void PreordeTrav(Node node){
		if(node!=null){
			System.out.println(node.tostring());
			PreordeTrav(node.left);
			PreordeTrav(node.right);
		}
	}
	public void PostordeTrav(Node node){
		if(node!=null){
			PostordeTrav(node.left);
			PostordeTrav(node.right);
			System.out.println(node.tostring());
		}
	}
		void Search(String n){
		Node current=root;
		while((current.name).compareTo(n)!=0){
			if((current.name).compareTo(n)>0){
				current=current.left;
				if(current==null)break;
			}
			else{
				current=current.right;
				if(current==null)break;
		}
	}
	if(current==null)
		System.out.println("Not Found");
	else {
		System.out.println("Yes Node is Found,Details is -->>>  ");
	System.out.println(current.tostring());
	}
	}
}
class TreeLab_7a{
	public static void main(String args[]){
		familyTree F=new  familyTree();
		F.insert("person1","10-11-15","parents1","Address1","1234567");
		F.insert("person2","11-11-15","parents2","Address2","1234568");
		F.insert("person3","12-11-15","parents2","Address3","1234569");
		
		F.insert("person4","13-11-15","parents4","Address4","1234570");
		F.insert("person5","14-11-15","parents5","Address5","1234571");
		F.insert("person6","15-11-15","parents6","Address6","1234572");
		F.insert("person7","16-11-15","parents7","Address7","1234573");
		
		F.insert("person8","17-11-15","parents8","Address8","1234574");
		F.insert("person9","18-11-15","parents9","Address9","1234575");
		F.insert("person10","19-11-15","parents10","Address10","1234576");
		F.insert("person11","20-11-15","parents11","Address11","1234577");
		F.insert("person12","21-11-15","parents12","Address12","1234578");
		F.insert("person13","22-11-15","parents13","Address13","1234579");
		F.insert("person14","24-11-15","parents14","Address14","1234580");
		F.insert("person15","25-11-15","parents15","Address15","1234581");
		
		
		System.out.println("IN  order traversal --->>>");
		F.InordeTrav(F.root);
		System.out.println("Pre order traversal --->>>");
		F.PreordeTrav(F.root);
		System.out.println("Post order traversal --->>>");
		F.PostordeTrav(F.root);
		F.Search("person1");
	}
}