package com.tns.abstraction;

public class driver {
    public static void main(String[] args) {
        abstract_class A;
        A = new square(5);
        A.calcArea();
        A.ShowArea();

        A = new circle(2);
        A.calcArea();
        A.ShowArea();

        A = new rectangle(5,10);
        A.calcArea();
        A.ShowArea();
        
    }
}
