package classes;
import java.io.*;
import interfaces.*;
import fileio.*;

public class Student implements CourseOperations{
	
	private String name;
	private String sid;
	private Course courses[] = new Course[100];
	int totalCourse=0;
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setSid(String sid){
	    this.sid=sid;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getSid(){
		return this.sid;
	}
	
	//These are from CourseOperations
	
	public void insertCourse(Course c){
		
		if(totalCourse<courses.length){
			
			courses[totalCourse++]=c;
			System.out.println("\nCourse Inserted Successfully...");
		}
		else{
			System.out.println("\nSomething Wrong, Course Cannot be Inserted...");
		}
	}
	
	public void removeCourse(Course c){
		int index=0;
		boolean found=false;
		
		for(int i=0;i<totalCourse;i++){
			
			if(courses[i]==c){
				
				index=i;
				found=true;
				break;
			}
		}
		if(found){
			
			for(int i=index;i<totalCourse-1;i++)
				
			courses[i]=courses[i+1];
			totalCourse--;
			
			System.out.println("\nCourse Removed Successfully...");
		}
		else{
			System.out.println("\nInvalid ID, Course doesn't exist...");
		}
	}
	
	public Course getCourse(String cid){
		int i;
		Course c = null;
		
		for(i=0;i<totalCourse;i++){
			
			if(courses[i] != null){
			
			    if(courses[i].getCid().equals(cid)){
					
					c = courses[i];
			        break;
				}
			}
		}
		return c;
	}
	
	public void showAllCourses(){
		System.out.print("\nThe courses that "+this.name +" has enrolled for are: ");
		System.out.print("\n------------------------Course----------------------");
		
		for(int i=0;i<totalCourse;i++){
			
			if(courses[i] != null){
				
				courses[i].showInfo();
				System.out.println();
			}
		}
	}
}