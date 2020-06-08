package com.thejavacademy.startws.config;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeHandler;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

import java.security.Principal;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class UserIncrementHandler extends DefaultHandshakeHandler {

    AtomicInteger incrementor = new AtomicInteger();

    @Override
    protected Principal determineUser(ServerHttpRequest request, WebSocketHandler wsHandler, Map<String, Object> attributes) {
        int number = incrementor.incrementAndGet();
        return () -> "user" + number;
    }
}
