import java.util.*;
class Train{
	int trainNo;
	String source;
	String destination;
	int Stime;
	int Rtime;
	int capacity;
	Train(){
		
	}
	Train(int n){
		this.AddTrain(n);
		int cond=0;
		while(cond==0){
			System.out.print("Are you want stopage (y/n)-->>> ");
			String str=in.next();
			char choice=str.charAt(0);
			switch(choice){
				case 'y':{
					AddStopage();
				};break;
				case 'n':{
					cond=1;
				};break;
				default:System.out.println("Tri Again ! choice is wrong!!");
				break;
			}
		}
	}
	Scanner in=new Scanner(System.in);
	void AddTrain(int n,String s,String d,int S,int R,int c){
		trainNo=n;
		source=s;
		destination=d;
		Stime=S;
		Rtime=R;
		capacity=c;
	}
	ArrayList<stopage> arr=new ArrayList<stopage>();
	void AddStopage(){
		stopage obj;
		obj=new stopage();
		obj.add();
		arr.add(obj);
		System.out.println("_____________________________________________________________________________");
		System.out.println("Added Stopage is__________");
		System.out.println("Station Name		Arrivaltime");
		System.out.println(obj.toString());
		System.out.println("_____________________________________________________________________________");
	}
	void AddStopage(String n,int t){
		stopage obj;
		obj=new stopage();
		obj.add(n,t);
		arr.add(obj);
	}
	void AddTrain(int n){
		trainNo=n;
		System.out.print("Enter Source(String)--->>>  ");
		source=in.next();
		System.out.print("Enter destinstion(String)-->>>  ");
		destination=in.next();
		System.out.print("Enter Starting time(int) --->>>  ");
		Stime=in.nextInt();
		System.out.print("Enter Reaching time(int)  --->>>  ");
		Rtime=in.nextInt();
		System.out.print("Enter capacity of Train(int)--->>>  ");
		capacity=in.nextInt();
	}
	void display(){
		System.out.println(trainNo+"	"+source+"		"+destination+"		"+Stime+"	"+Rtime+"	"+capacity);
	}
}
class stopage{
	String name;
	int Atime;
	stopage(){
		
	}
	Scanner in=new Scanner(System.in);
	void add(){
		System.out.print("Enter Station Name (String)    --->>>   ");
		name=in.next();
		System.out.print("Enter Station arival time (int)--->>>   ");
		Atime=in.nextInt();
	}
	void add(String s,int i){
		name=s;
		Atime=i;
	}
	public String toString(){
		String str="";
		str=str+name+"		"+Atime;
		return str;
	}
}
class P4{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		ArrayList<Train> art=new ArrayList<Train>();
		int N=120091;
		Train obj1=new Train();
		obj1.AddTrain(N++,"Patna","Delhi",320,680,1000);
		obj1.AddStopage("Varanasi",450);
		obj1.AddStopage("Haridawar",450);
		art.add(obj1);
		Train obj2=new Train();
		obj2.AddTrain(N++,"Patliputra","Roorkee",350,650,2000);
		obj2.AddStopage("Gaya",550);
		obj2.AddStopage("Utra",550);
		art.add(obj2);
		int condition=0;
		System.out.println("*****************************************************************************");
		System.out.println("1.--->>> Add new trains");
		System.out.println("2.--->>> Add sequential train stoppages and the arrival time at that station");
		System.out.println("3.--->>> Print train stops");
		System.out.println("4.--->>> Display all information");
		System.out.println("5.--->>> For exit");
		while(condition==0){
			System.out.print("Enter choice --->>> ");
			int choice=in.nextInt();
			switch(choice){
				case 1:{
					Train o=new Train(N++);
					art.add(o);
				};break;
				case 2:{
					System.out.print("Enter trainNo--->>>>");
					int n=in.nextInt();
					for(Train t:art){
						if(t.trainNo==n){
							t.AddStopage();
							break;
						}
					}
				};break;
				case 3:{
					System.out.print("Enter trainNo--->>>>");
					int n=in.nextInt();
					for(Train t:art){
						if(t.trainNo==n){
						System.out.println("_____________________________________________________________________________");
						System.out.println("TrainNo	source		destinstion	Stime	Rtime	capacity");
						System.out.println("_____________________________________________________________________________");
							t.display();
							System.out.println("-------------------------------------");
						System.out.println("Stopage Name		Arrivaltime");
						System.out.println("-------------------------------------");
							for(stopage s:t.arr){
								System.out.println(s.toString());
							}
							System.out.println("_____________________________________________________________________________");
							break;
						}
					}
				};break;
				case 4:{
					for(Train t:art){
						System.out.println("_____________________________________________________________________________");
						System.out.println("TrainNo	source		destinstion	Stime	Rtime	capacity");
						System.out.println("_____________________________________________________________________________");
						t.display();
					System.out.println("-------------------------------------");
						System.out.println("Stopage Name		Arrivaltime");
						System.out.println("-------------------------------------");
						for(stopage s:t.arr){
							System.out.println(s.toString());
						}
						System.out.println("_____________________________________________________________________________");
					}
				};break;
				case 5:{
					System.out.println("**************************************************************************");
					condition=1;
				};break;
				default:System.out.println("Tri Again ! choice is wrong!!");
				break;
			}
		}
	}
}
