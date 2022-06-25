
class Main1
{
	public static void main(String arg[])
   {
   Shape s1= new Shape (5.5 2.5);
   Shape s2= new Rectangle (5.5 2.5);
   Shape s3= new Triangle(5.5 2.5);
   Rectangle r1 = new Rectangle(5.5,2.5);
   Rectangle r2 = new Triangle(5.5,2.5);
   Triangle t1 = new Triangle(5.5,2.5);
   s1.calculateArea();
   s2.calculateArea();
   s3.calculateArea();
   r1.calculateArea();
   r2.calculateArea();
   t1.calculateArea();
   }
}