package dojo.plf.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import dojo.plf.Address;
import dojo.plf.Person;

public class DefaultPerson implements Person{
	
	long id;
	String firstName;
	String middleName;
	String lastName;
	Date dob;
	int height;
	float weight;
	String phone;
	String cellphone;
	String email;
	Address postalAddress;
	Address residentialAddress;
	
	public DefaultPerson(Date dob){
		this.dob = dob;
	}

	@Override
	public long getID() {
		return id;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getMiddleName() {
		return middleName;
	}

	@Override
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int calculateAgeYears() {
		long ageMillis = Calendar.getInstance().getTime().getTime() - dob.getTime();
		return (int) TimeUnit.MILLISECONDS.toDays(ageMillis)/365;
	}
	
	public int calculateAgeMonthsInCurrentYear(){
		long ageMillis = Calendar.getInstance().getTime().getTime() - dob.getTime();
		return (int)(((TimeUnit.MILLISECONDS.toDays(ageMillis)/7)%52)/4);
	}
	
	@Override
	public Date getDOB() {
		return dob;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public float getWeight() {
		return weight;
	}

	@Override
	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String getCellPhone() {
		return cellphone;
	}

	@Override
	public void setCellPhone(String cellphone) {
		this.cellphone = cellphone;
	}

	@Override
	public String getPhone() {
		return phone;
	}

	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void setPostalAddress(Address address) {
		this.postalAddress = address;
	}

	@Override
	public Address getPostalAddress() {
		return postalAddress;
	}

	@Override
	public void setResidentialAddress(Address address) {
		this.residentialAddress = address;
	}

	@Override
	public Address getResidentialAddress() {
		return residentialAddress;
	}



}
