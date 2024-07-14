package com.tns.methodOverriding;

public class driver{
    public static void main(String[] args) {
        //creating array of shape objects
        shape[] Shape = new shape[3];
        Shape[0] = new circle(3);
        Shape[1] = new square(4);
        Shape[2] = new triangle(2,6);

        for (shape s : Shape)
        {
            s.draw();
            s.erase();
        }
    }

}
