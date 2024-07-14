package com.tns.abstraction;

public class square extends abstract_class{
    private float side;
    public double calcArea()
    {
        return this.area = side*side;
    }

    public square(float side) {
        this.side = side;
    }
}
