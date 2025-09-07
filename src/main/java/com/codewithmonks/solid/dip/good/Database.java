package com.codewithmonks.solid.dip.good;

/**
 * GOOD: Abstraction that both high-level and low-level modules depend on
 */
public interface Database {
    void save(String data);
    String retrieve(String id);
}
