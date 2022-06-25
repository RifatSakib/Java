class Vehicals
{
	public String name ;
	public int plateNumber ;
	public int wheelNumber ;
	
        public Vehicals()
	    {
		
	    }
		
        public  Vehicals(String name ,int plateNumber, int wheelNumber)
	
        {
		this.name = name ;
		this.plateNumber = plateNumber ;
		this.wheelNumber = wheelNumber ;
		}
	    public void start()
		
		{
			System.out.println(" welcome. 0 km run ");
			
		}	   

		public void Break()
		
		{
			System.out.println(" this is break ");
			
		}
		public void stop()
		
		{
			System.out.println(" this is stop. ");
			
		}
	
      
        public void show()
	{
		System.out.println("name: "+name) ;
		System.out.println("plateNumber: "+plateNumber) ;
		System.out.println("wheelNumber: "+wheelNumber) ;
		
	}

	
}