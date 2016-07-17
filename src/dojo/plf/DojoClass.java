package dojo.plf;

import java.sql.Date;
import java.sql.Time;
import java.time.DayOfWeek;
import java.util.Collection;

/**
 * Defines a DojoClass which is a Collection of DojoStuduent should provide access to a Student list and a
 * all required Class variables like a meeting time, Grading level etc. 
 * @author Roy
 *
 */
public interface DojoClass{
	
	/**
	 * Sets the weekly meeting Day and time for this class. 
	 * 
	 * @param dayOfWeek
	 * @param time
	 */
	public void setClassMeetingTime(DayOfWeek dayOfWeek, Time time);
	
	/**
	 * Returns the next forcast meeting date for this class. 
	 * @param date
	 * @return
	 */
	public Date getNextClassMeetingTime(Date date);
	
	/**
	 * Sets the Class meeting/teaching Location.
	 * @param location
	 */
	public void setLocation(DojoLocation location);
	
	/**
	 * Returns the class meeting/teaching Location 
	 * @return
	 */
	public DojoLocation getLocation();
	
	
	/**
	 * Returns a list of Students currently enrolled in this Class. 
	 * @return
	 */
	public Collection<DojoStudent> getStudents();

	/**
	 * Adds a Student to the Class role. 
	 * @param student
	 */
	public void addStudent(DojoStudent student);
	
	/**
	 * Removes a Student from the Class role. 
	 * @param student
	 */
	public void removeStudent(DojoStudent student);
}
