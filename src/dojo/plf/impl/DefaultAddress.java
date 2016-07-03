package dojo.plf.impl;

import dojo.plf.Address;

public class DefaultAddress implements Address{
	
	String buildingName;
	String buildingNumber;
	String buildingSublocal;
	String buildingLevel;
	String buildingLocation;
	String suburb;
	String city;
	String postCode;
	String region;
	String country;
	
	
	public DefaultAddress(){
		super();
	}
	
	public DefaultAddress(String house,String street,String suburb,String city,String postcode){
		setBuildingNumber(house);
		setBuildingLocation(street);
		setSuburb(suburb);
		setCity(city);
		setPostCode(postcode);
	}
	
	@Override
	public String getBuildingName() {
		return buildingName;
	}

	@Override
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	@Override
	public String getBuildingNumber() {
		return buildingNumber;
	}

	@Override
	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	@Override
	public String getBuildingSublocality() {
		return buildingSublocal;
	}

	@Override
	public void setBuildingSublocality(String buildingSublocality) {
		this.buildingSublocal = buildingSublocality;
	}

	@Override
	public String getBuildingLevel() {
		return buildingLevel;
	}

	@Override
	public void setBuildingLevel(String buildingLevel) {
		this.buildingLevel = buildingLevel;
	}

	@Override
	public String getBuildingLocation() {
		return buildingLocation;
	}

	@Override
	public void setBuildingLocation(String street) {
		this.buildingLocation = street;
	}

	@Override
	public String getSuburb() {
		return suburb;
	}

	@Override
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String getPostCode() {
		return postCode;
	}

	@Override
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Override
	public String getRegion() {
		return region;
	}

	@Override
	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String getCountry() {
		return country;
	}

	@Override
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append((buildingName != null) ? buildingName + "," : "" );
		builder.append((buildingSublocal != null) ? buildingSublocal + "," : "" );
		builder.append((buildingLevel != null) ? buildingLevel + "," : "" );
		builder.append((buildingNumber != null) ? buildingNumber + "," : "" );		
		builder.append((buildingLocation != null) ? buildingLocation + "," : "" );
		builder.append((suburb != null) ? suburb + "," : "" );
		builder.append((city != null) ? city + "," : "" );
		builder.append((postCode != null) ? postCode + "," : "" );
		builder.append((region != null) ? region + "," : "" );
		builder.append((country != null) ? country + "," : "" );		
		
		return builder.toString();
	}
}
