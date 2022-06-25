class Account
{
	 public String accholdname;
   private int number;
   private int balance;
   public int phone;
   public String mail;
   public int age;
   public int limit;
   
	
	public Account()
	{
		
	}
	
	public Account(String accholdname,int phone,String mail,int age,int limit)
	{
		this.accholdname = accholdname ;
                this.phone=phone;
                 this.mail=mail;
          this.age=age;
         this.limit=limit;
    }
	
	public void setnum(int number) 
	{
		this.number= number;
                
	}
public void setbal(int balance)
{
 this.balance=balance;
}
	
	public int getnum()
	{
		return number ;
	}
      public int getbal()
{  
     return balance;
}
	void showInformation()
	{
		System.out.println("Name: "+accholdname) ;
		
                 System.out.println("Phone : "+phone) ;
                  System.out.println("mail": "+mail) ;
                  System.out.println("Age : "+age) ;
                 System.out.println("Transaction limit : "+limit) ;
                 
                   
                   
	}
     void withdrwal(int amount)
{
      System.out.println("Withdrwal amount is "+amount) ;
}
void diposite(int amount)
{
System.out.println("Deposite amount is "+amount) ;
}



	
}


class Start
{
	public static void main(String arg[])
	{
		Account e1 = new Account("Ibrahim",123456,"ibrahim@gmail.com",21,10000) ;
                 e1.setnum(881423);
                  e1.setbal(80000);                 
                  System.out.println("Account Number  : "+e1.getnum()) ;
                   System.out.println("Account Balance : "+e1.getbal()) ;
		e1.showInformation() ;
                e1.withdrwal(5000);
                 e1.diposite(12000);
	}
}