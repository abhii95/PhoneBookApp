package com.project.interfaces;

import com.project.classes.Contact;

public interface ContactService {

	void insertContact(final Contact contact, final String memory);

	void updateContact(final Contact contact, final String memory);

	Contact searchContact(final String mobileNumber, final String memory);
	
	void display();

}
