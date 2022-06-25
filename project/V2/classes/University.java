package classes;
import interfaces.*;

public class University implements StudentOperations{
	
	public int totalStudent=0;
	
	private Student students[] = new Student[500];
	
	//These are from StudentOperations
	
	public void insertStudent(Student s){
		
		if(totalStudent<students.length){
			
			students[totalStudent++]=s;
			System.out.println("\nStudent Inserted Successfully...");
		}
		else{
			System.out.println("\nSomething Wrong, Student Cannot be Inserted...");
		}
	}
	
	public void removeStudent(Student s){
		int index=0;
		boolean found=false;
		
		for(int i=0;i<totalStudent;i++){
			
			if(students[i]==s){
				
				index=i;
				found=true;
				break;
			}
		}
		if(found){
			
			for(int i=index;i<totalStudent-1;i++)
			
			students[i]=students[i+1];
			totalStudent--;
			
			System.out.println("\nStudent Removed Successfully...");
		}
		else{
			System.out.println("\nInvalid ID, Student doesn't exist...");
		}
	}
	
	public Student getStudent(String sid){
	    int i;
		Student s = null;
		
		for(i=0;i<totalStudent;i++){
			
			if(students[i] != null){
				
			    if(students[i].getSid().equals(sid)){
					
					s = students[i];
			        break;
				}
			}
		}
		return s;
	}
	
	public void showAllStudents(){
		
		for(int i=0;i<totalStudent;i++){
			
			if(students[i] != null){
				
				System.out.println("\nStudent Name: "+ students[i].getName());
				System.out.println("Student Id: "+ students[i].getSid());
				System.out.println("\n---Course List---");
				students[i].showAllCourses();
				System.out.println();
			}
		}
	}
}