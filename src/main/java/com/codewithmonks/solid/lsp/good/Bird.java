package com.codewithmonks.solid.lsp.good;

/**
 * GOOD: Base class with common bird behaviors
 */
public abstract class Bird {
    public void eat() {
        System.out.println("Bird is eating...");
    }

    public void sleep() {
        System.out.println("Bird is sleeping...");
    }
}
