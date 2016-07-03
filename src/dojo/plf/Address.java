package dojo.plf;

/**
 * Basic Address definition. Can be used as a base object for any application/extension. 
 * Attempt to encompass all possible address situations.
 * 
 * @author William Roy Pullins
 *
 */
public interface Address {
	/**
	 * Returns a Address house/building name.
	 * 
	 * @return
	 */
	public String getBuildingName();
	
	/**
	 * Sets a Address house/building name.
	 * 
	 * @param buildingName
	 * 
	 */
	public void setBuildingName(String buildingName);
	

	/**
	 * Returns a Address building number. i.e 1, 1A.
	 * @return
	 */
	public String getBuildingNumber();
	
	/**
	 * Sets a Address building number i.e 1, 1A
	 * @param buildingNumber
	 */
	public void setBuildingNumber(String buildingNumber);

	/**
	 * Returns a Address building sublocality i.e Apartment 56, Unit 3, Flat 5 etc.
	 * @return
	 */
	public String getBuildingSublocality();
	
	/**
	 * Sets a Address building sublocality i.e Apartment 56, Unit 3, Flat 5 etc.
	 * 
	 * @param buildingSublocality
	 */
	public void setBuildingSublocality(String buildingSublocality);
	
	/**
	 * Returns a Address building level, ie floor 5, level 6
	 * 
	 * @return
	 */
	public String getBuildingLevel();
	
	/**
	 * Sets a Address building level, ie floor 5, level 6
	 * 
	 * @param buildingLevel
	 */
	public void setBuildingLevel(String buildingLevel);	
	
	/**
	 * Returns a Address building location/Street address. i.e Colorado Grove, Broomhedge Street, Hillsbury Lane.
	 * 
	 * @return
	 */
	public String getBuildingLocation();
	
	/**
	 * Sets a Address building location/Street address. i.e Colorado Grove, Broomhedge Street, Hillsbury Lane.
	 * 
	 * @param street
	 */
	public void setBuildingLocation(String street);
	
	/**
	 * Returns the Address suburb.
	 * 
	 * @return
	 */
	public String getSuburb();
	
	/**
	 * Sets the Address suburb.
	 * @param suburb
	 */
	public void setSuburb(String suburb);
	
	/**
	 * Returns the Address City. 
	 * 
	 * @return
	 */
	public String getCity();
	
	/**
	 * Sets the Address city.
	 * 
	 * @param city
	 */
	public void setCity(String city);
	
	/**
	 * Returns the Address Postcode.
	 * @return
	 */
	public String getPostCode();
	
	/**
	 * Sets the Address Postcode.
	 * 
	 * @param postCode
	 */
	public void setPostCode(String postCode);
	
	/**
	 * Returns the Address Region. i.e Waikato,Washington,North Island.
	 * @return
	 */
	public String getRegion();
	
	/**
	 * Set the Address Region. i.e Waikato,Washington,North Island.
	 * @param region
	 */
	public void setRegion(String region);
	
	/**
	 * Returns the Address Country.
	 * 
	 * @return
	 */
	public String getCountry();
	
	/**
	 * Sets the address country.
	 * @param country
	 */
	public void setCountry(String country);
	
}

