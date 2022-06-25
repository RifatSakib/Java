package interfaces;
import classes.*;

public interface CourseOperations{
	
	void insertCourse(Course c);
	void removeCourse(Course c);
	Course getCourse(String cid);
	void showAllCourses();
}