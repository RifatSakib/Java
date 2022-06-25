class Bikes extends Vehicals
{
	public String brandName ;
 

        public Bikes()
	    {
		
	    }
	
        public  Bikes (String name ,int plateNumber, int wheelNumber, String brandName)
	
        {
		
		super(name,plateNumber,wheelNumber);
		this.brandName = brandName ;
			
	    }
	
    public void show()
	{   System.out.println("name: "+name) ;
		System.out.println("plateNumber: "+plateNumber) ;
		System.out.println("wheelNumber: "+wheelNumber) ;
		System.out.println("brandName: "+brandName) ;
				
	}


	
}