package com.gloriousoft;

import com.gloriousoft.service.GreetingService;
import com.gloriousoft.service.OutputService;
import com.gloriousoft.service.TimeService;

public class Application {

    public static void main(String[] args) throws Exception {
        GreetingService greetingService = new GreetingService("Hello");
        TimeService timeService = new TimeService(true);
        OutputService outputService = new OutputService(greetingService, timeService);

        for (int i=0;i<5;i++){
            outputService.generateOutput("Mohammad");
            Thread.sleep(5000);
        }
    }
}
