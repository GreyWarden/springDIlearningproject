package com.greywarden.springDIlearningproject.controllers;

import org.springframework.stereotype.Controller;

@Controller
public final class MyController {

    public String sayHello()
    {
        System.out.println("Hello world!");

        return "Yeee madafacka";
    }
}
