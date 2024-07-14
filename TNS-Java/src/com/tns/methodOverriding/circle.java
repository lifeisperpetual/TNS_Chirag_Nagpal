package com.tns.methodOverriding;

public class circle extends shape {

    private int radius;
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    @Override
    public void erase() {
        System.out.println("Erasing a circle with radius " + radius);
    }

    public circle(int radius) {
        this.radius = radius;
    }
}
