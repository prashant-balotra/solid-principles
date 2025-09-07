package com.codewithmonks.solid.isp.bad;

/**
 * BAD: Robot forced to implement eat() and sleep() which don't make sense
 */
public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working...");
    }

    @Override
    public void eat() {
        // Robot doesn't eat - violates ISP
        throw new UnsupportedOperationException("Robots don't eat!");
    }

    @Override
    public void sleep() {
        // Robot doesn't sleep - violates ISP
        throw new UnsupportedOperationException("Robots don't sleep!");
    }
}
