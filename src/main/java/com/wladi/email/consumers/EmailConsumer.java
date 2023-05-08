package com.wladi.email.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.wladi.email.models.EmailModel;
import com.wladi.email.services.EmailService;

@Component
public class EmailConsumer {
    
    @Autowired
    private EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload EmailModel emailModel) {
        emailService.sendEmail(emailModel);
        System.out.println("Email status: " + emailModel.getStatus().toString());
    }
}