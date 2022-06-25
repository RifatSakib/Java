package classes;

import java.util.*;
import java.lang.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import Interfaces.*;




public class main
{


    public static void main(String[] arr)throws Exception
    {


        Applicant ob1 = new Applicant();
        Applicant visa1 = new Applicant();
        String email,pass;
		
		
		System.out.println
            ("\n     |------Visa Application For Bangladesh------|");
		System.out.println("     |___________________________________________|\n");
		System.out.println
            ("\nWelcome, Here you can apply for you visa application\n");
		System.out.println
            ("\nYou will require an Email-address to complete the online forms. \nThis is for security reasons and also so that we can contact you regarding your online application.\n");	
        System.out.println
            ("\nWe also suggest that you have the following information on hand \n~Passport\n~ 45mm x 35mm Digital Photo in JPEG format; Maximum size is 300kb (Photo is optional).\n~ Address in Bangladesh\n~ Email Address\n");
		
        System.out.println("\nIf approved you might be called for an interview with related documents\n");
		
		System.out.println("\n*****Tip: You can enter 0 to return at the start*****\n\n\n");
		
		
        int input=0;
        do
        {
            System.out.println
            ("\n1.Register and fill up the form \n2.See Application Status\n");
			System.out.print("Enter Option: ");
			
            try
            {
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();

            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid Input");
            }

            if(input==1)
            {

                try
                {
                    boolean f1,f2;


                    do
                    {
                        System.out.print("\nEmail: ");
                        Scanner sc = new Scanner(System.in);
                        email = sc.nextLine();
                        if((email.equals("0")))
                        {
                            f1=false;
                        }
                        else
                            f1=ob1.validMail(email);
                    }
                    while(!f1 && !(email.equals("0")));


                    if(f1==true)
                    {
                        do
                        {
						
                            System.out.print("Password: ");
							Scanner sc1 = new Scanner(System.in);
                            pass = sc1.nextLine();
                            
                            if(pass.equals("0"))
                            {
                                f2=false;
                            }
                            else
                                f2=ob1.validPassword(pass);
                        }
                        while(!f2 && !(pass.equals("0")));

                        if(f2==true)
                        {
                            boolean f=true;
                            ob1.SignUp();
                            System.out.println("Registration Successful");
                            Application app = new Application();

                            String id1 = app.generateApplicationId();
                            while(f)
                            {


                                Scanner personalInfo = new Scanner(System.in);

                                System.out.println("\n\n\nApplication ID: "+id1);

                                System.out.println("\n-----PERSONAL INFORMATION------\n");

                                System.out.print("Name(As Written in the passport): ");
                                visa1.setName(personalInfo.nextLine());
                                System.out.print("Permanent Address: ");
                                visa1.setpAdress(personalInfo.nextLine());
                                System.out.print("Contact Number: ");
                                visa1.setContactNo(personalInfo.nextLine());
                                System.out.print("Address In Bangladesh: ");
                                visa1.setAdressInBd(personalInfo.nextLine());
                                System.out.print("Contact Number In Bangladesh: ");
                                visa1.setBdContactEmail(personalInfo.nextLine());
                                System.out.print("Date Of Birth: ");
                                visa1.setDob(personalInfo.nextLine());
                                System.out.print("Place of Birth: ");
                                visa1.setPlaceOfBirth(personalInfo.nextLine());

                                String content1 = "\nName(As Written in the passport): "+visa1.getName().toUpperCase();
                                String content2 = "\nPermanent Address: "+visa1.getpAdress().toUpperCase();
                                String content3 = "\nContact Number: "+visa1.getContactNo().toUpperCase();
                                String content4 = "\nAddress In Bangladesh: "+visa1.getAdressInBd().toUpperCase();
                                String content5 = "\nContact Number In Bangladesh: "+visa1.getBdContactEmail().toUpperCase();
                                String content6 = "\nDate Of Birth: "+visa1.getDob().toUpperCase();
                                String content7 = "\nPlace of Birth: "+visa1.getPlaceOfBirth().toUpperCase();



                                System.out.println("\n\n|- Enter 2 to return to start page");
								System.out.println("|- Enter Any key to fill the part again");
                                System.out.println("|- Enter 1 to save & go to next option");

                                int saveNext;
                                try
                                {
                                    Scanner save= new Scanner(System.in);
                                    saveNext = save.nextInt();
                                    if(saveNext==1)
                                    {


                                        visa1.save(id1,"\n\n-----PERSONAL INFORMATION-----\n");
                                        visa1.save(id1,content1+content2+content3+content4+content5+content6);


                                        while(true)
                                        {
                                            Scanner TravelInfo = new Scanner(System.in);
                                            System.out.println("\n\n-----TRAVEL INFORMATION------\n");

                                            System.out.print("Passport Number: ");
                                            visa1.setPassportNo(TravelInfo.nextLine());
                                            System.out.print("Passport Date: ");
                                            visa1.setPassportDate(TravelInfo.nextLine());
                                            System.out.print("Expirey Date: ");
                                            visa1.setPassportExpierydate(TravelInfo.nextLine());
                                            System.out.print("Previous Visit: ");
                                            visa1.setPreviousVisit(TravelInfo.nextLine());


                                            String content8 = "\nPassport Number: "+visa1.getPassportNo().toUpperCase();
                                            String content9 = "\nPassport Date: "+visa1.getPassportDate().toUpperCase();
                                            String content10 = "\nExpirey Date: "+visa1.getPassportExpierydate().toUpperCase();
                                            String content11 = "\nPrevious Visit(Yes/No): "+visa1.getPreviousVisit().toUpperCase();


											System.out.println("\n\n|- Enter 2 to return to start page");
											System.out.println("|- Enter Any key to fill the part again");
                                            System.out.println("|- Enter 1 to save & go to next option");

                                            try
                                            {
                                                Scanner save1= new Scanner(System.in);
                                                int saveNext1 = save1.nextInt();

                                                if(saveNext1==1)
                                                {

                                                    visa1.save(id1,"-----TRAVEL INFORMATION-----");
                                                    visa1.save(id1,content8+content9+content10+content11);
													
													while(true){													
                                                    System.out.println("\n-----VISA INFORMATION------\n");
													
										
                                                    Visa visa = new Visa();
                                                    String country,entryNo,cl;

                                                    boolean verify;


                                                    do
                                                    {
                                                        Scanner visaInfo = new Scanner(System.in);
                                                        
														System.out.print("Enter 'y' to See Country List: ");
														
														cl = visaInfo.nextLine();
							
														
														if(cl.equals("y")){
															
															HashMap<String,Integer> countryList = new HashMap<>();
															
															countryList = visa.feeByCountrySingleEntry();
															System.out.println("\n"+countryList.keySet());
														}

                                                        System.out.print("\n\nEntry (Single/Multiple): ");

                                                        visa1.setVisaEntry(visaInfo.nextLine());
                                                        System.out.print("Country: ");
                                                        visa1.setCountry(visaInfo.nextLine());

                                                        country = visa1.getCountry().toUpperCase();
                                                        entryNo =visa1.getVisaEntry().toUpperCase();

                                                        
                                                        verify = visa.verifyInput(country,entryNo);
														
                                                    }
                                                    while(!verify);



                                                    double visaFee = visa.feeCalculation(country,entryNo);
                                                    
                                                    System.out.println("\nAmmount to be paid: "+visaFee);
													
													String fee = "\nVisa Fee: "+String.valueOf(visaFee);

                                                    System.out.println("\n|- Enter 1 to submit the application");

                                                    try
                                                    {
                                                        Scanner save2 = new Scanner(System.in);
                                                        int saveNext2=save2.nextInt();

                                                        if(saveNext2==1)
                                                        {
                                                            visa1.save(id1,"\nEntry: "+entryNo+"\nFrom (country): "+country+fee);
															System.out.println
	                                                        ("\n\nThank You, Your application has been submitted.");
															System.out.println
															("You can check your application status by logging in using your Email, Password and Application ID ");
															System.out.println
															("Your Application ID  is: "+id1);
															System.out.println
															("\nYou can be called for an Interview from the Embassy, The details will be informed");
															
															
                                                            return;

                                                        }
                                                        else if(saveNext2==2)
                                                        {

                                                            break;
                                                        }
                                                        else
                                                        {

                                                            throw new EmailException ("\nPlease Fillup again");
                                                        }


                                                    }
                                                    catch(InputMismatchException e)
                                                    {

                                                        System.out.println("Invalid Input! (only enter Numbers)");


                                                    }
                                                    catch(EmailException x)
                                                    {

                                                        System.out.println(x.getMessage());
                                                    }
													}

                                                }
                                                else if(saveNext1==2)
                                                {
                                                    break;

                                                }
                                                else
                                                {

                                                    throw new EmailException("\nPlease Fillup again");
                                                }

                                            }
                                            catch(InputMismatchException e)
                                            {

                                                System.out.println("Invalid Input! (only enter Numbers)");

                                            }
                                            catch(EmailException x)
                                            {

                                                System.out.println(x.getMessage());
                                            }
                                        }


                                    }
                                    else if(saveNext==2)
                                    {

                                        break;

                                    }
                                    else
                                    {
                                        throw new EmailException("\nPlease Fillup again");

                                    }

                                    break;
                                }
                                catch(InputMismatchException e)
                                {
                                    System.out.println("Invalid Input (only enter Numbers)");

                                }
                                catch(EmailException x)
                                {

                                    System.out.println(x.getMessage());
                                }

                            }


                        }
                    }


                }
                catch(IOException e)
                {

                    System.out.println(e.getMessage());
                }
            }
            else if(input==2)
            {

                Scanner sc3 = new Scanner(System.in);
				
				System.out.print("\nEmail: ");

                String email1 = sc3.nextLine();

                try
                {


                    if(email1.equals("0"))
                    {
                        break;
                    }
                    else
                    {

                        Scanner sc4 = new Scanner(System.in);
						
						System.out.print("Password: ");
                        String pass1 = sc4.nextLine();
						System.out.print("Application Id: ");
                        String Oid = sc4.nextLine();

                        boolean flag = ob1.VerifyLogIn(email1,pass1);
                        boolean oidCheck = ob1.verifyId(Oid);
                        if(flag==true)
                        {

                        
                            if(oidCheck==true)
                            {

                                ob1.loadExistingFile(Oid);
								return;
                               
                            }

                        }
                        else
                        {
                            System.out.println("Invalid Password\n");
                        }

                    }



                }
                catch(FileNotFoundException e)
                {

                    System.out.println("\nInvalid Email");
                }
            }
            else
            {
                System.out.println("  ");
                break;

            }
        }
        while(input!=0);
    }

}
