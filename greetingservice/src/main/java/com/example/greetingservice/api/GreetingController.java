package com.example.greetingservice.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.concurrent.atomic.AtomicLong;

@RefreshScope
@RestController
public class GreetingController {

    @Value(value = "${counter.prefixMessage}")
    private String prefixMessage;

    private static AtomicLong count = new AtomicLong(0);

    @GetMapping("/count")
    public String getCount() {
        return prefixMessage + count.getAndIncrement();
    }

}
