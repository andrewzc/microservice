package com.example.greetingservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static AtomicLong count = new AtomicLong(0);

    @GetMapping(path = "/count")
    public long getCount(){
        return count.getAndIncrement();
    }


}
