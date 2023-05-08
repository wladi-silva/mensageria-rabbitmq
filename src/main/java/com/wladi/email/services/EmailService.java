package com.wladi.email.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.wladi.email.models.EmailModel;

@Service
public class EmailService {
    
    @Autowired
    private JavaMailSender javaMailSender;

    public String sendEmail(EmailModel emailModel) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(emailModel.getEmailPara());
            message.setTo(emailModel.getEmailPara());
            message.setSubject(emailModel.getTitulo());
            message.setText(emailModel.getConteudo());
            
            javaMailSender.send(message);
            emailModel.setStatus("Email enviado.");
        } catch (Exception e) {
            System.out.println(e);
            emailModel.setStatus("Falha ao enviar.");
        }

        return emailModel.getStatus();
    }
}