package com.example.repository;

import com.example.model.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Mohsen on 18/10/24.
 */

@Repository
@Transactional
public interface ContactRepository extends JpaRepository<Contact, Integer> {

//    Contact findByNameAndFamily(String name, String family);
}
