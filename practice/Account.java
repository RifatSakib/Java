
class Account
{   

    public String accountHolderName ;
	private String accountNumber ;
	private double balance;
	public String phoneNumber;
	public String  email;
	public double age;
	public double perDayTransactionLimit;
    public double depositMoney; 
    public double withdrawMoney; 
	
	
	   
	    public Account()
		{
		   
		}
	
        public Account(String accountHolderName,String phoneNumber,String email,double age,double perDayTransactionLimit,String accountNumber, double balance)
	
        {
		this.accountHolderName = accountHolderName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.age = age;
		this.perDayTransactionLimit = perDayTransactionLimit;
		this.accountNumber=accountNumber;
		this.balance = balance;
	    }
	   
	    public String setaccountNumber(String accountNumber) 
	
        {
		
		 this.accountNumber = accountNumber ;
	     
        }
	
        public String getaccountNumber()
	    {
                return accountNumber ;
        }
	
	   public double setbalance(double balance) 
	
        {
		this.balance = balance ;
	
        }
	
        public double getbalance()
	    {
                return balance ;
        }
	
   void showInformation()
	{
		         System.out.println("Name: " +accountHolderName);
                 System.out.println("Phone :" +phoneNumber) ;
                 System.out.println("Mail:" +email) ;
                 System.out.println("Age :" +age);
                 System.out.println("Transaction limit : " +perDayTransactionLimit) ;
				 System.out.println("Account Number : " +accountNumber) ;
				 System.out.println("Balance :" +balance) ;
                               
	}
	
	
	
	
	double withdraw(double withdrawMoney)
    {  

     
     if (withdrawMoney < 0 )
      {  
           System.out.println("Error, please check your balance") ;
	
	}
    
	else if (  withdrawMoney > balance )
      { 
           System.out.println("Error, please check your amount") ;
	  
	  }
	  else if (  withdrawMoney == perDayTransactionLimit )
      {  
         System.out.println("Error, please check your per day limit") ;
	 
    	 }
	  
     else
	  
	  {
		  
		  return balance - withdrawMoney;
		  
	  }
	  
	   return balance;
	  
    }

   double deposite(double depositMoney)
    {     
   
      
	  return (balance + depositMoney) ;
	 
    }
}