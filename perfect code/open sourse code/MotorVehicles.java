class MotorVehicles extends Vehicles implements IMotorVehicles 
{
	public String motorType ;
	public String vehicleType ;
	public String kindOfwheelDrive ;
	public double runningHour ;

	
        public MotorVehicles()
	    {
		
	    }
	
        public  MotorVehicles (String engineType ,String vehicleColour, String kindOfwheelDrive,double runningHour,String motorType , String vehicleType )
	
        {
		
		super(engineType,vehicleColour);
		this.kindOfwheelDrive = kindOfwheelDrive ;
		this.runningHour = runningHour ;
		this.motorType = motorType ;
		this.vehicleType = vehicleType ;
		
	    }
	
        public void display()
	{   
	
	    super.display();
		System.out.println("Motor Type: "+motorType) ;
		System.out.println("vehicle Type : "+vehicleType) ;
		
	}
     public void kindOfwheelDrive()
	 {
		 System.out.println("kindOfwheelDrive "+kindOfwheelDrive) ;
 
	 }
	 
	    public void runningHour()
		
		{
			
		System.out.println("Running Hour " +runningHour) ;	
			
		}
	
}