abstract class  Bikes implements Vehicals
{
	public String motorType ;
 
	public String vehicalType ;
	
	public String color ;

	
      
         public void parts (String motorType , String vehicalType)
	
        {
		
		this.motorType = motorType ;
		this.vehicalType = vehicalType ;
		System.out.println("Motor Type: "+motorType) ;
		System.out.println("Vehical Type: "+vehicalType) ;
		
	    }
	
        public void colors(String color)
	{   
	
        this.color = color ;
		System.out.println("Vehical color: "+color) ;
		
	}


	
}