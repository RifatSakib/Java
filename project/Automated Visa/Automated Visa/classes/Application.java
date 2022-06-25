package classes;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.HashMap;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.util.Scanner;


public class Application extends RandomString
{

    String applicationId;
    String Email;
    String password;

    public Application()
    {


    }

    String generateApplicationId()
    {
        int n = 5;

        return "OID-"+RandomString.getAlphaNumericString(n);

    }

    void setEmail(String mail)
    {

        Email = mail;


    }

    public String getEmail()
    {

        return Email;
    }

    boolean validMail(String mail)
    {
        File file = new File("D:\\Automated Visa\\Applicants\\"+mail+".txt");
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);

        try
        {
            Matcher matcher = pattern.matcher(mail);
            boolean exists = file.exists();

            if(matcher.matches() && !exists)
            {
                setEmail(mail);
                return true;

            }
            else if (exists)
            {

                throw new EmailException("\nEmail Already Exists");
            }
            else
            {
                throw new EmailException("\nInvalid Email, Try Again");
            }
        }
        catch(EmailException e)
        {

            System.out.println(e.getMessage());
        }

        return false;
    }


    void setPassword(String password)
    {
        this.password = password;
    }

    boolean validPassword(String PassWord)
    {

        try
        {
            String regex =  "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(PassWord);
            if(matcher.matches()&& PassWord.length()<=12)
            {
                setPassword(PassWord);
                return true;
            }
            else
            {

                throw new EmailException("\nPassword Not Valid, Try Again");
            }
        }
        catch(EmailException e)
        {

            System.out.println(e.getMessage());
        }
		
		
		System.out.println("\n->Password should be of minumum length 8 and maximum 12 ");
		System.out.println("\n->Password should contain minimum 1 uppercase and 1 lowercase leter ");
		System.out.println("\n->Password should contain minimum 1 number and any of these symbol [@#$%^&+=]\n");
							
        return false;
    }

    String getPassword()
    {

        return password;
    }


    void saveToFile(String applicationId,Applicant obj,FileWriter myWriter) throws Exception
    {



        BufferedWriter out = new BufferedWriter(myWriter);

        out.write("Name: "+obj.getName());
        out.write("\nPermanent Address: "+obj.getpAdress());
        out.write("\nPermanent Address: "+obj.getContactNo());
        out.close();
        this.applicationId = applicationId;


    }

    void save(String applicationId,String content) throws Exception
    {


        FileWriter myWriter = new FileWriter("D:\\Automated Visa\\Applications\\"+applicationId+".txt",true);
        BufferedWriter out = new BufferedWriter(myWriter);

        out.write("\n "+content);
        out.close();


    }


    void loadExistingFile(String Oid) throws FileNotFoundException
    {


        File file = new File("D:\\Automated Visa\\Applications\\"+Oid+".txt");


        try
        {
            Scanner sc1 = new Scanner(file);
            while (sc1.hasNextLine())
            {
                System.out.println(sc1.nextLine());
            }

        }
        catch(FileNotFoundException e)
        {

            System.out.println("No file exists");

        }


    }


    int checkProgress(String oid)throws FileNotFoundException{
		
		
		File file = new File("D:\\Automated Visa\\Applicantion\\"+oid+".txt");
		Scanner sc = new Scanner(file);
		try{
		boolean exists = file.exists();
		
		if(exists){
			
			
			while (sc.hasNextLine()) {
				
				String password = sc.nextLine().toString();
				
				if(password.equals("Part-1")){
					
					return 1;
				}
				else if(password.equals("Part-1")&&password.equals("Part-2")){
					
					return 2;
				}
			}
			
			
		}else{
			
			throw new FileNotFoundException("File not found");
		}
		}catch(FileNotFoundException e){
			
			System.out.println(e.getMessage());
		}
		
		return 0;
		
		
		
		
	}


}
