class Rectangle extends Shape implements IParameter 
{

        public Rectangle()
	    {
		
	    }
	
        public  Rectangle(double height ,double width )
	
        {
		super(height,width);
		
		
	    }
	


        public void calculateArea()
	{
		System.out.println("area: "+(height*width)) ;
		
	}
	
        
        public void calculateParameter()
	{   
	
	    System.out.println("height: "+height) ;
		System.out.println("width: "+width) ;
			
		
	}
	
}
     