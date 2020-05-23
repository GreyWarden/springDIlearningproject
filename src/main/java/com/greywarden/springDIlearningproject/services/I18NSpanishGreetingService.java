package com.greywarden.springDIlearningproject.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public final class I18NSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Sorpresa, hijo de puta";
    }
}
