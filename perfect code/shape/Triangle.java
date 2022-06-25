class Triangle extends Shape
{
	
        public Triangle()
	    {
		
	    }
	
        public  Triangle(double height ,double width)
	
        {
		super(height,width);
		/*this.height = height ;
		this.width = width ;*/
		
	    }
	


        public void calculateArea()
	{
		System.out.println("height: "+height) ;
		System.out.println("width: "+width) ;
		System.out.println("area: "+(.5*height*width)) ;
		
	}

	
}