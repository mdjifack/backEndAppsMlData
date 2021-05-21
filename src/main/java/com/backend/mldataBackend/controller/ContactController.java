package com.backend.mldataBackend.controller;

import com.backend.mldataBackend.model.Contact;
import com.backend.mldataBackend.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping
    public ResponseEntity<Contact> saveContact(@Valid @RequestBody Contact contact) {
        Contact response = contactService.saveContact(contact);

        return new ResponseEntity<Contact>(response, new HttpHeaders(), HttpStatus.OK);
    }
}
