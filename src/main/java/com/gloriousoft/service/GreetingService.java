package com.gloriousoft.service;

import com.gloriousoft.aspect.Countable;
import com.gloriousoft.aspect.Loggable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${app.greeting}")
    private String greeting;

//    public GreetingService(String greeting) {
//        super();
//        this.greeting = greeting;
//    }

    public GreetingService() {
        super();
    }

    @Loggable
    @Countable
    public String getGreeting(String name) {
        return greeting + " " + name;
    }
}
