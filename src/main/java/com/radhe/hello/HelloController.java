package com.radhe.hello;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @PostMapping("/hello")
    public String sayHello() {
        return "Hello from Vrindavan";
    }
}