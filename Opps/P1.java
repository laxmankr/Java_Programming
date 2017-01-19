import java.util.*;
import java.io.*;
import java.lang.*;
class branch{
	Scanner stdin=new Scanner(System.in);
	String code;
	String type;
	int n=10;
	branch(String c,String t){
		code=c;
		type=t;
	}
	ArrayList<Employee> arr=new ArrayList<Employee>();
	branch(){
		System.out.print("Enter branch code --->>>  ");
		this.code=stdin.next();
		System.out.print("Enter branch Type --->>>  ");
		this.type=stdin.next();
	}
	void creat(){
		int cond=0;
		char choice;
		while(cond==0){
			System.out.print("Choice for Adding Employee (y/n) : ");
			String c=stdin.next();
			choice=c.charAt(0);
			switch(choice){
				case 'y':{
					Employee emp=new Employee();
		            this.AddEmployee(emp);
					this.arr.add(emp);
				};break;
				case 'n':{
					cond=1;
				};break;
				default:System.out.println("Sorry! wrong choice");
			}
		}
		
	}
	void AddEmployee(Employee t){
		System.out.println("--------------------------------------------------------");
		System.out.print("Enter Employee  Name        --->>>   ");
		String namee=stdin.next();
		System.out.print("Enter Employee  Designation --->>>   ");
		String designatione=stdin.next();
		System.out.print("Enter Employee YearOfjoinin --->>>   ");
		String yearofjoininge=stdin.next();
		t.employee(namee,designatione,yearofjoininge);
		t.ID(code,yearofjoininge,n++);
	}
	Employee ob;
	void AddEmp(String na,String d,String y){
		ob=new Employee();
		this.ob.employee(na,d,y);
		this.ob.ID(this.code,y,n++);
		this.arr.add(ob);
	}
	void display(){
		System.out.println("________________________________________________________");
		System.out.println("\nBranch code --->>> "+code);
		System.out.println("branch type ---->>>  "+type);
		System.out.println("Employee Details :");
		System.out.println("Name   Designation	id	yearofjoining");
		System.out.println("--------------------------------------------------------");
		for(Employee a:this.arr){
			System.out.println(a.toString());
		}
		System.out.println("________________________________________________________");
	}
	
}
class Employee{
	String name;
	String designation;
	String id;
	String yearofjoining;
	public void employee(String n,String d,String y){
		name=n;
		designation=d;
		yearofjoining=y;
	}
	public void ID(String bh,String year,int n){
		String str="";
		str=str+n;
		str=str+bh;
		str=str+year;
		id=str;
	}
	public String toString(){
		String str="";
		str=str+name+"	"+designation+"	"+id+"	"+yearofjoining;
		return str;
	}
}
public class P1{
	public static void main(String args[]){
		ArrayList<branch> br=new ArrayList<branch>();
		Scanner in=new Scanner(System.in);
		branch brc1=new branch("PAT","corporate");
		branch brc2=new branch("DEL","Production");
				brc1.AddEmp("Laxman","CSE","2014");
				brc1.AddEmp("Santosh","ECE","2010");
				brc2.AddEmp("Sachin","EEE","2014");
		        brc2.AddEmp("Pritesh","EEE","2015");
				brc2.AddEmp("Newton","CSE","2012");
		
		br.add(brc1);
		br.add(brc2);
		
		int choice;
		int condition=0;
		System.out.println("********************************************************************************");
		System.out.println("1.--->>> Creat a New branch office");//initially two branch PAT,DEL
		System.out.println("2.--->>> Employee List in a given branch");//initially DEL->Sachin,Pritesh,Newton*PAT->Laxman,Santosh
		System.out.println("3.--->>> Adding New Employee in a branch");
		System.out.println("4.--->>> Transferrin an Employee from one branch to another");
		System.out.println("5.--->>> List all employees in a branch who have joined after a given particular year.");
		System.out.println("6.--->>> Search details of an employee by name.");//initially Sachin,Pritesh,Newton,Laxman,Santosh
		System.out.println("7.--->>> For Exit");
		while(condition==0){
			System.out.println("________________________________________________________");
			System.out.print("Enter choice---???? ");
			choice=in.nextInt();
			switch(choice){
				case 1:{
					branch obj=new branch();
					obj.creat();
					br.add(obj);
				};break;
				case 2:{
					int N=-1;
					System.out.print("Enter branch code --->>>  ");
					String str=in.next();
					for(branch b:br){
						N++;
						if(b.code.equals(str)){
							break;
						}
						if((N+1)==br.size()){
							N=-1;
						}
					}
					if(N!=-1){
					br.get(N).display();
					}
					else
						System.out.println("Sorry! branch code is Wrong");
				};break;
				case 3:{
					int N=-1;
					System.out.print("Enter branch code --->>>   ");
					String str=in.next();
					for(branch b:br){
						N++;
						if(b.code.equals(str)){
							break;
						}
						if((N+1)==br.size()){
							N=-1;
						}
					}
					if(N!=(-1)){
					br.get(N).creat();
					}
					else{
						System.out.println("Sorry! branch code is Wrong");
					}
				};break;
				case 4:{
					int r=-1;
					int N=-1;
					int N1=-1;
					System.out.print("Enter branch(code) From --->>>   ");
					String str=in.next();
					System.out.print("Enter  branch(code)  To --->>>   ");
					String str1=in.next();
					System.out.print("Enter Employee Name   ---->>>    ");
					String nam=in.next();
					for(branch b:br){
						N++;
						if(b.code.equals(str)){
							break;
						}
						if((N+1)==br.size())
							N=-1;
					}
					for(branch b:br){
						N1++;
						if(b.code.equals(str1)){
							break;
						}
						if((N1+1)==br.size())
							N1=-1;
					}
					branch bran=br.get(N);
					for(Employee e:bran.arr){
						r++;
						if((e.name).equals(nam)){
							
							break;
						}
						if((r+1)==bran.arr.size())
							r=-1;
					}
					if(!((N==-1)||(N1==-1)||(r==-1))){
					branch bran1=br.get(N1);
					Employee E=bran.arr.get(r);
					bran1.AddEmp(E.name,E.designation,E.yearofjoining);
					bran.arr.remove(r);
					System.out.println("Transformation successful!");
					}
					else 
						System.out.println("Sorry! Brabch type OR Employee Name is wrong");
				};break;
				case 5:{
					int N=-1;
					int k=0;
					branch bran;
					System.out.print("Enter Particular year=");
					String Y=in.next();
					System.out.println("All Employee joining onward "+Y);
					for(branch b:br){
						N++;
						bran=br.get(N);
						for(Employee e:bran.arr){
							if(((e.yearofjoining).compareTo(Y))>=0){
								System.out.println(e.toString());
								k++;
							}
						}
					}
					if(k==0)
						System.out.println("No Anyone is join onward "+Y);
				};break;
				case 6:{
					int N=-1;
					int k=0;
					branch bran;
					System.out.print("Enter Employee Name --->>>>   ");
					String Y=in.next();
					for(branch d:br){
						N++;
						bran=br.get(N);
						for(Employee f:bran.arr){
							if((f.name).equals(Y)){
								System.out.println(f.toString());
								k++;
							}
						}
					}
					if(k==0)
						System.out.println("sorry! Name is not match");
				};break;
				case 7:{
					System.out.println("********************************************************************************");
					condition=1;
				};break;
				default:System.out.println("Sorry! choice is wrong");
				break;
			}
		}
		
	}
}