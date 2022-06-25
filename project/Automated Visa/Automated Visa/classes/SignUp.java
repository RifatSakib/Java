package classes;

import java.util.HashMap;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SignUp extends Application{
	
	
	public SignUp(){
		super();
	
		
	}


	
	void SignUp() throws IOException {
		
		FileWriter file = new FileWriter("D:\\Automated Visa\\Applicants\\"+Email+".txt");
		try{
		   
		   file.write(password);
		   file.close();
		
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	
	
	
}