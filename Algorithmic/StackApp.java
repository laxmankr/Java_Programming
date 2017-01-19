interface stack{
	//Accesser methode
	public int size();
	public boolean isEmpty();
	public Object top();
	//update methode
	public void push(Object element);
	public Object pop();
}
class ArrayStack implements stack{
	public static final int CAPACITY=1024;
	private int N;
	private Object s[];
	private int t=-1;
	public ArrayStack(){
		this(CAPACITY);
	}
	public ArrayStack(int cap){
		N=cap;
		s=new Object[N];
	}
	public int size(){
		return (t+1);
	}
	public boolean isEmpty(){
		return (t<0);
	}
	public Object top(){
			if(t<0){
			System.out.println("Sorry!Stack is Empty!");
			return null;
			}
		else
			return s[t];
	}
	public void push(Object obj){
		try{
			if((t+1)<N)
		s[++t]=obj;
	else
	{
		Object S[]=new Object[2*N];
		for(int j=0;j<=t;j++)
			S[j]=s[j];
		N=N*2;
		s=S;
		s[++t]=obj;
	}
		}catch(Exception e){
			System.out.println("My Exception is :"+e);
		}
	}
	public Object pop(){
		if(t<0){
			System.out.println("Sorry!Stack is Empty!");
			return null;
		}
		else
		{
		Object elem;
		elem=s[t--];
		s[t+1]=null;
		return  elem;
		}
	}
	public void print(){
		try{
		for(int i=0;i<=t;i++)
			System.out.print(s[i]+" ");
		System.out.println("");
		}catch(Exception e){
			System.out.println("My Exception is :"+e);
		}
	}
}
public class StackApp{
	public static void main(String args[]){
		int x;
		boolean b;
		ArrayStack object=new ArrayStack(1);
		x=object.size();
		System.out.println("Size of Stack is "+x);
		object.push(5);
		object.print();
		object.push(10);
		object.print();
		object.pop();
		object.print();
		object.pop();
		object.print();
		object.pop();
		object.print();
		object.top();
		object.print();
		b=object.isEmpty();
		System.out.println("Stack is Empty ?? "+b);
		x=object.size();
		System.out.println("Size of Stack is "+x);
		object.push(15);
		object.print();
		object.push(15);
		object.print();
		object.push(15);
		object.print();
		object.push(15);
		object.print();
		object.push(15);
		object.print();
		object.push(15);
		object.print();
		object.push(15);
		object.print();
		object.push(20);
		object.print();
		object.push(25);
		object.print();
		object.push(20);
		object.print();
		object.push(25);
		object.print();
		object.push(20);
		object.print();
		object.push(25);
		object.print();
		object.push(30);
		object.print();
		object.pop();
		object.print();
		object.pop();
		object.print();
		object.top();
		object.print();
		b=object.isEmpty();
		System.out.println("Stack is Empty ?? "+b);
		x=object.size();
		System.out.println("Size of Stack is "+x);
	}
}