class InfoTriangle extends Triangle
{
	
        public InfoTriangle()
	    {
		
	    }
	    
		
		public  InfoTriangle(double element1 ,double element2, String tName)
	
        {
		super(element1,element2, tName);
		
	    }
        public  InfoTriangle(double element1 ,double element2)
	
        {
		super(element1,element2);
		
	    }
		 public void calculateArea()
	{
		System.out.println("area: "+(.5*element1*element2)) ;
		
	}
	  
        public void displayInfo()
	{
		System.out.println("hight: "+element1) ;
		System.out.println("base: "+element2) ;

	}

	
}