class Employee
{
	public String Name;
    public String ID; 
    private String phoneNo;
    public String email;
   private EmpSalary salary;

	
        public Employee()
	    {
		
	    }
	
        public  Employee (String Name, String ID, String phoneNo ,String email,EmpSalary salary)
	
        {
		
		this.Name = Name ;
		this.ID = ID ;
		this.phoneNo = phoneNo ;
		this.email = email ;
		this.salary = salary ;
	    }
	
       public void setphone(String phoneNo)
	   {
	        this.phoneNo = phoneNo ;
	   
	   }
	     public String getphone()
	   {
	       return this.phoneNo = phoneNo ;
	   
	   }
	   
	   public void setsalary(EmpSalary salary)
	   {
	        this.salary = salary ;
	   
	   }
	     public double getsalary()
	   {
	       return this.salary = salary ;
	   
	   }

        public void show()
	{   
	
		System.out.println("Name: "+Name) ;
		System.out.println("ID: "+ID) ;
		System.out.println("phoneNo: "+phoneNo) ;
		System.out.println("email: "+email) ;
		System.out.println("basicAmout: "+salary.basicAmout+ "festivalBonus: "+salary.festivalBonus+ "overtimeAmount: "+salary.overtimeAmount) ;
		
	}

	
}