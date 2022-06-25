class Triangle extends Shape
{
	public double base;
        public Triangle()
	    {
		
	    }
	
        public  Triangle(double height ,double width, double base)
	
        {
		super(height,width);
		this.base = base ;	
		
	    }
	


        public void calculateArea()
	{
		System.out.println("height: "+height) ;
		System.out.println("width: "+width) ;
		System.out.println("base: "+base) ;
		System.out.println("area: "+(.5*height*width)) ;
	
		
	}      

 	public void calculatePerimeter()
	{
	
	
		System.out.println("perimeter: "+(base+height+width)) ;
		
	}
		public void display()
	{
		
		
		 System.out.println("height: "+height) ;
		 System.out.println("width: "+width) ;
		 System.out.println("base: "+base) ;
		
	}
	
}