package com.codewithmonks.solid.ocp.good;

import java.util.List;

/**
 * GOOD: Closed for modification, open for extension
 * Can add new shapes without changing this class
 */
public class AreaCalculator {
    public double calculateTotalArea(List<Shape> shapes) {
        return shapes.stream()
                .mapToDouble(Shape::calculateArea)
                .sum();
    }

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
