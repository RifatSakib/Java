class Book
{   public String bookTitle ;
	public String authorname ;
	public String publisherName ;
	public int totalCopy;
	public static int totalNumberOfBooks;
	
        public Book()
	    {
		      System.out.println("its default");
	    }
	
        public Book(String bookTitle,String authorname,String publisherName, int totalCopy)
	
        {
		this.bookTitle = bookTitle ;
		this.authorname = authorname ;
		this.publisherName = publisherName;
		this.totalCopy = totalCopy;
	    }
	  
   
        public void show()
	{
		System.out.println("Book Title: "+bookTitle) ;
		System.out.println("Author Name: "+authorname) ;
		System.out.println("Publisher Name: "+publisherName) ;
		System.out.println("Total Copy: "+totalCopy) ;
	}
    static 
		 {
		     totalNumberOfBooks = 0;
		 }
		 
	public static void showtotalNumberOfBooks()
	{
		System.out.println("Total Number Of Books: "+totalNumberOfBooks) ;
		
	}
}



class start

{
	public static void main(String arg[])
	
        {
		Book e1 = new Book("Positivity","ahemd chowdhuri","kamal",40000);
		e1.show() ;
		Book.totalNumberOfBooks=40500;
		Book.showtotalNumberOfBooks();
		
	    }
}