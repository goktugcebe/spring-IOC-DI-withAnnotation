package com.luv2code.springdemo;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
