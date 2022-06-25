class Library
{
	public String name
public String address
public Book book[] 


	
       public Library()
	    {
		
	    }
	
        public Library(String Name, String address, Book book1,Book book2)
	
        {
		
		this.Name = Name ;
		this.address = address ;
		this.book[0]  = book1 ;
		this.book[1]  = book2 ;
	    }
	
      
        public void show()
	{   
	
		System.out.println("Name: "+Name) ;
		System.out.println("address: "+address) ;
		System.out.println("book: "+book[0]) ;
		System.out.println("book: "+book[1]) ;
				
	}

	
}