package com.killproject.motivateme.data.controller;

import com.killproject.motivateme.data.repository.UserRepository;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.stream.IntStream;

@Controller
public class MqController {

    @Autowired
    AmqpTemplate template;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/mq")
    @ResponseBody
    String queue1(@RequestParam String text) {
        template.convertAndSend("queue1", text);
        return String.format("Message '%s' sended to queue", text);
    }

    @GetMapping("/mq2")
    @ResponseBody
    String queue2() {
        IntStream.range(1, 30).boxed().forEach(i -> {
            template.convertAndSend("queue1",  i);
        });
        return "Messages sended to queue";
    }
}
