class Vehicles
{
	public String engineType ;
 
	public String vehicleColour ;
	


	
        public Vehicles()
	    {
		
	    }
	
        public  Vehicles(String engineType ,String vehicleColour)
	
        {
		this.engineType = engineType ;
		this.vehicleColour = vehicleColour ;
		
	    }
	


        public void display()
	{
		System.out.println("Engine Type: "+engineType) ;
		System.out.println("Vehical Colour: "+vehicleColour) ;
		
	}

	
}