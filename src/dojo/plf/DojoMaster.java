package dojo.plf;

import java.util.Collection;

/**
 * The Definition of a DojoMaster. A Person who teaches one or more DojoClasses. 
 * @author Roy
 *
 */
public interface DojoMaster extends Person{
	
	/**
	 * Returns all DojoClass that this Master teaches.
	 * @return
	 */
	public Collection<DojoClass> getClasses();
	
	/**
	 * Adds a Class to the Masters Class list. 
	 * @param sClass
	 */
	public void addClass(DojoClass sClass);
	
	/**
	 * Removes a Class from the Masters Class list. 
	 * @param sClass
	 */
	public void removeClass(DojoClass sClass);
	
	/**
	 * Returns the Masters current grade or ranking. i.e Black Belt. 
	 * @return
	 */
	public DojoGrade getGrade();
	
	/**
	 * Sets the Masters Current grade. 
	 * @param grade
	 */
	public void setGrade(DojoGrade grade);
	
}
