package com.greywarden.springDIlearningproject.controllers;

import com.greywarden.springDIlearningproject.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public final class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return this.greetingService.sayGreeting();
    }
}
