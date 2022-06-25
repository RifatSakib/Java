
class Book 
{
    private String bookTitle;
    private String authorName;
    private int totalCopy=0;
    private String publisherName;

    public Book()
	{

    }
    public Book(String bookTitle,String authorName,String publisherName)
	{
        this.bookTitle=bookTitle;
        this.authorName=authorName;
        this.publisherName=publisherName;
    }

    public void SetBookTitle(String bookTitle)
	{
        this.bookTitle=bookTitle;
    }
    public void SetAuthorName(String authorName)
	{
        this.authorName=authorName;
    }
    public void SetPublisherName(String publisherName)
	{
        this.publisherName=publisherName;
    }

    public String GetBookTitle()
	{
        return this.bookTitle;
    }
    public String GetAuthorName()
	{
        return this.authorName;
    }
    public String GetPublisherName()
	{
        return this.publisherName;
    }

    public void showBookInfo()
	{
        totalCopy++;
        System.out.println("Book Title:"+GetBookTitle());
        System.out.println("Author Name:"+GetAuthorName());
        System.out.println("Publisher Name:"+GetPublisherName());
        System.out.println("Total Copy"+this.totalCopy);

    }
}

