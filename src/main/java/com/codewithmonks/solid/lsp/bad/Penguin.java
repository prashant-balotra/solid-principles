package com.codewithmonks.solid.lsp.bad;

/**
 * BAD: Violates LSP - Penguin can't fly but inherits fly()
 */
public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}
