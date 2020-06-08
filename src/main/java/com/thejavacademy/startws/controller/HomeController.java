package com.thejavacademy.startws.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home() {
        return "index.html";
    }

    @MessageMapping("/chat")
    public String chat(String message, Principal principal) {
        return principal.getName() + ": " + message.toUpperCase();
    }

}
