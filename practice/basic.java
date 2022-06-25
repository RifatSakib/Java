public class Contact {

private String personName;
private String personId;
privateint age;
private String mobileNumber;
private char gender; 

public Contact() 

    {

    }

public Contact(String personName, String personId, int age, String mobileNumber, char gender) 
{
super();
this.personName = personName;
this.personId = personId;
this.age = age;
this.mobileNumber = mobileNumber;
this.gender = gender;
    }
public String getPersonName()
 {
returnpersonName;
    }
public void setPersonName(String personName) 
{
this.personName = personName;
    }
public String getPersonId() 
{
returnpersonId;
    }
public void setPersonId(String personId) 
{
this.personId = personId;
    }
publicintgetAge() 
{
return age;
    }
public void setAge(int age) 
{
this.age = age;
    }
public String getMobileNumber() 
{
returnmobileNumber;
    }
public void setMobileNumber(String mobileNumber) 
{
this.mobileNumber = mobileNumber;
    }
public char getGender() 
{
return gender;
    }
public void setGender(char gender) 
{
this.gender = gender;
    }
public void showPersonInfo() 
{

System.out.println("Name   : "+personName);
System.out.println("Id     : "+personId);
System.out.println("Gender : "+gender);
System.out.println("Mobile : "+mobileNumber);

    }

public void detectMobileOperator() 
{

if(mobileNumber.charAt(2) == '7' || mobileNumber.charAt(2) == '3')
	{
System.out.println("GP Operator");
    }
else if(mobileNumber.charAt(2) == '9' || mobileNumber.charAt(2) == '4') 
{
System.out.println("Banglalink Operator");
    }
else if(mobileNumber.charAt(2) == '8') 
{
System.out.println("Robi Operator");
    }
else {
System.out.println("Other Operator");
    }


  }
}
public class MainActivity_Contact 
{

public static void main(String[] args)
 {

        Contact c1 = new Contact ("rifat", "254-1", 17, "016.......1", 'M');
  Contact c2 = new Contact ("hasan", "256-1", 15, "018.........2", 'M');
        Contact c3 = new Contact ("tomalika", "257-1", 20, "017...........3", 'F');
Contact c4 = new Contact ("juhi", "103-1", 22, "015.......1", 'F');


c1.showPersonInfo();
c1.detectMobileOperator();
System.out.println();

c2.showPersonInfo();
c2.detectMobileOperator();
System.out.println();

c3.showPersonInfo();
c3.detectMobileOperator();
System.out.println();

c4.showPersonInfo();
c4.detectMobileOperator();
System.out.println();

    }
}




