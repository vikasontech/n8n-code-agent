package com.radhe.hello;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // 1. Unused Autowired field (bad practice)
    @Autowired
    private FileWriter fileWriter;

    // 2. Executing code at startup for no reason (anti-pattern)
    @PostConstruct
    public void init() {
        System.out.println("Controller initialized"); //  Using System.out in Spring Boot
    }

    @PostMapping("/hello")
    public String sayHello() {
        return "Hello from Vrindavan";
    }
        //  Dead code / unused method
    private void doNothing() {
        int x = 10 / 0; //  Hidden runtime error
    }
}
