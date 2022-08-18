package com.BikkadIT.PhoneBookApi.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BikkadIT.PhoneBookApi.Model.Contact;
@Service
public interface ContactServiceI {

	public boolean  saveContact(Contact contact);
	
    public List<Contact>  getAllContact();
    
	public  Contact getContactById(Integer contactId);
	
	public boolean deleteContactById(Integer contactId);

	
}
