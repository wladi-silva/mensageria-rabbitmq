package com.wladi.email.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wladi.email.models.EmailModel;
import com.wladi.email.services.EmailService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/email")
public class EmailController {
    
    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<Object> send(@RequestBody @Valid EmailModel emailModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(emailService.sendEmail(emailModel));
    }

}