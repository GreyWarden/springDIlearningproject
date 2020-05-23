package com.greywarden.springDIlearningproject.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public final class I18NEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Surprise, motherfucker!";
    }
}
