package com.greywarden.springDIlearningproject.controllers;

import com.greywarden.springDIlearningproject.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        this.controller = new ConstructorInjectedController(
                new ConstructorGreetingService()
        );
    }

    @Test
    void getGreeting() {
        System.out.println(this.controller.getGreeting());
    }
}