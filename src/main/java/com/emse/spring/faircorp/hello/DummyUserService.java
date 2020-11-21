package com.emse.spring.faircorp.hello;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DummyUserService
    implements UserService{

    private final GreetingService greetingService;

    public DummyUserService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public void greetAll() {

        List<String> nameList = Arrays.asList("Elodie","Charles");

        for( String name : nameList ) {
            greetingService.greet(name);
        }
    }
}
