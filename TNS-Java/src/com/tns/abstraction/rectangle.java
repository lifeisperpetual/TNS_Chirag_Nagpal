package com.tns.abstraction;

public class rectangle extends abstract_class {
    private float length;
    private float breadth;
    public double calcArea()
    {
        return this.area = length*breadth;
    }

    public rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
