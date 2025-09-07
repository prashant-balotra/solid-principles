package com.codewithmonks.solid.ocp.bad;

/**
 * BAD: Must modify this class every time we add a new shape
 */
public class AreaCalculatorBad {
    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.width * rectangle.height;
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        }
        // Need to add more if-else for new shapes - violates OCP
        return 0;
    }

    static class Rectangle {
        double width, height;
        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
    }

    static class Circle {
        double radius;
        Circle(double radius) {
            this.radius = radius;
        }
    }
}
