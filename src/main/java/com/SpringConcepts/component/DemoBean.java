package com.SpringConcepts.component;
import org.springframework.stereotype.Component;

@Component
public class DemoBean {
    public String sayHello() {
        return "Hello from DemoBean!";
    }
}