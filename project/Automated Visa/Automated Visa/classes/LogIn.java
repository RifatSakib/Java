package classes;

import java.util.HashMap;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;


public class LogIn extends SignUp{
	
	
	
	
	public LogIn(){
		super();
		
		
	}
	
	
	boolean VerifyLogIn(String LogInMail, String LogInpass) throws FileNotFoundException {
		
		
		File file = new File("D:\\Automated Visa\\Applicants\\"+LogInMail+".txt");
		Scanner sc = new Scanner(file);
		try{
		boolean exists = file.exists();
		
		if(exists){
			
			
			while (sc.hasNextLine()) {
				
				String password = sc.nextLine().toString();
				
				if(password.equals(LogInpass)){
					
					return true;
				}
			}
			
			
		}else{
			
			throw new FileNotFoundException("File not found");
		}
		}catch(FileNotFoundException e){
			
			System.out.println(e.getMessage());
		}
		
		return false;
		
		
	}
	
	boolean verifyId(String Oid){
		
		File file = new File("D:\\Automated Visa\\Applications\\"+Oid+".txt");
		
		try{
		Scanner sc = new Scanner(file);
		boolean exists = file.exists();
		
		if(exists){
			
			
			return true;
			
			
		}else{
			
			throw new FileNotFoundException(" ");
		}
		}catch(FileNotFoundException e){
			
			System.out.println("\nApplication Id is incorrect\n");
		}
		
		return false;
		
		
		
		
		
		
	}
	
	
	
}