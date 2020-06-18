package com.project.main;

import com.project.classes.Contact;
import com.project.classes.ContactLocation;
import com.project.classes.ContactServiceImpl;
import com.project.interfaces.ContactService;

public class PhoneApplication {

	final static String PHONE_MEMORY = "Phone memory";
	final static String SIM_MEMORY = "SIM memory";

	public static void main(String[] args) {

		Contact contact1 = new Contact("Abhilash", "9951191080", "abilash@gmail.com");
		Contact contact2 = new Contact("Abhinav", "0123456789", "abhinav@gmail.com");
		Contact contact3 = new Contact("Manju", "8885671300", "manju@gmail.com");
		Contact contact4 = new Contact("Bha", "9154224402", "sai@gmail.com");
		Contact contact5 = new Contact("L", "9154224402", "sai@gmail.com");

		ContactService contactService = new ContactServiceImpl();

		contactService.insertContact(contact1, PHONE_MEMORY);
		contactService.insertContact(contact2, PHONE_MEMORY);
		contactService.insertContact(contact3, SIM_MEMORY);
		contactService.insertContact(contact4, SIM_MEMORY);
		
		//System.out.println(ContactLocation.getPhoneContacts());

		contactService.display();

	}

}
