class Student 
{ 
  public String name;
  public String id;
  private float cgpa;
  public String courses[];
  
  public Student()
  {
  
  }
  

public Student(String name, String id, float cgpa,String courses[])  
{
  this.name= name;
  this.id=id;
  this.cgpa=cgpa;
  this.courses = courses;
}

public void setCgpa(float cgpa)
{ 
this.cgpa= cgpa;
}

public float getCgpa()
{
return cgpa ;


}
public void showInformation()
{
  System.out.println( "Name:"+name);
  System.out.println( "id:"+id);
  System.out.println( "Cgpa:"+cgpa);
  	
   for (int i=0; i<3; i++)
  {
     System.out.println( "courses"+(i+1)+":"+courses[i]);
  
  }
  
}
 
 
  



}