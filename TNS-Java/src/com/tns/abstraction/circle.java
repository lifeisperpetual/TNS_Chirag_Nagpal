package com.tns.abstraction;

public class circle extends abstract_class{
    private float radius;
    public double calcArea()
    {
        return this.area = 3.14*radius*radius;
    }

    public circle(float radius) {
        this.radius = radius;
    }
}
