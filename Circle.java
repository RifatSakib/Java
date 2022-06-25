class Circle
{	
       private String cName;
       public double pi;
       public double radius;
  	
        public Circle()
	    {
		
	    }
	
        public  Circle (double pi ,double radius, String cName)
	
        {
		this.pi = pi ;		
		this.radius = radius ;		
		this.cName = cName ;		
	    }
	 
	 
	 public void setcName(String cName)
	   {
	        this.cName = cName ;
	   
	   }
	     public String getcName()
	   {
	       return this.cName = cName ;
	   
	   }


        public void calculateArea()
	{
		System.out.println("this is : "+cName) ;
		System.out.println("PI: "+pi) ;
		System.out.println("radius: "+radius) ;
		System.out.println("areaof circle is : "+(pi*radius*radius)) ;
		
	}

	
}