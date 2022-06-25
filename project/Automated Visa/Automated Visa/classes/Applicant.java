package classes;

import Interfaces.*;

public class Applicant extends LogIn implements PersonalInfo,TravelInfo {
	
	public String Name;
    public String pAdress;
    public String contactNo;
    public String adressInBd;
    public String bdContactNo;
    public String bdContactEmail;
    public String Dob;
    public String sex;
    public String placeOfBirth;
    public String nationality;
    public String occupation;
    public String maritalStatus;
	public String PassportNo;
    public String PassportDate;
    public String PassportExpierydate;
    public String previousVisit;
	public String oid;
	public String entry;
	public String country;

    public Applicant() {
		super();
    }

    public Applicant(String Name,String pAdress,String contactNo,String oid) {
		
		this.Name = Name;
		this.pAdress = pAdress;
		this.contactNo = contactNo;
		this.oid = oid;
		
		
		
	}
	
	
	public String getId(){
		
		return oid;
	}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getpAdress() {
        return pAdress;
    }

    public void setpAdress(String pAdress) {
        this.pAdress = pAdress;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }


    public String getAdressInBd() {
        return adressInBd;
    }

    public void setAdressInBd(String adressInBd) {
        this.adressInBd = adressInBd;
    }

    public String getBdContactNo() {
        return bdContactNo;
    }

    public void setBdContactNo(String bdContactNo) {
        this.bdContactNo = bdContactNo;
    }

    public String getBdContactEmail() {
        return bdContactEmail;
    }

    public void setBdContactEmail(String bdContactEmail) {
        this.bdContactEmail = bdContactEmail;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String dob) {
        Dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
	
	
	
	

	 public String getPassportNo() {
        return PassportNo;
    }

    public void setPassportNo(String passportNo) {
        PassportNo = passportNo;
    }

    public String getPassportDate() {
        return PassportDate;
    }

    public void setPassportDate(String passportDate) {
        PassportDate = passportDate;
    }

    public String getPassportExpierydate() {
        return PassportExpierydate;
    }

    public void setPassportExpierydate(String passportExpierydate) {
        PassportExpierydate = passportExpierydate;
    }

    public String getPreviousVisit() {
        return previousVisit;
    }

    public void setPreviousVisit(String previousVisit) {
        this.previousVisit = previousVisit;
    }
	
	public void showDetails()
	{
		System.out.println("\nName: "+Name);
		System.out.println("Address: "+pAdress);
		System.out.println("Contact: "+contactNo);
		System.out.println("Id: "+oid);
	}
	
	public String getVisaEntry(){
		
		return entry;
	}
	
	public void setVisaEntry(String entry){
		
		this.entry = entry;
		
		
	}
	
	public String getCountry(){
		
		
		return country;
	}
	
	public void setCountry(String country){
		
		this.country = country;
		
	}
	
	
}