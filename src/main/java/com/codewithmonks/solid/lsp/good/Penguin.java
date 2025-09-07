package com.codewithmonks.solid.lsp.good;

/**
 * GOOD: Penguin doesn't inherit flying behavior
 */
public class Penguin extends Bird {
    public void swim() {
        System.out.println("Penguin is swimming!");
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating fish...");
    }
}
