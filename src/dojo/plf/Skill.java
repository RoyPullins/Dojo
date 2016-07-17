package dojo.plf;

/**
 * A DojoSkill is a subset of a Grade. It defines a skill that a person is required to be competant at. 
 * 
 * @author Roy
 *
 */
public interface Skill {
	
	/**
	 * Returns a Skill name.
	 * @return
	 */
	public String getName();
	
	/**
	 * Sets a Skill name. 
	 * @param name
	 */
	public void setName(String name);
	
	/**
	 * Returns a Skill Description. 
	 * @return
	 */
	public String getDescription();
	
	/**
	 * Sets a Skill Description. 
	 * @param description
	 */
	public void setDescription(String description);
	
	/**
	 * Returns a boolean indicating if the Skill has been acheieved or not. 
	 * @return
	 */
	public boolean skillAchieved();
	
	/**
	 * Sets if a Skill  has been achieved or not. 
	 * @param achieved
	 */
	public void setSkillAchieved(boolean achieved);
	
	/**
	 * 
	 * @return
	 */
	public int getScore();
	
	public void setScore(int score);
}
