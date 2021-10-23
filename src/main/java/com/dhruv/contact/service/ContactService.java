package com.dhruv.contact.service;

import com.dhruv.contact.entity.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getContactsofUser(Long userId);
}
