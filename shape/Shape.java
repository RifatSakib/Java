class Shape 
{
	double height;
    double width;

	
        public Shape()
	    {
		
	    }
	
        public Shape(double height ,double width)
	
        {
		this.height = height ;
		this.width = width ;
		
	    }

        public void calculateArea()
	{
		System.out.println("height: "+height) ;
		System.out.println("width: "+width) ;
		
	}

	
}