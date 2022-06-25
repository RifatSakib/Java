import project.demo;
import java.util.Scanner;
class Main
{
	public static void main(String arg[])
   {

Scanner input = new Scanner (System.in);

int choice;
double radcircle,areacircle,sidea,sideb,arearect,baset,height,areat;
System.out.println("select your choice") ;
System.out.println("1=circle\n2=rectangle\n3=triangle\n") ;
choice = input.nextInt();



if (choice==1)
{
	
	
System.out.println("thank u for selecting circle\n");
System.out.println ("enter radius:");
radcircle = input.nextDouble();
Circle circle = new  Circle (3.1416, radcircle , "this is Circle");
circle.calculateArea();
Shape s = new Shape (53.1416, radcircle , circle);
s.calculateArea();
s.assoInfo();
}

else if (choice == 2)
{
	

System.out.println("thank u for selecting rectangle\n");
System.out.println ("enter ur sidea & sideb\n");
sidea = input.nextDouble();
sideb = input.nextDouble();
Rectangle r = new Rectangle(sidea,sideb);
r.calculateArea();

}

else if (choice==3)
{

System.out.println("thank u for selecting triangle\n");
System.out.println ("enter base and height\n");
baset = input.nextDouble();
height = input.nextDouble();
Triangle t;
t = new InfoTriangle (baset , height, "Triangle");
t.calculateArea();
t = new InfoTriangle (baset,height);
t.displayInfo();


}
    
 else
 {
System.out.println ("invalid number");
 }
    
   }
}