package com.codewithmonks.solid.isp.bad;

/**
 * BAD: Fat interface forces classes to implement methods they don't need
 */
public interface Worker {
    void work();
    void eat();
    void sleep();
}
