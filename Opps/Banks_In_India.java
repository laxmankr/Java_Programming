import java.util.*;
public class Rbi 
{
   float min_int=4;
   int min_bal_alwd=1000;
   int max_wdl=30000;
   float max_int_on_loan=10;
   public void get_max_loan_int(){}
   public void get_min_int(){}
   public void get_min_bal_alwd(){}
   public void get_max_wdl(){}
   Customer c=new Customer();
   Account a=new Account();
   
   
}



	

public class Icici extends Rbi
	{
		Scanner s=new Scanner(System.in);
		public void get_max_loan_int()
		{
			 System.out.println("Enter the max loan interest that bank can give to its customers");
			 max_int_on_loan=s.nextFloat();
			 if(max_int_on_loan>10)
			 {
				 System.out.println("You cant take interest more than 10% on loans as declared by RBI");
				 get_max_loan_int();
				 System.out.print("your bank's new interest on loan is "+max_int_on_loan);
			 }
		}
		public void get_min_int()
		{
			System.out.println("Enter the min interest that bank can give to its customers on deposits");
			min_int=s.nextFloat();
			
			if(min_int<4)
			{	
			System.out.println("You cant give interest less than 4% as declared by RBI");
			 get_min_int();
			 System.out.println("minimum interest on deposits is updated to "+min_int);
			}
		}
		public void get_min_bal_alwd()
		{
			System.out.println("Set the limit on minimum deposit for customers as or more than Rs1,000");
			min_bal_alwd=s.nextInt();
			if(min_bal_alwd<1000)
				get_min_bal_alwd();
		}
		public void get_max_wdl()
		{
			System.out.println("Set the limit on maximum withdrawal for customers as or less than Rs30,000");
	        max_wdl=s.nextInt();
	        if(max_wdl<super.max_wdl)
	        	get_max_wdl();
	        
		}
		Customer cust1=new Customer();
		Customer cust2=new Customer();
		Customer cust3=new Customer();
		Account acc=new Account();
		public void get_customer(Customer c1,Customer c2,Customer c3)
		{
			cust1=c1;
			cust2=c2;
			cust3=c3;
			cust1.getaccnticici(new Account(121,2000));
			cust2.getaccnticici(new Account(131,2000));
			cust3.getaccnticici(new Account(141,2000));
		
		}
		public void get_details_of_customers()
		{
			System.out.println("your bank has following customers");
		    System.out.println("Name    Account no    Balance");
			System.out.print(cust1.name+" "+cust1.a1.accnt_num );
			System.out.println("\t"+cust1.a1.balance);
			System.out.print(cust2.name+" "+cust2.a1.accnt_num );
			System.out.println("\t"+cust2.a1.balance);
			System.out.print(cust3.name+" "+cust3.a1.accnt_num );
			System.out.println("\t"+cust3.a1.balance);
		}
		
	}




public class Sbi extends Rbi
{
	Scanner s=new Scanner(System.in);
	public void get_max_loan_int()
	{
		 System.out.println("Enter the max loan interest that bank can give to its customers");
		 max_int_on_loan=s.nextFloat();
		 if(max_int_on_loan>10)
		 {
			 System.out.println("You cant take interest more than 10% on loans as declared by RBI");
			 get_max_loan_int();
			 System.out.print("your bank's new interest on loan is "+max_int_on_loan);
		 }
	}
	public void get_min_int()
	{
		System.out.println("Enter the min interest that bank can give to its customers on deposits");
		min_int=s.nextFloat();
		
		if(min_int<4)
		{	
		System.out.println("You cant give interest less than 4% as declared by RBI");
		 get_min_int();
		 System.out.println("minimum interest on deposits is updated to "+min_int);
		}
	}
	
	public void get_max_wdl()
	{
		System.out.println("Set the limit on maximum withdrawal for customers as or less than Rs30,000");
        max_wdl=s.nextInt();
        if(max_wdl<super.max_wdl)
        	get_max_wdl();
        
	}
	Customer cust1=new Customer();
	Customer cust2=new Customer();
	Account acc=new Account();
	public void get_customer(Customer c1,Customer c2)
	{
		cust1=c1;
		cust2=c2;
		cust1.getaccntsbi(new Account(1111,1000));
		cust2.getaccntsbi(new Account(2222,1000));
		
	
	}
	public void get_details_of_customers()
	{
		System.out.println("your bank has following customers");
	    System.out.println("Name    Account no    Balance");
		System.out.print(cust1.name+" "+cust1.a1.accnt_num );
		System.out.println("\t"+cust1.a1.balance);
		System.out.print(cust2.name+" "+cust2.a1.accnt_num );
		System.out.println("\t"+cust2.a1.balance);
		
	}
	
}

public class Customer 
{
   String name;
   int age;
   Customer(String s,int ag)
   { 
	    name=s;
	    age=ag;
   }
   Customer ()
   {
	   
   }
   Account a1=new Account();
   Account a2=new Account();
   
   public void getaccntsbi(Account a)
   {
	   a1=a;
   }
   public void depositsbi()
   {
	   a1.deposit();
   }
   public void withdrawsbi()
   {
	   a1.withdraw();
   }
   public void balance_checksbi()
   {
	   System.out.println("Dear "+name);
	   a1.balance_check();
   }
   public void getaccnticici(Account a)
   {
	   a2=a;
   }
   public void depositicici()
   {
	   a2.deposit();
   }
   public void withdrawicici()
   {
	   a2.withdraw();
   }
   public void balance_checkicici()
   {
	   System.out.println("Dear "+name);
	   a2.balance_check();
   }
   
}

public class Account
{
   Scanner s=new Scanner(System.in);
   int accnt_num;
   float balance;
   Account(int ac_no,float b)
   {
	   accnt_num=ac_no;
	   balance=b;
   }
   Account()
   {
   }
   void deposit()
   {
	   System.out.print("enter the amount that you want to deposit");
	   float am=s.nextFloat();
	   balance=balance+am;
   }
   
   void withdraw()
   {
	   System.out.println("Enter the amount that you want to withdraw but amounting less than 30000");
	   int amount=s.nextInt();
	   if (amount>30000)
	   {
		   System.out.println("Cant dispense that amount reduce the amount and then enter");
		   withdraw();
	   }
	   else
	   {
		   balance=balance-amount;
	   System.out.println("required amount dipensed");
	   }
   }
   void balance_check() 
   {
	   
	   System.out.print("available balance in your accnt is "+ balance);
   }
   
   
}

public class Banks_In_India {

	public static void main(String[] args) 
	{
	   Scanner s=new Scanner(System.in);
	   
       Sbi sbi=new Sbi();
       Customer c1=new Customer("Laxman kumar prabhakar",21);
       Customer c2=new Customer("Newton kumar",21);
       Customer c3=new Customer("Pritesh Raman",21);
       sbi.get_customer(c1, c2);
       
       System.out.println("Enter 1 if you are a bank administrator or 2 if customer");
       int a=s.nextInt();
       switch(a )
       {
       case(1):
    	   System.out.println("press one key according to list");
           System.out.println("To know details of customers--->1");
           System.out.println("To update  interest on loan amounts--->2");
           System.out.println("To update minimum interest on deposits-->3");
           System.out.println("To update the limit of one time withdrawal---4");
           int b=s.nextInt();
           if(b==1)
           {
        	   sbi.get_details_of_customers();
           }
           if(b==2)
           {
        	   sbi.get_max_loan_int();
           }
           if(b==3)
           {
        	   sbi.get_min_int();
           }
           if(b==4)
           {
        	   sbi.get_max_wdl();
           }
           break; 
       case(2):
    	   System.out.println("Choose your bank SBI-->1,ICICI-->2");
           int z=s.nextInt();
           switch(z)
           {
           case (1):
           
    	    System.out.println("Enter your account number");
            int c=s.nextInt();
            switch(c)
            {
            case(1111):
        	   System.out.println("press one key according to list");
               System.out.println("To deposit-->1");
               System.out.println("To withdraw-->2");
               System.out.println("To check current balance-->3");
               int d=s.nextInt();
               if(d==1)
               {
            	  c1.depositsbi(); 
               }
               if(d==2)
               {
            	   c1.withdrawsbi();
               }
               if(d==3)
               {
            	   c1.balance_checksbi();
               }
               break;
            case(2222):
            
         	   System.out.println("press one key according to list");
                System.out.println("To deposit-->1");
                System.out.println("To withdraw-->2");
                System.out.println("To check current balance-->3");
                int e=s.nextInt();
                if(e==1)
                {
             	  c2.depositsbi(); 
                }
                if(e==2)
                {
             	   c2.withdrawsbi();
                }
                if(e==3)
                {
             	   c2.balance_checksbi();
                }
                break;
            
              }
           case (2):
               
       	    System.out.println("Enter your account number");
               int d=s.nextInt();
               switch(d)
               {
               case(121):
           	   System.out.println("press one key according to list");
                  System.out.println("To deposit-->1");
                  System.out.println("To withdraw-->2");
                  System.out.println("To check current balance-->3");
                  int x=s.nextInt();
                  if(x==1)
                  {
               	  c1.depositicici(); 
                  }
                  if(x==2)
                  {
               	   c1.withdrawicici();
                  }
                  if(x==3)
                  {
               	   c1.balance_checkicici();
                  }
                  break;
               case(131):
               
            	   System.out.println("press one key according to list");
                   System.out.println("To deposit-->1");
                   System.out.println("To withdraw-->2");
                   System.out.println("To check current balance-->3");
                   int e=s.nextInt();
                   if(e==1)
                   {
                	  c2.depositicici(); 
                   }
                   if(e==2)
                   {
                	   c2.withdrawicici();
                   }
                   if(e==3)
                   {
                	   c2.balance_checkicici();
                   }
                   break;
               case(141):
               
            	   System.out.println("press one key according to list");
                   System.out.println("To deposit-->1");
                   System.out.println("To withdraw-->2");
                   System.out.println("To check current balance-->3");
                   int f=s.nextInt();
                   if(f==1)
                   {
                	  c3.depositicici(); 
                   }
                   if(f==2)
                   {
                	   c3.withdrawicici();
                   }
                   if(f==3)
                   {
                	   c3.balance_checkicici();
                   }
                   break;
                 }
           }
       }
       
	}

}
