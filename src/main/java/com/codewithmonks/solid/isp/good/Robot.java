package com.codewithmonks.solid.isp.good;

/**
 * GOOD: Robot implements only what it can do
 */
public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working efficiently...");
    }

    public void charge() {
        System.out.println("Robot is charging...");
    }
}
