package com.example.model.service;

import com.example.model.entity.Contact;
import com.example.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ContactService {


    private  ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> listAll() {
        List<Contact> all = contactRepository.findAll();
        return all;
    }

        public void save(Contact contact) {
            this.contactRepository.save(contact);
        }

        public List<Contact> list() {
            return this.contactRepository.findAll();
        }

        public void update(Contact contact) {
            this.contactRepository.save(contact);
        }

        public List<Contact> getAllNameAliStart() {
            return this.contactRepository.findAll();
        }
    }


