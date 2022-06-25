class Rectangle extends Shape
{
	
        public Rectangle()
	    {
		
	    }
	
        public  Rectangle(double height ,double width)
	
        {
		super(height,width);
		/*this.height = height ;
		this.width = width ;*/
		
	    }
	


        public void calculateArea()
	{   
	   
		System.out.println("area: "+(height*width)) ;
		
		
	}   

	public void calculatePerimeter()
	{
		
		System.out.println("Perimeter: "+(2*(height+width))) ;
		
	}
	public void display()
	{
		
		
		 System.out.println("height: "+height) ;
		 System.out.println("width: "+width) ;
		
	}

	
}