class Node{
	int key;
	String name;
	String dob;
	String parents;
	String child;
	String cont;
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
		str=str+name+"	"+dob+"	"+parents+"	"+child+"	"+cont+"	"+key;
		return str;
	}
}
class familyTree{
	Node root;
	void insert(String n,String d,String p,String c,String co,int k){
		Node node=new  Node(n,d,p,c,co,k);
		Node current;
		if(root==null){
			root=node;
		}
		else{
			Node focus=root;
			while(focus!=null){
					current=focus;
				if(k<focus.key){
					focus=focus.left;
					if(focus==null){
					current.left=node;
					return;
					}
				}
				else{
					focus=focus.right;
					if(focus==null){
					current.right=node;
					return;
					}
				}
			}
		}
		
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
	void Search(int k){
		Node current=root;
		while(current.key!=k){
			if(current.key>k){
				current=current.left;
			}
			else{
				current=current.right;
		}
	}
	if(current==null)
		System.out.println("Not Found");
	else {
		System.out.println("Yes Node is Found,Details is -->>>  ");
	System.out.println(current.tostring());
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
class TreeLab7{
	public static void main(String args[]){
		familyTree F=new  familyTree();
		F.insert("person1","11-11-15","parents1","Address1","1234567",55);
		F.insert("person2","12-11-15","parents1","Address1","1234568",56);
		F.insert("person3","13-11-15","parents2","Address2","1234569",49);
		F.insert("person4","14-11-15","parents2","Address2","1234560",58);
		F.insert("person5","15-11-15","parents3","Address3","1234561",51);
		F.insert("person6","16-11-15","parents3","Address3","1234562",53);
		F.insert("person7","17-11-15","parents4","Address4","1234563",59);
		F.insert("person8","18-11-15","parents4","Address4","1234564",40);
		F.insert("person9","19-11-15","parents5","Address5","1234565",60);
		System.out.println("IN  order traversal --->>>");
		F.InordeTrav(F.root);
		System.out.println("Pre order traversal --->>>");
		F.PreordeTrav(F.root);
		System.out.println("Post order traversal --->>>");
		F.PostordeTrav(F.root);
		F.Search("person1");
		F.Search(49);
	}
}