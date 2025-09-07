package com.codewithmonks.solid.isp.good;

/**
 * GOOD: Human implements only relevant interfaces
 */
public class Human implements Workable, Eatable, Sleepable {
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
