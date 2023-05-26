package com.example.microservice1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Microservice1Controller {

    private final RabbitTemplate rabbitTemplate;
    private final MessageConverter messageConverter;

    @Autowired
    public Microservice1Controller(RabbitTemplate rabbitTemplate, MessageConverter messageConverter) {
        this.rabbitTemplate = rabbitTemplate;
        this.messageConverter = messageConverter;
        this.rabbitTemplate.setMessageConverter(messageConverter); // Set the message converter
    }

    @PostMapping("/numbers")
    public void sendNumbersToQueue(@RequestBody NumbersDTO numbersDTO) {
        log.info("Published to myTestQueue");
        rabbitTemplate.convertAndSend("myTestQueue", numbersDTO);
    }
}
