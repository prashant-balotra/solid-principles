package com.codewithmonks.solid.isp.bad;

public class Human implements Worker {
    @Override
    public void work() {
        System.out.println("Human is working...");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping...");
    }
}
