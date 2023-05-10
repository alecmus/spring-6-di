package com.github.alecmus.spring6di.controllers;

import com.github.alecmus.spring6di.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
