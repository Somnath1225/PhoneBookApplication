package com.BikkadIT.PhoneBookApi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.BikkadIT.PhoneBookApi.Model.Contact;
import com.BikkadIT.PhoneBookApi.Repository.ContactRepository;

public class ContactserviceImpl implements ContactServiceI {

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public boolean saveContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contact> getAllContact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		// TODO Auto-generated method stub
		return false;
	}

}
