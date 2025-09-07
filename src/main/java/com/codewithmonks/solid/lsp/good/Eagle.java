package com.codewithmonks.solid.lsp.good;

/**
 * GOOD: Eagle can be substituted for FlyingBird
 */
public class Eagle extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Eagle soaring high!");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is hunting...");
    }
}
