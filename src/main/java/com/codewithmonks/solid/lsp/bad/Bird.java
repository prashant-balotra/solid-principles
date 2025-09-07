package com.codewithmonks.solid.lsp.bad;

/**
 * BAD: Base class assumes all birds can fly
 */
public class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}
