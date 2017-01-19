import java.util.*;
class Customer
{
        String name,contactNo;
        int age;
        Customer(String n,String cn,int a)
        {
                name=n;
                contactNo=cn;
                age=a;
        }
        public String toString()
        {
                return "Customer Name : "+name+"\nAge :"+age+"\t\tContact : "+contactNo+"";
        }
}
class Account
{
        long accountNo;
        double balance;
        RBI bank;
        Account(long an)
        {
                accountNo=an;
                balance=0;
        }
        Account(long an,double b)
        {
                accountNo=an;
                balance=b;
        }
        boolean withdrawMoney(double money)
        {

                if(balance-money>=bank.minimumBalanceAllowed())
                {
                        if(money>bank.maximumWithrawbleLimit())
                        {
                                System.out.println("Can't Withdraw more than
"+bank.maximumWithrawbleLimit());
                                return false;
                        }
                        balance-=money;
                        return true;
                }
                System.out.println("Minimum Balance Allowed is
Rs."+bank.minimumBalanceAllowed());
                return false;
        }
        boolean depositeMoney(double money)
        {
                balance+=money;
                return true;

        }
        public String toString()
        {
                return bank.getBankName()+" Account No. : "+accountNo+"\nBalance
:"+balance+"";
        }
}
class RBI
{
        Customer c;
        Account a;
        String getBankName()
        {
                return "RBI";
        }
        RBI(Customer cus,Account ac)
        {
                c=cus;
                a=ac;
                ac.bank=this;
        }

        double minimumBalanceAllowed()
        {
                return 1000.0;
        }
        double maximumWithrawbleLimit()
        {
                return 40000.0;
        }
        public double getInterestRate()
        {
                return 4.0;
        }

}
class SBI extends RBI
{
        String getBankName()
        {
                return "SBI";
        }
        SBI(Customer cus,Account ac)
        {
                super(cus,ac);
        }
        double minimumBalanceAllowed()
        {
                return 2000.0;
        }
        double maximumWithrawbleLimit()
        {
                return 30000.0;
        }
        public double getInterestRate()
        {
                return 5.0;
        }
}
class ICICI extends RBI
{
        String getBankName()
        {
                return "ICICI";
        }

        ICICI(Customer cus,Account ac)
        {
                super(cus,ac);
        }
        double minimumBalanceAllowed()
        {
                return 5000.0;
        }
        double maximumWithrawbleLimit()
        {
                return 35000.0;
        }
        public double getInterestRate()
        {
                return 4.5;
        }
}
class q1
{
        static String getDetails(RBI r)
        {
                return "\n\n------------------------------------------------\n"
                        +r.a.toString()+" \n"+r.c.toString()+" \nInterest Rate :
"+r.getInterestRate()+"\n"
                        +  "------------------------------------------------\n";
        }
        public static void main(String args[])
        {
                Scanner in=new Scanner(System.in);

                System.out.println("\nSample Accounts Details are in Source
Code\n------------------------------------------------\n");

                /************SAMPLE DATA**********/
                ArrayList<RBI> accounts=new ArrayList<RBI>();
                while(true)
                {
                        System.out.println("Enter Account Details to Create New Account\n");
System.out.print("BANK(SBI/ICICI) : ");
                        String bank=in.nextLine().trim();
                        boolean isSBI=true;
                        if(bank.equalsIgnoreCase("SBI"))
                                isSBI=true;
                        else if(bank.equalsIgnoreCase("ICICI"))
                                isSBI=false;
                        else
                        {
                                System.out.println("Only For SBI and ICICI bank");
                                continue;
                        }
                        System.out.print("Name : ");
                        String name=in.nextLine();
                        System.out.print("Contact : ");
                        String contact=in.nextLine();
                        System.out.print("Age : ");
                        int age=Integer.parseInt(in.nextLine());

                        long accoutNo=Math.abs(((new Random()).nextLong())/10);
                        System.out.println("Account Number : "+accoutNo);

                        System.out.print("Initially Amount : ");
                        double bal=Double.parseDouble(in.nextLine());
                        if(isSBI)
                        accounts.add(  new SBI(new Customer(name,contact,age),new
Account(accoutNo,bal))  );
                        else accounts.add(  new ICICI(new Customer(name,contact,age),new
Account(accoutNo,bal))  );

                        System.out.print("Want to Add More(Y/N) : ");
                        if(!in.nextLine().equalsIgnoreCase("Y")) break;

                }
                accounts.add(  new SBI(new Customer("Gagan","9473480014",18),new
Account(123456,20000))  );
                accounts.add(  new ICICI(new Customer("Shailesh","963258741",22),new
Account(987654,40000))  );
                accounts.add(  new SBI(new Customer("Abhishek","789456123",19),new
Account(123987,60000))  );
                accounts.add(  new ICICI(new Customer("Jainendra","963258963",20),new
Account(987123,100000))  );
                /**************SAMPLE DATA DONE*********/
                while(true)
                {
                        System.out.println("\nBank Management\n------------------------\n");
System.out.print("1 - Details\n2 - Deposite\n3 - Withdrawal\n4 -
Exit\nEnter Choice : ");
                        int x=Integer.parseInt(in.nextLine());
                        if(x==4) break;
                        if(x<1 || x>3)
                        {
                                System.out.println("Wrong Choice!\n");
                                continue;
                        }
                        System.out.print("Account Number : ");
                        long account=Long.parseLong(in.nextLine());
                        RBI r=null;
                        for(RBI rbi : accounts)
                                if(rbi.a.accountNo == account)
                                {
                                        r=rbi;break;
                                }
                        if(r==null)
                        {
                                System.out.println("No Such Account Exists\n");
                                continue;
                        }
                        double d;
                        switch (x) {
                                case 1 :
                                        System.out.println(getDetails(r));
                                        break;
                                case 2 :
                                        System.out.print("Enter Money to be Deposited : ");
                                        d=Double.parseDouble(in.nextLine());
                                        if(r.a.depositeMoney(d))
                                                System.out.println("Money Deposited\n");
                                        System.out.println(getDetails(r));
                                        break;
                                case 3 :
                                        System.out.print("Enter Money for Withdrawal : ");
                                        d=Double.parseDouble(in.nextLine());
                                        if(r.a.withdrawMoney(d))
                                        {
                                                System.out.println("Money Withdrawed\n");
                                                System.out.println(getDetails(r));
                                        }
                                        break;


                        }
                }
        }
}


