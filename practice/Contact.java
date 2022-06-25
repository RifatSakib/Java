class Contact
{   public String name;
	private String phoneNumber ;
	public String bloodGroup;
	public String email;
	private String address;
	
	
        public Contact()
	    {
		      System.out.println("its default");
	    }
	
        public Book(String name,String bloodGroup,String email,String phoneNumber,String address)
	
        {
		this.name = name ;
		this.bloodGroup = bloodGroup ;
		this.email = email;
		this.phoneNumber = phoneNumber ;
		this.address = address ;
	    }
	   public void setInfo(String phoneNumber,String address) 
	
        {
		this.phoneNumber = phoneNumber ;
		this.address = address ;
	
        }
	
        public int getInfo()
	    {
		
                return phoneNumber ;
                return address ;
			
	
        }
	
   
        public void show()
	{
		System.out.println("Contact name: "+name) ;
		System.out.println("Blood Group: "+bloodGroup) ;
		System.out.println("email: "+email) ;
		System.out.println("Phone Number: "+phoneNumber) ;
		System.out.println("address: "+address) ;
	}
   
}



class start

{
	public static void main(String arg[])
	
        {
		Contact e1 = new Contact("Rifat","B+","rifat@gmail.com","010000000","14/v main road");
		e1.show() ;
				
	    }
}