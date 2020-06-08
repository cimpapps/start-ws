package com.thejavacademy.startws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @Scheduled(fixedRate = 1000L)
    private void updateChat() {
        System.out.println("running...");
        simpMessagingTemplate.convertAndSend( "/app-chat/chat", "MOCK MOCK MOCK");
    }
}
