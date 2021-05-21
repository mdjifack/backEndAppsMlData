package com.backend.mldataBackend.service;

import com.backend.mldataBackend.model.Contact;
import com.backend.mldataBackend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public Contact saveContact(Contact entity) {
        return contactRepository.save(entity);
    }
}
