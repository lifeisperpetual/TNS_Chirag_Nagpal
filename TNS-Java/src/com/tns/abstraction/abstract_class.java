package com.tns.abstraction;

public abstract class abstract_class {
    public double area;

    //solid method
    public void ShowArea()
    {
        System.out.println("The area of the shape is " + area);
    }

    // abstract method
    public abstract double calcArea();

}
