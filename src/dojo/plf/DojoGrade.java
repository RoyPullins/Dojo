package dojo.plf;

import java.awt.Color;
import java.util.Collection;

/**
 * A Grade or Achievement for a Student or Master. Usually belt gradings.  
 * @author Roy
 *
 */
public interface DojoGrade{
	
	/**
	 * Returns a Grades name.
	 * @return
	 */
	public String getName();
	
	
	/**
	 * Sets a Grades name
	 * @param gradename
	 */
	public void setName(String gradename);
	
	/**
	 * Returns a Grades desription.
	 * @return
	 */
	public String getDescription();
	
	/**
	 * Sets a Grades description
	 */
	public void setDescription(String description);
	
	/**
	 * Returns a Grades Major colour.i.e Black belt.
	 * @return
	 */
	public Color getGradeColourMajor();
	
	/**
	 * Sets a Grades Major colour. i.e Black belt. 
	 * @param colour
	 */
	public void setColourMajor(Color colour);
	
	/**
	 * Returns a Grades Minor colour. To be used in combination with major colour. i.e Purple with white stripe. 
	 * @return
	 */
	public Color getColourMinor();
	
	/**
	 * Sets a Grades Minor colour. To be used in combination with major colour. i.e Purple with white stripe. 
	 * @param colour
	 */
	public void setColourMinor(Color colour);	
	
	/**
	 * Returns the set of Skill required to earn the grade. 
	 * @return
	 */
	public Collection<Skill> getSkills();
	
	/**
	 * Sets the set of Skill required to earn the grade. 
	 * @param skills
	 */
	public void setSkills(Collection<Skill> skills);
	
	/** 
	 * Updates a Single skill from the grades Skill Set. 
	 * @param skill
	 */
	public void updateSkill(Skill skill);

}
