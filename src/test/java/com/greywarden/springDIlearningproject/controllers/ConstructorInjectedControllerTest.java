package com.greywarden.springDIlearningproject.controllers;

import com.greywarden.springDIlearningproject.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        this.controller = new ConstructorInjectedController(
                new GreetingServiceImpl()
        );
    }

    @Test
    void getGreeting() {
        System.out.println(this.controller.getGreeting());
    }
}