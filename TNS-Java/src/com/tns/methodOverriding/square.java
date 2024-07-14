package com.tns.methodOverriding;

public class square extends shape {

    private int side;
    @Override
    public void draw() {
        System.out.println("Drawing a square with side " + side);
    }

    public square(int side) {
        this.side = side;
    }

    @Override
    public void erase() {
        System.out.println("Erasing a square with side " + side);
    }
}
