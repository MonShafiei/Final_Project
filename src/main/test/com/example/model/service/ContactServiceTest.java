package com.example.model.service;


import com.example.model.entity.Contact;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {ProjectConfig.class})
public class ContactServiceTest {
    //    @Deployment
//    public static JavaArchive createDeployment() {
//        return ShrinkWrap.create(JavaArchive.class)
//                .addClass(ContactServiceImpl.class)
//                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//    }
    @Autowired
    private ContactService contactService;

    @Test
    public void listAll() {
        List<Contact> contacts = contactService.listAll();
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }

}
