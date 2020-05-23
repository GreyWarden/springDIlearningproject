package com.greywarden.springDIlearningproject.controllers;

import com.greywarden.springDIlearningproject.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public final class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(
            @Qualifier("setterGreetingService")
                    GreetingService greetingService
    ) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return this.greetingService.sayGreeting();
    }
}
