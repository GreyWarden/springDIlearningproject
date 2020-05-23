package com.greywarden.springDIlearningproject.controllers;

import com.greywarden.springDIlearningproject.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public final class I18nController {
    private final GreetingService greetingService;

    public I18nController(
            @Qualifier("i18nService")
                    GreetingService greetingService
    ) {
        this.greetingService = greetingService;
    }

    public String saySalve() {
        return this.greetingService.sayGreeting();
    }
}
