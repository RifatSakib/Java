class Car extends Vehicals
{
	public String brandName ;
	public int seatNumber ;
 

        public Car()
	    {
		
	    }
		
        public  Car(String name ,int plateNumber, int wheelNumber, String brandName,int seatNumber)
        {
		super(name,plateNumber,wheelNumber);
		this.brandName = brandName ;
		this.seatNumber = seatNumber ;
	    }
		
	    public void show()
	{   System.out.println("name: "+name) ;
		System.out.println("plateNumber: "+plateNumber) ;
		System.out.println("wheelNumber: "+wheelNumber) ;
		System.out.println("brandName: "+brandName) ;
		System.out.println("seatNumber: "+seatNumber) ;
				
	}
	
}