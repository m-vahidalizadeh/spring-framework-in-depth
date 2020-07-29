package com.gloriousoft;

import com.gloriousoft.config.ApplicationConfig;
import com.gloriousoft.service.GreetingService;
import com.gloriousoft.service.OutputService;
import com.gloriousoft.service.TimeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) throws Exception {
//        GreetingService greetingService = new GreetingService("Hello");
//        TimeService timeService = new TimeService(true);
//        OutputService outputService = new OutputService(greetingService, timeService);

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = context.getBean(OutputService.class);

        for (int i = 0; i < 5; i++) {
            outputService.generateOutput();
            Thread.sleep(5000);
        }
    }
}
