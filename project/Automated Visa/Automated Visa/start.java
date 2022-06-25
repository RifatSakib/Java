package classes;

import java.lang.*;
import java.io.File;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.io.FileNotFoundException;




public class start
{
    public static void main(String[] args) throws Exception
    {
       
        

        do
        {
			Admin admin = new Admin();
			Application a = new Application();
            Scanner sc = new Scanner(System.in);

            System.out.println("\n1.All Applications");
            System.out.println("2.View Applications");
			System.out.println("0.Exit\n");
            System.out.print("Enter: ");

            String choice = sc.nextLine();

            if(choice.equals("0"))
            {

                break;
            }
			if(!((choice.equals("0")) || (choice.equals("1")) || (choice.equals("2"))))
			{
				System.out.println("\nPlease Enter 0,1 or 2\n");
			}

            if(choice.equals("1"))
            {
                int nmm = admin.applicationCount();
				
				if(nmm<=0){
					
					System.out.println("\nNo Applications Available\n");
				}else{
					
					
					System.out.println("\n---All Applications--- \n\nTotal: "+(nmm)+"\n");
					admin.allApplications();
				}
                

            }
            else if (choice.equals("2"))
            {

                System.out.println("\n1.One By one");
                System.out.println("2.By Serial Number");
                System.out.println("3.By Application Id ");

                System.out.print("\nEnter: ");
                String choice1 = sc.nextLine();

                if(choice1.equals("1"))
                {


                    try
                    {

                        int number = admin.applicationCount();
						
                       if(number<=0){
						   
						   System.out.println("\nNo Applications Available\n");
						   
					   }else{
						   
						   
					    try{
                        for(int i=0; i<number; i++)
                        {

                            System.out.print("\nApplication number: "+i+1);

                            admin.openApplication(i);

                            System.out.print("\n\nResponse: ");
                            Scanner sc1 = new Scanner(System.in);
                            String res = sc1.nextLine();
                            admin.respond(res,i);

                            System.out.println("\n(0 to exit) Click Enter Go next->");
                            String next = sc1.nextLine();

                            if(next.equals("0"))
                            {
                                break;
                            }

                        }
						  System.out.println("\nNo more Application at this moment");
						}
						catch(ArrayIndexOutOfBoundsException ar){
							
							System.out.println("\nNo more Application at this moment");
						}
					   }



                    }
                    catch(InputMismatchException e)
                    {

                        System.out.println("Invalid Input, Enter numbers only");


                    }
                }
                else if(choice1.equals("2"))
                {


                        
               while(true){
                        try
                        {
                        
                            int nm = admin.applicationCount();
							
							if(nm<=0){
								
								System.out.print("\nNo Applications Available \n");
								break;
								
							}else{
								
							System.out.print("\nTotal Applications: "+nm+ "\nSerial From : 0 to "+(nm-1));	
							System.out.print("\n\nEnter Application serial (-1 to exit): ");
							
                            Scanner sc2 = new Scanner(System.in);
                            int num = sc2.nextInt();
							
							if(num==-1)
							{
								
								break;
							}else{
								
						    admin.openApplication(num);

                            System.out.print("\n\nResponse: ");
                            Scanner sc1 = new Scanner(System.in);
                            String res = sc1.nextLine();
                            admin.respond(res,num);

                            System.out.println("\n(0 to exit) Click Enter to go next->: ");
                            String next = sc1.nextLine();

                            if(next.equals("0"))
                            {
                                break;
						    }

							}
							}


                           




                        }
                        catch(InputMismatchException e)
                        {

                            System.out.println("Invalid Input, Enter numbers only");
							


                        }catch(ArrayIndexOutOfBoundsException b){
							
							int n = admin.applicationCount();
							
							System.out.println("You can enter upto: "+(n-1));
						}
			        }	
						

                    
                }else if (choice1.equals("3")){
		            while(true){
						
						int nm = admin.applicationCount();
							
							if(nm<=0){
								
								System.out.print("\nNo Applications Available \n");
								break;
								
							}else{
								
								try{
									Scanner sc3 = new Scanner(System.in);
									System.out.print("\nApplication Id: ");
									String oid = sc3.nextLine();
									admin.applicationById(oid);
									
									Scanner sc4 = new Scanner(System.in);
									System.out.print("\n\nResponse: ");
									String res = sc4.nextLine();
									admin.respondById(oid,res);
									
									System.out.println("\n(0 to exit) Click Enter to go next->: ");
									String next = sc4.nextLine();
									
									
									if(next.equals("0")){
										
										break;
									}
									
								}catch(FileNotFoundException e){
									
									System.out.println("\nApplication Id doesn't exist");
									
								}
							}
						
					}
					
					
					
				}



            }

        }while(true);


    }
	
	
}



