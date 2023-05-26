package com.example.microservice2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Microservice2Consumer {

    @RabbitListener(queues = "myTestQueue")
    public void receiveNumbersFromQueue(NumbersDTO numbersDTO) {
        int sum = numbersDTO.getNumber1() + numbersDTO.getNumber2() + numbersDTO.getNumber3() + numbersDTO.getNumber4();
        System.out.println("Sum: " + sum);
        log.info("Sum: {}", sum);
    }
}
