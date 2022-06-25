class Rectangle extends Shape
{	
       private String rName;
	
        public Rectangle()
	    {
		
	    }
	
             public  Rectangle (double element1 ,double element2, String rName)
	
        {
		super(element1,element2);
		this.rName = rName ;		
	    }
		
		  public  Rectangle (double element1 ,double element2)
	
        {
		super(element1,element2);
	    }
	 public void setrName(String rName)
	   {
	        this.rName = rName ;
	   
	   }
	     public String getrName()
	   {
	       return this.rName = rName ;
	   
	   }


        public void calculateArea()
	{
		System.out.println("this is : "+rName) ;
		System.out.println("hight: "+element1) ;
		System.out.println("base: "+element2) ;
		System.out.println("area: "+(element1*element2)) ;
		
	}

	
}