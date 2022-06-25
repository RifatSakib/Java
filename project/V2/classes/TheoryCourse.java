package classes;
import interfaces.*;

public class TheoryCourse extends Course{
	
	private double duration;
	
	public void setDuration(double duration){
		this.duration = duration;
	}
	
	public double getDuration(){
		return this.duration;
	}
	
	public void showInfo(){
		System.out.println("\nCourse Type: Theory Course");
		System.out.println("Course Name: "+name);
		System.out.println("Course ID: "+cid);
		System.out.println("Duration: "+duration+ " hours");
		System.out.println("Credit: "+credit);
	}
}