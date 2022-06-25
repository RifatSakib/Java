
class Main
{
	public static void main(String arg[])
   {
    Shape s;
    s = new Rectangle(5.5,2.5);
    s.display(); 
	s.calculateArea();
    s.calculatePerimeter(); 
    
	
	s = new Triangle(5.5,2.5,3.5);
    s.display();  
	s.calculateArea();
    s.calculatePerimeter(); 
   	
	
	s = new Circle(5.5,2.5);
    s.display(); 
	s.calculateArea();
    s.calculatePerimeter();
	
 
   }
}