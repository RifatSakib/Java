abstract class  MotorVehicals implements Vehicals
{
	public String motorType ;
 
	public String vehicalType ;
	
	public String color ;

	
      
         public MotorVehicals (String motorType , String vehicalType,String color)
	
        {
		
		this.motorType = motorType ;
		this.vehicalType = vehicalType ;
		this.color = color ;
		
	    }
		  
		  public void parts ()
	
        {
		
		return motorType;
		return vehicalType;
		/*System.out.println("Motor Type: "+motorType) ;
		System.out.println("Vehical Type: "+vehicalType) ;
		*/
	    }
	
        public void colors()
	{   
	    return color;
		/*System.out.println("Vehical color: "+color) ;
		*/
	}

	
}