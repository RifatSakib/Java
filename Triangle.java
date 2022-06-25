public abstract class  Triangle extends Shape
{

	private String tName;
    
	
        public Triangle()
	    {
		
	    }
	
        public  Triangle(double element1 ,double element2, String tName)
	
        {
		super(element1,element2);
		this.tName = tName ;
		
	    }
		
		public  Triangle(double element1 ,double element2)
	
        {
		super(element1,element2);
		
	    }
	   public void settName(String tName)
	   {
	        this.tName = tName ;
	   
	   }
	     public String gettName()
	   {
	       return this.tName = tName ;
	   
	   }


        public void calculateArea()
	{
		System.out.println("area: "+(.5*element1*element2)) ;
		
	}
       
 public abstract void displayInfo();
	
 

	
}