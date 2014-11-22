package com.pinneapple.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pinneapple.example.dao.ContactDAO;
import com.pinneapple.example.model.Contact;
import com.pinneapple.example.service.ContactService;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;
	
	@Override
	public void addContact(Contact contact) {
		contactDAO.addContact(contact);
	}

	@Override
	public void updateContact(Contact contact) {
		contactDAO.updateContact(contact);
	}

	@Override
	public Contact getContact(int id) {
		return contactDAO.getContact(id);
	}

	@Override
	public void deleteContact(int id) {
		contactDAO.deleteContact(id);
	}

	@Override
	public List getConacts() {
		return contactDAO.getContacts();
	}

}
