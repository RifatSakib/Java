import java.util.*;
import java.io.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Main{
	public static void main(String args[]){
		try{
		    Scanner sc = new Scanner(System.in);
		    University u = new University();
			
			CourseDetails crd = new CourseDetails();
		    GradeDetails gd = new GradeDetails();
			
		    int option,input1,input2,input3,input4;
			
			System.out.println("-----------------------------------------");
		    System.out.println("               Welcome                   ");
			System.out.println("                  To                     ");
			System.out.println("       University Management System      ");
		    System.out.println("-----------------------------------------");
			
		do{	
			System.out.println();
		    System.out.println("1. Student Management");
		    System.out.println("2. Student Course Management");
		    System.out.println("3. Course History");
	        System.out.println("4. Exit");
			
			System.out.print("\nEnter any choice To Start: ");
			
			option= sc.nextInt();
			
			switch(option){
				case 1: 
				
				System.out.println("\t*****Student Management*****");
				System.out.println("\t----------------------------");
				System.out.println("1. Insert New Student");
		        System.out.println("2. Remove Existing Student");
		        System.out.println("3. Show All Students");
				System.out.println("4. Search A Student");
		        System.out.println("5. Go Back");
				
				do{
			        System.out.print("\nEnter any choice: ");
					
					input2 = sc.nextInt();
					
					switch(input2){
						case 1:
						System.out.println("\t***Insert New Student***");
					
					    System.out.print("How many Students you want to insert? " );
					    int n = sc.nextInt();
					
					    for(int i=0;i<n;i++){
						
					    System.out.println("\n----Student no."+(i+1)+"----");
					
					    System.out.print("Enter Student Name: ");
					    String n1 = sc.next();
					
					    System.out.print("Enter Student ID: ");
					    String id1 = sc.next();
					
					    Student s1 = new Student();
					    s1.setName(n1);
					    s1.setSid(id1);
					
					    u.insertStudent(s1);
						
					    }
						break;
						
						case 2:
						System.out.println("\t***Remove Existing Student***");
					
					    if(u.totalStudent==0){
			                System.out.println("There are no Students in the System...\n");
			                break;
		                }
						
					    System.out.print("Enter Student ID: ");
					    String id2 = sc.next();
						
					    Student s2 = u.getStudent(id2);
						try{
						    u.removeStudent(s2);
						}
						catch(NullPointerException x){
				            System.out.println("\nStudent doesnot exist...");
			            }
						
						
						break;
						
						case 3:
						System.out.println("\t***Displaying Students***");
						
						if(u.totalStudent==0){
			                System.out.println("There are no Students in the System...\n");
			                break;
		                }
						
					    u.showAllStudents();
						break;
						
						case 4:
						System.out.println("\t***Search A Student***");
						
						if(u.totalStudent==0){
			                System.out.println("There are no Students in the System...\n");
			                break;
		                }
						
					    System.out.print("Enter Student ID: ");
					    String id3 = sc.next();
						
					    try{
					        Student s3 = u.getStudent(id3);
							
					        if(s3 != null){
					
					            System.out.println("\nStudent ID: "+s3.getSid());
					            System.out.println("Student Name: "+s3.getName());
						        s3.showAllCourses();
					        }
						}
					    catch(NullPointerException x){
				            System.out.println("\nStudent doesnot exist...");
			            }
						
						break;
						
						case 5:
					    System.out.println("\t***Going Back To Main Menu***");
					    break;
						
						default :
						System.out.println("Invalid Option!! Enter Again...");
						break;
					}
				}
				while(input2!= 5);
				break;
				
				case 2: 
				
				System.out.println("\t*****Student Course Management*****");
				System.out.println("\t-----------------------------------");
				System.out.println("1. Insert New Course");
		        System.out.println("2. Remove Existing Course");
				System.out.println("3. Show All Courses");
				System.out.println("4. Search A Course");
				System.out.println("5. Go Back");
				
				do{
			        System.out.print("\nEnter any choice: ");
					
					input3 = sc.nextInt();
					
					switch(input3){
						case 1:
						System.out.println("\t***Insert New Course***");
						
						if(u.totalStudent==0){
			                System.out.println("There are no Students in the System, Add a Student First...\n");
			                break;
		                }
						
					    System.out.print("How many Courses you want to insert? " );
					    int n = sc.nextInt();
						
					    for(int i=0;i<n;i++){
						
					    System.out.println("\n----Course no."+(i+1)+"----");
						
						System.out.println("Which Type of Course Do you Want to Add?");
						System.out.println("1. Theory Course");
						System.out.println("2. Lab Course");
						
						System.out.print("Your Type: ");
						int type = sc.nextInt();
						
						Course c1 = null;
						
						if(type == 1){
							
							System.out.print("Enter Course Name: ");
					        String n1 = sc.next();
							
					        System.out.print("Enter Course ID: ");
					        String id1 = sc.next();
							
							System.out.print("Enter Duration: ");
					        double d1 = sc.nextDouble();
							
							System.out.print("Enter Credit: ");
					        int cr1 = sc.nextInt();
							
							TheoryCourse tc = new TheoryCourse();
					
					        tc.setName(n1);
					        tc.setCid(id1);
							tc.setDuration(d1);
							tc.setCredit(cr1);
							
							c1 = tc;
							crd.writeInFile("Course Name: "+n1+"\n"+"Course Type: Theory Course"+"\n"+"Course ID: "+id1+"\n"+"Course Duration: "+d1+"\n"+"Course Credit: "+cr1);
						}
						else if(type == 2){
							System.out.print("Enter Course Name: ");
					        String n1 = sc.next();
					
					        System.out.print("Enter Course ID: ");
					        String id1 = sc.next();
							
							System.out.print("Enter Duration: ");
					        double d2 = sc.nextDouble();
							
							System.out.print("Enter Credit: ");
					        int cr2 = sc.nextInt();
							
							LabCourse lc = new LabCourse();
					
					        lc.setName(n1);
					        lc.setCid(id1);
							lc.setDuration(d2);
							lc.setCredit(cr2);
							
							c1 = lc;
							crd.writeInFile("Course Name: "+n1+"\n"+"Course Type: Lab Course"+"\n"+"Course ID: "+id1+"\n"+"Course Duration: "+d2+"\n"+"Course Credit: "+cr2);
						}
						else{
							System.out.println("Invalid Type...");
						}
						
						if(c1 != null){
							System.out.print("Enter Student ID: ");
							String s1 = sc.next();
							
							try{
							    u.getStudent(s1).insertCourse(c1);
							    crd.writeInFile("Student ID: "+s1+" has taken this course"+"\n"+".................................");
							}
							catch(NullPointerException x){
				                System.out.println("\nStudent doesnot exist...");
			                }
						}
					}
						break;
						
						case 2:
						System.out.println("\t***Remove Existing Course***");
						
						if(u.totalStudent==0){
			                System.out.println("There are no Courses in the System...\n");
			                break;
						}
						
						System.out.print("Enter Student ID: ");
						String s2 = sc.next();
						
					    System.out.print("Enter Course ID: ");
					    String id2 = sc.next();
						
						try{
						    u.getStudent(s2).removeCourse(u.getStudent(s2).getCourse(id2));
						}
						catch(NullPointerException x){
				            System.out.println("\nStudent/Course doesnot exist...");
			            }
						break;
						
						case 3:
						System.out.println("\t***Displaying Courses***");
						
						if(u.totalStudent==0){
			                System.out.println("There are no Courses in the System...\n");
			                break;
						}
						
						System.out.print("Enter Student ID: ");
						String s3 = sc.next();
						
						try{
						    u.getStudent(s3).showAllCourses();
						}
						catch(NullPointerException x){
				            System.out.println("\nStudent/Course doesnot exist...");
			            }
						break;
						
						case 4:
						System.out.println("\t***Search A Course***");
						
						if(u.totalStudent==0){
			                System.out.println("There are no Courses in the System...\n");
			                break;
						}
						
						System.out.print("Enter Student ID: ");
						String s4 = sc.next();
						System.out.print("Enter Course ID: ");
						String id3 = sc.next();
						
						try{
						    Course c = u.getStudent(s4).getCourse(id3);
						    if(c != null){
							c.showInfo();
							}
						}
						catch(NullPointerException x){
				            System.out.println("\nStudent/Course doesnot exist...");
			            }
						break;
						
						case 5:
						
						System.out.println("\t***Going Back To Main Menu***");
						break;
						
						default :
						System.out.println("Invalid Option!! Enter Again...");
						break;
					}
				}
				while(input3!= 5);
				break;
				
				case 3:
				
				System.out.println("\t*****Course History*****");
				System.out.println("\t------------------------");
				System.out.println("1. Show Grade of a Course");
		        System.out.println("2. Show History");
				System.out.println("3. Go Back");
				
				do{
			        System.out.print("\nEnter any choice: ");
					
					input4 = sc.nextInt();
					
					switch(input4){
						case 1:
					    System.out.println("\t***Show Grade***");
						
						if(u.totalStudent==0){
			                System.out.println("There are no Students in the System, Add a Student First...\n");
			                break;
		                }
						
						System.out.print("Enter Student ID: ");
						String s1 = sc.next();
						
						System.out.print("Enter Course ID: ");
						String c1 = sc.next();
						
						System.out.print("Enter Mid Marks: ");
						double m1 = sc.nextDouble();
						
						while(m1>100){
		    	            System.out.println("\nInvalid marks! Marks must be within 100. Enter Again...");
							
		                    System.out.print("Enter Mid Marks: ");
			                m1 = sc.nextDouble();
		                }
						
						System.out.print("Enter Final Marks: ");
						double f1 = sc.nextDouble();
						
						while(f1>100){
		    	            System.out.println("Invalid marks! Marks must be within 100.Enter Again.");
							
		                    System.out.print("Enter Final Marks: ");
						    f1 = sc.nextDouble();
		                }
						
						try{
							gd.writeInFile("Total marks of the course id "+c1+ " is "+(m1*0.4+f1*0.6));
							u.getStudent(s1).getCourse(c1).showGrade(m1,f1);
						}
						catch(NullPointerException x){
				            System.out.println("\nStudent/Course doesnot exist...");
			            }
						break;
						
						case 2:
						System.out.println("\t***Showing History***");
						
						System.out.println("Which type of history do you want to see?");
						System.out.println("1. Course");
						System.out.println("2. Grade");
						
						System.out.print("Your Type: ");
						int type = sc.nextInt();

						switch(type){
							case 1:
							try{
						        crd.readFromFile();
						    }
						    catch(NullPointerException x){
				                System.out.println("\nFile doesnot exist...");
			                }
							break;
						
						    case 2:
							try{
						        gd.readFromFile();
						    }
						    catch(NullPointerException x){
				                System.out.println("\nFile doesnot exist...");
			                }
							break;
							
							default:
							System.out.println("Invalid Option!! Enter Again...");
						    break;
						}
						
						break;
						
						case 3:
						System.out.println("\t***Going Back To Main Menu***");
						break;
						
						default :
						System.out.println("Invalid Option!! Enter Again...");
						break;
					}
				}
				while(input4!= 3);
				break;
				
				case 4:
				System.out.println("\t***System Closing...***");
				System.exit(0);
				break;
				
				default :
				System.out.println("Invalid Option!! Enter Again...");
				break;
			}
		}
		while(option!= 4);
		}
		catch(InputMismatchException a){
			System.out.println("Exception Occured!!! InputMismatchException...");
		}
	}
}