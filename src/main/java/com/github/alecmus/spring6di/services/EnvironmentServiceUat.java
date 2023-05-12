package com.github.alecmus.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Profile("uat")
@Controller
public class EnvironmentServiceUat implements EnvironmentService {
    @Override
    public String getEnv() {
        return "uat";
    }
}
