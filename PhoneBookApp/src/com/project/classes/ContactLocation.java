package com.project.classes;

public class ContactLocation {

	static Contact[] simContacts = new Contact[10];
	static Contact[] phoneContacts = new Contact[10];

	Contact simContact;
	Contact phoneContact;

	public static Contact[] getSimContacts() {
		return simContacts;
	}

	public static void setSimContact(Contact simContact) {

		simContacts[ContactServiceImpl.simCount] = simContact;
	}

	public static Contact[] getPhoneContacts() {
		for (Contact c : phoneContacts)
			System.out.println(c);
		return phoneContacts;
	}

	public static void setPhoneContact(Contact phoneContact) {
		phoneContacts[ContactServiceImpl.phoneCount] = phoneContact;
	}

}
