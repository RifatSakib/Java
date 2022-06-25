class Vehicals
{
	public String engineType ;
 
	public String vehicalColour ;
	


	
        public Vehicals()
	    {
		
	    }
	
        public  Vehicals(String engineType ,String vehicalColour)
	
        {
		this.engineType = engineType ;
		this.vehicalColour = vehicalColour ;
		
	    }
	


        public void display()
	{
		System.out.println("Engine Type: "+engineType) ;
		System.out.println("Vehical Colour: "+vehicalColour) ;
		
	}

	
}