package com.greywarden.springDIlearningproject.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public final class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Salve a tutti from primary bean";
    }
}
