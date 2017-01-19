class Node{
	String name;
	String dob;
	String parents;
	String child;
	String cont;
	Node left;
	Node right;
	Node(String n,String d,String p,String c,String co){
		this.name=n;
		this.dob=d;
		this.parents=p;
		this.child=c;
		this.cont=co;
	}
    public String tostring(){
		String str="";
		str=str+name+"	"+dob+"	"+parents+"	"+child+"	"+cont;
		return str;
	}
}
class familyTree{
	Node root;
	void insert(){
		root=new  Node("person01","10-11-15","parents1","Address1","1234567");
		root.left=new  Node("person02","11-11-15","parents2","Address2","1234568");
		root.right=new  Node("person03","12-11-15","parents2","Address3","1234569");
		
		root.left.left=new  Node("person04","13-11-15","parents4","Address4","1234570");
		root.left.right=new  Node("person05","14-11-15","parents5","Address5","1234571");
		root.right.left=new  Node("person06","15-11-15","parents6","Address6","1234572");
		root.right.right=new  Node("person07","16-11-15","parents7","Address7","1234573");
		
		root.left.left.left=new  Node("person08","17-11-15","parents8","Address8","1234574");
		root.left.left.right=new  Node("person09","18-11-15","parents9","Address9","1234575");
		root.left.right.left=new  Node("person10","19-11-15","parents10","Address10","1234576");
		root.left.right.right=new  Node("person11","20-11-15","parents11","Address11","1234577");
		root.right.left.left=new  Node("person12","21-11-15","parents12","Address12","1234578");
		root.right.left.right=new  Node("person13","22-11-15","parents13","Address13","1234579");
		root.right.right.left=new  Node("person14","24-11-15","parents14","Address14","1234580");
		root.right.right.right=new  Node("person15","25-11-15","parents15","Address15","1234581");
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
class TreeLab_7{
	public static void main(String args[]){
		familyTree F=new  familyTree();
		F.insert();
		System.out.println("IN  order traversal --->>>");
		F.InordeTrav(F.root);
		System.out.println("Pre order traversal --->>>");
		F.PreordeTrav(F.root);
		System.out.println("Post order traversal --->>>");
		F.PostordeTrav(F.root);
		F.Search("person01");
		F.Search("person05");
		F.Search("person03");
		F.Search("person14");
	}
}