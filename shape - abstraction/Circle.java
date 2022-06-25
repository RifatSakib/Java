class Circle extends Shape
{
	
       

	   public Circle()
	    {
		
	    }
	
        public  Circle(double height ,double width)
	
        {
		super(height,width);
		/*this.height = height ;
		this.width = width ;*/
		
	    }
	


        public void calculateArea()
	{
		System.out.println("radius: "+height) ;
		System.out.println("area: "+(3.1416*height*height)) ;
		
		
	}    
	
	    public void calculatePerimeter()
	{

		System.out.println("perimeter: "+(2*(height+height))) ;
		
	}
		public void display()
	{
		
		
		 System.out.println("height: "+height) ;

		
	}

	
}