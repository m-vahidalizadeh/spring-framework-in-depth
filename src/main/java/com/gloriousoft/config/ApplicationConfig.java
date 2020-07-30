package com.gloriousoft.config;

import com.gloriousoft.service.GreetingService;
import com.gloriousoft.service.OutputService;
import com.gloriousoft.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.gloriousoft")
public class ApplicationConfig {

//    @Value("${app.greeting}")
//    private String greeting;
//    @Value("${app.name}")
//    private String name;
//    @Value("#{new Boolean(environment['spring.profiles.active']!='dev')}")
//    private boolean is24;
//
//    @Autowired
//    private TimeService timeService;
//    @Autowired
//    private GreetingService greetingService;

//    @Bean
//    @Profile("!dev")
//    public TimeService timeService() {
//        return new TimeService(is24);
//    }

//    @Bean
//    @Profile("dev")
//    public TimeService timeService12() {
//        return new TimeService(false);
//    }

//    @Bean
//    public OutputService outputService() {
//        return new OutputService(greetingService, timeService, name);
//    }
//
//    @Bean
//    public GreetingService greetingService() {
//        return new GreetingService(greeting);
//    }

}
