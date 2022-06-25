public class Start 
{
    public static void main(String args[])
    {
        Book ob1=new Book();
        ob1.SetBookTitle("Java Expert.");
        ob1.SetAuthorName("Tisha");
        ob1.SetPublisherName("famous book");
        ob1.showBookInfo();

        Book ob2 = new Book("C++","Bruce","Shohana");
        ob2.showBookInfo();
    }
}


