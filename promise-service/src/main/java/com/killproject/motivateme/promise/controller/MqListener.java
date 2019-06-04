package com.killproject.motivateme.promise.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Controller;

@Controller
public class MqListener {

    @RabbitListener(queues = "queue1")
    public void receive(String in) {
        System.out.println("Received message: '" + in + "'");
    }
}
