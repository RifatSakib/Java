
class Library
{
	public String name;
    public String address;
    Book book[] ;

	
        public Library(String name, String address, Book book1,Book book2)
	
        {
		
		this.name = name ;
		this.address = address ;
		this.book[0]  = book1 ;
		this.book[1]  = book2 ;
	    }
	
      
        public void show()
	{   
	
		System.out.println("Name: "+name) ;
		System.out.println("address: "+address) ;
		System.out.println("book name: "+book[0].bookName+ "Author Name:" +book[0].authorName+ "No Of Copy:" +book[0].noOfCopy) ;
		System.out.println("book name: "+book[1].bookName+ "Author Name:" +book[1].authorName+ "No Of Copy:" +book[1].noOfCopy) ;
			
	}

	
}