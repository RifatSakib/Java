


class Contact 
{
    private String name;
    private double phoneNumber;
    private String countryCode;
    private String bloodGroup;
    private String email;
    private String address;

    public Contact()
	{

    }
    public Contact(String name,double phoneNumber,String countryCode,String bloodGroup,String email,String address)
	{
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.countryCode=countryCode;
        this.bloodGroup=bloodGroup;
        this.email=email;
        this.address=address;
    }

    public void SetName(String name)
	{
        this.name=name;
    }
    public void SetPhoneNumber(double phoneNumber)
	{
        this.phoneNumber=phoneNumber;
    }
    public void SetCountryCode(String countryCode)
	{
        this.countryCode=countryCode;
    }
    public void SetBloodGroup(String bloodGroup)
	{
        this.bloodGroup=bloodGroup;
    }
    public void SetEmail(String email)
	{
        this.email=email;
    }public void SetAddress(String address)
	{
        this.address=address;
    }

    public String GetName()
	{
        return this.name;
    }
    public double GetPhoneNumber()
	{
        return this.phoneNumber;
    }
    public String GetCountryCode()
	{
        return this.countryCode;
    }
    public String GetBloodGroup()
	{
        return this.bloodGroup;
    }
    public String GetEmail()
	{
        return this.email;
    }
    public String GetAddress()
	{
        return this.address;
    }
    public void showInformation(){
        System.out.println("Name: "+GetName());
        System.out.println("Phone Number: "+GetPhoneNumber());
        System.out.println("Country Code: "+GetCountryCode());
        System.out.println("Blood Group: "+GetBloodGroup());
        System.out.println("Email: "+GetEmail());
        System.out.println("Address: "+GetAddress());

    }
    public void checkOperator()
	{
        System.out.println("The operator is: ");
    }

}



public class Start 
{
    public static void main(String args[])
    {
        Contact ob1=new Contact("Tisha",017,"+880","A+","tisha311497@gmail.com","Bashundhara R/A");
        ob1.showInformation();
        Contact ob2=new Contact("Tisha1",01,"+880","A+","Tisha311497@gmail.com","Bashundhara R/A");
        ob1.showInformation();
    }
}