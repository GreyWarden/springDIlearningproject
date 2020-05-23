package com.greywarden.springDIlearningproject.controllers;

import com.greywarden.springDIlearningproject.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        this.controller = new SetterInjectedController();
        this.controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(this.controller.getGreeting());
    }
}