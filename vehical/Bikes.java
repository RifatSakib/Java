class Bikes extends MotorVehicals
{
	public String model ;
 
	public double price ;
	
	public String chassisNumber ;

	
        public Bikes()
	    {
		
	    }
	
        public  Bikes (String motorType, String vehicalType,String engineType ,String vehicalColour,String model,double price,String chassisNumber)
	
        {
		
		super(motorType,vehicalType,engineType,vehicalColour);
		this.model = model ;
		this.price = price ;
		this.chassisNumber = chassisNumber ;
		
	    }
	


        public void display()
	{   
	
	    super.display();
		System.out.println("Bike Model: "+model) ;
		System.out.println("Bike price: "+price) ;
		System.out.println("Bike Chassis Number: "+chassisNumber) ;
		
	}

	
}