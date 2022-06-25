package classes;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.HashMap;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;


public class Admin
{
    String[] pathnames;


    public Admin()
    {



    }




    void openApplication(int num) throws Exception
    {


        File f = new File("D:\\Automated Visa\\Applications");


        this.pathnames = f.list();


        File file = new File("D:\\Automated Visa\\Applications\\"+this.pathnames[num]);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
        {

            System.out.println(sc.nextLine());
        }
    }



    public void allApplications() throws Exception
    {

        File f = new File("D:\\Automated Visa\\Applications");


        this.pathnames = f.list();


        for (int i=0; i<pathnames.length; i++)
        {

            System.out.println("Serial-"+i+" "+pathnames[i]);
        }

    }


    void respond(String res,int num) throws Exception
    {


        FileWriter myWriter = new FileWriter("D:\\Automated Visa\\Applications\\"+this.pathnames[num],true);
        BufferedWriter out = new BufferedWriter(myWriter);

        out.write("\n\n\nResponse:  "+res);
        out.close();


    }


	void respondById(String applicationId,String content) throws IOException
		{

            try{
					
				FileWriter myWriter = new FileWriter("D:\\Automated Visa\\Applications\\"+applicationId+".txt",true);
				BufferedWriter out = new BufferedWriter(myWriter);

				out.write("\n\n\nResponse:  "+content);
				out.close();
				
				
			}catch(IOException e){
				
			   System.out.println("\nSorry, unexpexted error occured!");
				
			}
			


		}
		

    int applicationCount()
    {

        File f = new File("D:\\Automated Visa\\Applications");


        this.pathnames = f.list();

        return this.pathnames.length;




    }



    void applicationById(String Oid) throws Exception
    {


        File file = new File("D:\\Automated Visa\\Applications\\"+Oid+".txt");


       
            Scanner sc1 = new Scanner(file);
            while (sc1.hasNextLine())
            {
                System.out.println(sc1.nextLine());
            }

        
      


    }


}
