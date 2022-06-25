package classes;
import interfaces.*;
import fileio.*;

public abstract class Course implements GradeOperations{
	
	protected String cid;
	protected String name;
	protected int credit;
	
	protected int midMarks;
	protected int finalMarks;
	
	public String grade;
	
	public void setCid(String cid){
		this.cid=cid;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setCredit(int credit){
		this.credit=credit;
	}
	
	public String getCid(){
		return this.cid;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getCredit(){
		return this.credit;
	}
	
	public abstract void showInfo();
	
	//This is from CourseOperations
	
	public void showGrade(double midMarks, double finalMarks){
		
		double Mark=((midMarks)*0.4) + ((finalMarks)*0.6);
		if(Mark>=0 && Mark<50){
			System.out.println("\nGrade of this course is: F");
		}
		else if(Mark>=50 && Mark<60){
			System.out.println("\nGrade of this course is: D");
		}
		else if(Mark>=60 && Mark<65){
			System.out.println("\nGrade of this course is: D+");
		}
		else if(Mark>=65 && Mark<70){
			System.out.println("\nGrade of this course is: C");
		}
		else if(Mark>=70 && Mark<75){
			System.out.println("\nGrade of this course is: C+");
		}
		else if(Mark>=75 && Mark<80){
			System.out.println("\nGrade of this course is: B");
		}
		else if(Mark>=80 && Mark<85){
			System.out.println("\nGrade of this course is: B+");
		}
		else if(Mark>=85 && Mark<90){
			System.out.println("\nGrade of this course is: A");
		}
		else if(Mark>=90 && Mark<=100){
			System.out.println("\nGrade of this course is: A+");
		}
		else{
			grade="Invalid";
		}
	}
}		