package com.example.repository;

import com.example.model.entity.Contact;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mohsen on 18/10/24.
 */

public class ContactRepositoryTest {


    @Autowired
    private ContactRepository contactRepository;


    @Test
    public void TestFindAll() {
        List<Contact> contacts = contactRepository.findAll();
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }

    @Test
    public void TestFindById() throws Exception {
//        main(null);
//        System.out.println(contactRepository.findByNameAndFamily(2));
    }

//    public static void main(String[] args) throws Exception {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        ContactService contactService = ctx.getBean(ContactService.class);
//        Contact contact = new Contact();
//    }
}
