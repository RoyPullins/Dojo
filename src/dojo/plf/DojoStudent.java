package dojo.plf;

import java.util.Collection;

/**
 * Defines a DojoStudent.
 * 
 * @author Roy
 *
 */
public interface DojoStudent extends Person{
	
	/**
	 * Returns the Class that the Student is currently enrolled in. 
	 * @return
	 */
	public DojoClass getDojoClass();
	
	/**
	 * Sets the Class that the Student is Currently enrolled in. 
	 * 
	 * @param sClass
	 */
	public void setDojoClass(DojoClass sClass);
	
	/**
	 * Returns the current Grade of the Student. 
	 * @return
	 */
	public DojoGrade getGrade();
	
	/**
	 * Sets the current Grade of the Student. 
	 * @param grade
	 */
	public void setGrade(DojoGrade grade);
	
	/**
	 * Returns all the Students previous Grades. 
	 * @return
	 */
	public Collection<DojoGrade> previousGrades();
	
}
