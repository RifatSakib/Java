class MainBook
{
	public static void main (String arg[])
   {
    Book book = new Book("octarin","abc",10);
    Book book1 = new Book("aj himur biye","xyz",30);
    Library b = new Library ("maloncho", "asaj",book,book1);
    b.show();
   }
}
	
