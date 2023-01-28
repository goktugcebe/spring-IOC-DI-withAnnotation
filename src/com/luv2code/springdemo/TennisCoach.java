package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    private final FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        System.out.println("TennisCoach: Inside default constructor");
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
