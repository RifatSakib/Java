class Employee 
{
	public String name ;
 
	public int workingHour ;

	private int salary;
	
	
        public Employee (String name)
	 {
		this.name = name ;
	 }
	
        public Employee (String name, int workingHour, int salary)
	
        {
		this.name = name ;
		this.workingHour = workingHour ;
		this.salary = salary;
	}
	
	 
        public void setSal(int salary ) 
	
        {
		this.salary = salary ;
	
        }
	
	
        public float getSal()
	{
		
                return salary ;
	
        }
	

        void showInformation()
	{
		System.out.println("Name: "+name) ;
		System.out.println("Working Hour: "+workingHour) ;
		System.out.println("salary: "+salary) ;
	}

	
}

----------------------------------------------------------------------------------------------------------
class Person

{
	public static void main(String arg[])
	
        {
		Employee  e1 = new Employee ("Rifat", 8, 40000 ) ;
		e1.showInformation() ;
	}
}