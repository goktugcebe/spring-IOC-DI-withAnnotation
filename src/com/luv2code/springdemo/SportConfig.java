package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.springdemo")
public class SportConfig {

    //define bean for our sad fortune service
    //method name is "bean id"
    @Bean
    public FortuneService sadFortuneService(){
        return new HappyFortuneService();
    }

    //define bean for our swim coach AND inject dependency
    //Define each bean individually in this config class
    //No component Scan
    //Method name is "bean id"
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
