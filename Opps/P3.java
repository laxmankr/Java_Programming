import java.util.*;
class carrierCompany{
	Scanner in=new Scanner(System.in);
	String OneCity;
	String AnotherCity;
	ArrayList<Bus> alb=new ArrayList<Bus>();
	Bus ob;
	carrierCompany(int R){
		System.out.print("Enetr First City Name  ---->>>>     ");
		OneCity=in.next();
		System.out.print("Enetr AnotherCity Name ---->>>>     ");
		AnotherCity=in.next();
		char c;
		int cond=0;
		String str;
		while(cond==0){
			System.out.print("Do You want to add Bus (y/n)--->>>");
			str=in.next();
			c=str.charAt(0);
			switch(c){
				case 'y':{
					this.AddBus(R);
				};break;
				case 'n':{
					cond=1;
				};break;
			}
		}
	}
	carrierCompany(String s,String d){
		OneCity=s;
		AnotherCity=d;
	}
	void AddBus(int R){
		ob=new Bus();
		System.out.println("______________________________________________________________________");
		System.out.println("Enter Deatails of Newly bus-----");
		System.out.print("Enter Capacity     ---->>>>    ");
		int c=in.nextInt();
		System.out.print("Enter Starting time --->>>>    ");
		int t=in.nextInt();
		System.out.print("Enter sourceCity   ---->>>>    ");
		String s=in.next();
		System.out.print("Enter destinationCity-->>>>    ");
		String d=in.next();
		if((this.OneCity.equals(s)&&this.AnotherCity.equals(d))||(this.OneCity.equals(d)&&this.AnotherCity.equals(s))){
			if(t<=24){
			ob.Add(R,c,t,s,d);
		    alb.add(ob);
			}
			else
				System.out.println("Incorrect Starting time!");
		}
		else
			System.out.println("This carrierCompany cann't Allowed in this rout!");
	}
	void AddBus(int a,int b,int c,String d,String e){
		ob=new Bus();
		ob.Add(a,b,c,d,e);
		alb.add(ob);
	}
	void display(){
		System.out.println("\nOneCity    --->>>>    "+OneCity);
		System.out.println("AnotherCity  --->>>>    "+AnotherCity);
		System.out.println("Details of Buses :");
		System.out.println("______________________________________________________________________");
		System.out.println("RegNo	Capacity	time	source		destination");
		System.out.println("______________________________________________________________________");
		for(Bus b:alb){
			System.out.println(b.toString());
		}
	}
}
class  Bus{
	int RegistratioNo;
	int Capacity;
	int time;//only in hour
	String source;
	String destination;
	Bus(){
		
	}
	void Add(int a,int b,int c,String d,String e){
		RegistratioNo=a;
		Capacity=b;
		time=c;
		source=d;
		destination=e;
	}
	public String toString(){
		String str="";
		str=str+RegistratioNo+"	"+Capacity+"		"+time+"	"+source+"		"+destination;
		return str;
	}
}
class Car{
	Scanner in=new Scanner(System.in);
	int RegistratioNo;
	String name;
	void Addcar(int r){
		RegistratioNo=r;
		System.out.print("Enter Driver Name ---->>>>>   ");
		name=in.next();
	}
	void Addcar(int r,String  n){
		RegistratioNo=r;
		name=n;
	}
	public String toString(){
		String str="";
		str=str+RegistratioNo+"		"+name;
		return str;
	} 
}
class TransportDep{
	ArrayList<Car> alc=new ArrayList<Car>();
	ArrayList<carrierCompany> arr=new ArrayList<carrierCompany>();
}
class P3{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		TransportDep obt=new TransportDep();
		int R=2010;
		int C=0;
		carrierCompany obj1=new carrierCompany("Patna","Madhubani");
		carrierCompany obj2=new carrierCompany("Delhi","Patna");
		obj1.AddBus(R,50,5,"Patna","Madhubani");
		R++;
		obj1.AddBus(R,60,6,"Patna","Madhubani");
		R++;
		obt.arr.add(obj1);
		obj2.AddBus(R,80,10,"Patna","Delhi");
		R++;
		obj2.AddBus(R,70,12,"Delhi","Patna");
		R++;
		obt.arr.add(obj2);
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		c1.Addcar(R,"Subham");
		R++;
		obt.alc.add(c1);
		c2.Addcar(R,"Rohit");
		R++;
		obt.alc.add(c2);
		c3.Addcar(R,"Sreya");
		R++;
		obt.alc.add(c3);
		System.out.println("**************************************************************************");
		System.out.println("1. --->>>  Add carrierCompany");
		System.out.println("2. --->>>  Add Buses to a carrierCompany");
		System.out.println("3. --->>>  Add cars to tansport department");
		System.out.println("4. --->>>  Book a car directly");
		System.out.println("5. --->>>  Book a Bus");
		System.out.println("6. --->>>  Print deata of hired Cabs");
		System.out.println("7. --->>>  Print deatails of Cabs & Buses");
		System.out.println("8. --->>>  For exit");
		int condition=0;
		while(condition==0){
			System.out.print("\nEnter choice ????    ");
			int choice=in.nextInt();
			switch(choice){
				case 1:{
					carrierCompany obj;
					obj=new carrierCompany(R);
					R++;
					obt.arr.add(obj);
				};break;
				case 2:{
					int N=-1;
					System.out.print("Enter OneCity  ----->>>>");
					String str1=in.next();
					System.out.print("Enter AnotherCity--->>>>");
					String str2=in.next();
					for(carrierCompany b:obt.arr){
						N++;
						if((b.OneCity.equals(str1)&&b.AnotherCity.equals(str2))||(b.OneCity.equals(str2)&&b.AnotherCity.equals(str1))){
							break;
						}
						if((N+1)==obt.arr.size()){
							N=-1;
						}
					}
					if(N!=(-1)){
						carrierCompany cari=obt.arr.get(N);
						cari.AddBus(R);
						R++;
						System.out.print("Adding Process is Successful!");
					}
					else
						System.out.print("Input is Wrong!");
				};break;
				case 3:{
					Car obj;
					obj=new Car();
					obj.Addcar(R);
					R++;
					obt.alc.add(obj);
					System.out.println("Created Car Deatails  is :  ");
					System.out.println("_______________________________________________________________________");
					System.out.println("RegNo		Driver Name");
					System.out.println(obj.toString());
					System.out.println("_______________________________________________________________________");
				};break;
				case 4:{
					if(C<obt.alc.size()){
					Car c=obt.alc.get(C);
					C++;
					System.out.println("Your Car booking is Successful!");
					System.out.println("Car Deatails  is  :");
					System.out.println("_______________________________________________________________________");
					System.out.println("RegNo		Driver Name");
					System.out.println(c.toString());
					System.out.println("_______________________________________________________________________");
					}
					else {
						System.out.println("Sorry! Cabs is Not Availeble Now");
						System.out.println("Press 3 for create new Cabs");
					}
				};break;
				case 5:{
					System.out.print("Enter source Place --->>>   ");
					String s=in.next();
					System.out.print("Enter destination  --->>>   ");
					String d=in.next();
					System.out.print("Enter travel start time-->>>>      ");
					int t=in.nextInt();
					int k=0;
					int k1=0;
					for(carrierCompany c:obt.arr){
						k1++;
						if((c.OneCity.equals(s)&&c.AnotherCity.equals(d))||(c.OneCity.equals(d)&&c.AnotherCity.equals(s))){
							for(Bus b:c.alb){
								if(b.source.equals(s)&&b.destination.equals(d)){
									if((b.time==((t+1)%24))||(b.time==((t+2)%24))||(b.time==(t%24))){
										System.out.println("Your Bus seat booking is Successful!");
										System.out.println("Details of Buses :");
										System.out.println("_______________________________________________________________________");
										System.out.println("RegNo	Capacity	time	source		destination");
										System.out.println("_______________________________________________________________________");
										System.out.println(b.toString());
										k=-1;
										break;
									}
								}
							}
						}
						else{
							if(k!=(-1)&&(k1==(obt.arr.size()))){
									System.out.println("Buses Not available because of rute OR time Problem!");
									Car c4=obt.alc.get(C);
										C++;
										System.out.println("Your Car booking is Successful!");
										System.out.println("Car Deatails  is  : ");
										System.out.println("_______________________________________________________________________");
										System.out.println("RegNo		Driver Name");
										System.out.println(c4.toString());
										System.out.println("_______________________________________________________________________");
										break;
							}
						}
					}
				};break;
				case 6:{
					int k2=0;
					System.out.println("Details of hired Cabs is------");
					System.out.println("_______________________________________________________________________");
					System.out.println("RegNo		Driver Name");
					System.out.println("_______________________________________________________________________");
					for(Car l:obt.alc){
						k2++;
						if(k2<=C){
						System.out.println(l.toString());
						}
						else{
							if(k2==1){
								System.out.println("No any Cabs hired!");
							}
						}
					}
					System.out.println("_______________________________________________________________________");
				};break;
				case 7:{
					System.out.println("Details of All Cabs is------");
					System.out.println("_______________________________________________________________________");
					System.out.println("RegNo		Driver Name");
					System.out.println("_______________________________________________________________________");
					for(Car l:obt.alc){
						System.out.println(l.toString());
					}
					System.out.println("_______________________________________________________________________");
					System.out.println("Details of All Buses is------");
					for(carrierCompany p:obt.arr){
						p.display();
					}
				};break;
				case 8:{
					System.out.println("*************************************************************************");
					condition=1;
				};break;
				default:System.out.print("Choice is wrong! tri again!");
				break;
			}
		}
	}
}