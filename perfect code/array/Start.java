class Start
{
public static void main(String arg[])
{ 
 
String arr[]= new String[]{"java","math","english"};
Student s1= new Student ("Rifat", "1-1235", 4.0f, arr);
s1.showInformation();
System.out.println();
String arr2[]= new String[]{"socialscience","pl1","datastructure"};
Student s2= new Student ("sifat", "1-123", 3.8f, arr2);
s2.showInformation();

}

}
