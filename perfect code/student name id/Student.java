class Student 
{ 


  public String name;
  public String id;
  private float cgpa;
  public static int i;
  static
  {	  i=10;
	  System.out.println("static block");
  }
  public Student()
  {
  
  }
  
  public Student(String name)
{ 

   this.name= name;

}

public Student(String name, String id, float cgpa)  
{
  this.name= name;
  this.id=id;
  this.cgpa=cgpa;

}
public void setCgpa(float cgpa)
{ 
this.cgpa= cgpa;
}

public float getCgpa()
{
return cgpa ;


}
public void showInfo()
{
  System.out.println( "Name:"+name);
  System.out.println( "id:"+id);
  System.out.println( "Cgpa:"+cgpa);


}


}