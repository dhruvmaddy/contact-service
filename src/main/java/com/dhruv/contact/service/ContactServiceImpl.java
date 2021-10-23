package com.dhruv.contact.service;

import com.dhruv.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list = Arrays.asList(
            new Contact(001L, "dh.dhruv95@gmail.com", "Dhruv", 1311l),
            new Contact(002L, "dh.dhruv94@gmail.com", "Prakash", 1312l),
            new Contact(003L, "dh.dhruv96@gmail.com", "Maddy", 1313l),
            new Contact(004L, "dh.dhruv97@gmail.com", "Maddya", 1311l),
            new Contact(005L, "dh.dhruv98@gmail.com", "Maddyaa", 1311l),
            new Contact(006L, "dh.dhruv99@gmail.com", "Maddyaaa", 1312l)
    );

    @Override
    public List<Contact> getContactsofUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
