package com.project.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.project.interfaces.ContactService;

public class ContactServiceImpl implements ContactService {

	static int simCount = 0;
	static int phoneCount = 0;

	public void insertContact(final Contact contact, final String memory) {

		if (memory.equalsIgnoreCase("Phone memory")) {

			if (phoneCount < 10) {
				ContactLocation.setPhoneContact(contact);
				phoneCount++;
				System.out.println("Inserted :" + contact);
			} else
				System.out.println("!! Phone memeory is full");
		}

		else if (memory.equalsIgnoreCase("SIM memory")) {

			if (simCount < 10) {
				ContactLocation.setSimContact(contact);
				simCount++;
				System.out.println("Inserted :" + contact);
			} else
				System.out.println("!! SIM memeory is full");
		}

		else
			throw new IllegalArgumentException("The value of Memory should be either 'Phone memory' or 'SIM memory'");
	}

	public void updateContact(final Contact contact, final String memory) {

	}

	public Contact searchContact(final String mobileNumber, final String memory) {

		if (memory.equalsIgnoreCase("Phone memory")) {

			for (Contact phoneContact : ContactLocation.phoneContacts) {
				if (phoneContact.getMobileNumber().equals("mobileNumber"))
					return phoneContact;
			}

		}

		else if (memory.equalsIgnoreCase("SIM memory")) {

			for (Contact simContact : ContactLocation.simContacts) {
				if (simContact.getMobileNumber().equals("mobileNumber"))
					return simContact;
			}

		}

		return null;
	}

	public void display() {

		List<Contact> allContacts = new ArrayList<Contact>();
		for (int i = 0; i < phoneCount; i++) {
			allContacts.add(ContactLocation.phoneContacts[i]);

		}
		for (int i = 0; i < simCount; i++) {
			allContacts.add(ContactLocation.simContacts[i]);

		}

		Collections.sort(allContacts);

		System.out.println(allContacts);

	}

}
