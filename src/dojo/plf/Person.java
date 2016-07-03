package dojo.plf;

import java.util.Date;

/**
 * Basic Person definition. Can be used as a base object for any application/extension. 
 * 
 * @author w.r.pullins.
 *
 */
public interface Person {
	
	/**
	 * The unique identifier assigned to this person.
	 * No setter provided as this is created on instantiation and never again. 
	 * @return
	 */
	public long getID();
	
	/**
	 * Returns the first name of a person
	 * 
	 * @return String
	 */
	public String getFirstName();
	
	/**
	 * Sets the first name of a Person.
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName);

	/**
	 * Sets the middle name of a Person.
	 * @param middleName
	 */
	public void setMiddleName(String middleName);
	
	/**
	 * Returns the middle name of a Person
	 * @return
	 */
	public String getMiddleName();
	/**
	 * Returns the last name of a Person.
	 * 
	 * @return
	 */
	public String getLastName();
		
	/**
	 * Sets the last name of a Person.
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName);

	/**
	 * Calculates the age of a Person in years.
	 * 
	 * @return
	 */
	public int calculateAgeYears();
	
	
	/**
	 * Returns the number of Months old a person is in the current year.
	 * Can be used in unison with calculateAgeYears to age in years and months.
	 * i.e 26 years and 11 months old. 
	 * 
	 * @return
	 */
	public int calculateAgeMonthsInCurrentYear();
	
	
	/**
	 * Returns a Persons date of birth. Can only be set on instantiation.
	 * @return
	 */
	public Date getDOB();
	
	/**
	 * Returns a Persons height in cm. 
	 * @return
	 */
	public int getHeight();
	
	/**
	 * Sets a Persons Height in cm. 
	 * @param height
	 */
	public void setHeight(int height);
	
	/**
	 * Returns a Persons weight in KG.
	 *  
	 * @return
	 */
	public float getWeight();
	
	/**
	 * Sets a Persons weight in KG.
	 *  
	 * @param weight
	 */
	public void setWeight(float weight);
	
	/**
	 * Returns a persons cellphone number.
	 * 
	 * @return
	 */
	public String getCellPhone();
	
	/**
	 * Sets a Persons cellphone number.
	 * 
	 * @param cellphone
	 */
	public void setCellPhone(String cellphone);
	
	/**
	 * Returns a Persons phone number
	 * @return
	 */
	public String getPhone();
	
	/**
	 * Sets a Persons Phone number.
	 * 
	 * @param phone
	 */
	public void setPhone(String phone);
	
	/**
	 * returns a Persons email address
	 * @return
	 */
	public String getEmail();
	
	/**
	 * Sets a persons email address.
	 * 
	 * @param email
	 */
	public void setEmail(String email);
	
	/**
	 * Sets a Postal Address.
	 * 
	 * @param address
	 */
	public void setPostalAddress(Address address);

	/**
	 * Returns a Postal Address.
	 * @return
	 */
	public Address getPostalAddress();

	/**
	 * 
	 * @param address
	 */
	public void setResidentialAddress(Address address);

	/**
	 * 
	 * @return
	 */
	public Address getResidentialAddress();
}
