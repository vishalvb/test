package com.pinneapple.example.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pinneapple.example.dao.ContactDAO;
import com.pinneapple.example.model.Contact;

@Repository
public class ContactDaoImpl implements ContactDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void addContact(Contact contact) {
		getCurrentSession().save(contact);
	}

	public void updateContact(Contact contact) {
		Contact contactToUpdate = getContact(contact.getId());
		contactToUpdate.setFirstName(contact.getFirstName());
		contactToUpdate.setLastName(contact.getLastName());
		contactToUpdate.setEmail(contact.getEmail());
		getCurrentSession().update(contactToUpdate);

	}

	public Contact getContact(int id) {
		Contact contact = (Contact) getCurrentSession().get(Contact.class, id);
		return contact;
	}

	public void deleteContact(int id) {
		Contact contact = getContact(id);
		if (contact != null)
			getCurrentSession().delete(contact);
	}

	@SuppressWarnings("unchecked")
	public List getContacts() {
		return getCurrentSession().createQuery("from Contact").list();
	}
	
}
