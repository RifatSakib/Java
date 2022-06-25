class EmpSalary
{
	private double basicAmout;
    private double festivalBonus;
    private double overtimeAmount;

        public EmpSalary()
	    {
		
	    }
	
        public  EmpSalary(double basicAmout, double festivalBonus, double overtimeAmount)
	
        {
		this.basicAmout = basicAmout ;
		this.festivalBonus = festivalBonus ;
		this.overtimeAmount = overtimeAmount ;
	    }
	
      

	  public void setbAmout(double basicAmout)
	   {
	      this.basicAmout = basicAmout ;
	   }
	     
		 public double getbAmout() 
	   {
	       return this.basicAmout = basicAmout ;
	   
	   }
	   
	    public void setfBonus(double festivalBonus)
	   {
	        this.festivalBonus = festivalBonus ;
	   
	   }
	    

		public double getfBonus()
	   {
	       return this.festivalBonus = festivalBonus ;
	   
	   }
	   
	   
	   public void setotAmount(double overtimeAmount)
	   {
	        this.overtimeAmount = overtimeAmount ;
	   
	   }
	    

		public double getotAmount()
	   {
	       return this.overtimeAmount = overtimeAmount ;
	   
	   }

       

	   public void show()
	{   
		System.out.println("basicAmout: "+basicAmout) ;
		System.out.println("festivalBonus: "+festivalBonus) ;
		System.out.println("overtimeAmount: "+overtimeAmount) ;		
			
	}

	
}