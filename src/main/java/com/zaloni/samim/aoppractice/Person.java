package com.zaloni.samim.aoppractice;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;

    public void run() {
        System.out.println("run");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
