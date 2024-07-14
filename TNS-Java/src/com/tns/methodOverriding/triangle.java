package com.tns.methodOverriding;

public class triangle extends shape {

    private int base;
    private int height;
    @Override
    public void draw() {
        System.out.println("Drawing a triangle with base and height " + base +""+ height);
    }

    @Override
    public void erase() {
        System.out.println("Erasing a triangle with base and height " + base +""+ height);
    }

    public triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
}
