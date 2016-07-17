package dojo.plf;

/**
 * Defines a Location for a DojoClass. 
 * @author Roy
 *
 */
public interface DojoLocation extends Address{
	
	/**
	 * Gets a locations name. i.e. Westpac Stadium, Westfield Gym
	 * @return
	 */
	public String getLocationName();
	
	/**
	 * Sets a locations name. i.e. Westpac Stadium, Westfield Gym
	 * @param name
	 */
	public void setLocationName(String name);
	
}
