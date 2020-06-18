package com.project.classes;

public class Contact implements Comparable<Contact> {

	String name;
	String mobileNumber;
	String emailId;

	public Contact(String name, String mobileNumber, String emailId) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + "]\n";
	}

	public int compareTo(Contact contact) {

		String contactName = contact.getName();

		int c = this.name.compareTo(contactName);

		return c;
	}

}
