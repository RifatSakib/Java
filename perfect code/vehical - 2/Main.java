class Main
{
	public static void main(String arg[])
   {
   Vehicals v = new Vehicals ( "motor vehicals", 101 , 4 );
   v.show(); 
   v = new Bikes ( "motor vehicals", 101 , 4, "honda");
   v.show();
   v = new Car ( "motor vehicals", 101 , 4, "honda",2);
   v.show();
   Bikes b = new Bikes ( "motor vehicals", 101 , 4, "honda");
   b.show();
   Car c = new Car ("motor vehicals", 101 , 4, "honda",2);
   c.show();
     
   }
}
	