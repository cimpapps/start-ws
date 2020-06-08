package com.thejavacademy.startws.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home() {
        return "index.html";
    }

    @MessageMapping("/chat")
    public String chat(String message) {
        return message.toUpperCase();
    }


}
