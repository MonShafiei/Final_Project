package com.example.controller;

import com.example.model.entity.Contact;
import com.example.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mohsen on 18/10/24.
 */
public class Test_2 {



    @Autowired
    ContactRepository contactRepository;

    public Test_2() {

        TestFindById();
    }



    public void TestFindById(){
        List<Contact> contacts = contactRepository.findAll();
        for (Contact contact :contacts ) {
            System.out.println(contact.toString());
        }
    }
}
