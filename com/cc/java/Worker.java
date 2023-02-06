package com.cc.java;

public class Worker extends HoneyBee{
    
    @Override
    public String doYourJob() {
        return "I'm a worker bee, I work all day!";
    }

    @Override
    public String fly() {
        return "I just fly to work!";
    }
}