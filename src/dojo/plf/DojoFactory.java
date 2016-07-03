package dojo.plf;

import dojo.plf.impl.DefaultAddress;

/**
 * Dojo factory class. 
 * 
 * @author Roy
 *
 */
public abstract class DojoFactory {

	/**
	 * Returns a instance of address with no details added.
	 * @return
	 */
	public static Address createAddress(){
		return new DefaultAddress();
	}
	
	/**
	 * Returns a instance of address expecting basic NZ post details to be known. 
	 * @param house
	 * @param street
	 * @param suburb
	 * @param city
	 * @param postcode
	 * @return
	 */
	public static Address createAddress(String house, String street, String suburb, String city, String postcode){
		return new DefaultAddress(house,street,suburb,city,postcode);
	}
	
}
