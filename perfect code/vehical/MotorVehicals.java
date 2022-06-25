class MotorVehicals extends Vehicals
{
	public String motorType ;
 
	public String vehicalType ;

	
        public MotorVehicals()
	    {
		
	    }
	
        public  MotorVehicals (String engineType ,String vehicalColour, String motorType , String vehicalType)
	
        {
		
		super(engineType,vehicalColour);
		this.motorType = motorType ;
		this.vehicalType = vehicalType ;
		
	    }
	
        public void display()
	{   
	
	    super.display();
		System.out.println("Motor Type: "+motorType) ;
		System.out.println("Vehical Type: "+vehicalType) ;
		
	}

	
}