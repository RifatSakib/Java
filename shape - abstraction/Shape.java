public abstract class Shape 
{
	public double height;
    public double width;

	
        public Shape()
	    {
		
	    }
	
        public Shape(double height ,double width)
	
        {
		this.height = height ;
		this.width = width ;
		
	    }

        public abstract void calculateArea();
        public abstract void calculatePerimeter();
        public abstract void display();
	
	
}