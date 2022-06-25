class Shape implements IShape
{
	public double element1 ;
    public double element2;
    Circle circle;
	
        public Shape()
	    {
		
	    }
	
        public Shape(double element1 ,double element2,Circle circle)
	
        {
		this.element1 = element1 ;
		this.element2 = element2 ;
		this.circle = circle ;
		
	    }
		 public Shape(double element1 ,double element2)
	
        {
		this.element1 = element1 ;
		this.element2 = element2 ;
		
	    }

        public void calculateArea()
	{
		System.out.println("element1: "+element1) ;
		System.out.println("element2: "+element2) ;
		
	}
       
      public void assoInfo()
	{

        System.out.println("Type:"+circle.getcName()+"PI: "+circle.pi+"radius: "+circle.radius ) ;
	
		
	}

 public void show()
	{

        System.out.println("welcome to shape");
	
		
	}

	
}