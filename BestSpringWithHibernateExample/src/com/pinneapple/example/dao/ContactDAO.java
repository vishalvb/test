package com.pinneapple.example.dao;

import java.util.List;

import com.pinneapple.example.model.Contact;

public interface ContactDAO {
	
    public void addContact(Contact contact);
    public void updateContact(Contact contact);
    public Contact getContact(int id);
    public void deleteContact(int id);
    public List getContacts();


}
