package com.greywarden.springDIlearningproject.services;

import org.springframework.stereotype.Service;

@Service
public final class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Salve a tutti from property";
    }
}
