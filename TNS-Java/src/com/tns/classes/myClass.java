// private class demonstration
package com.tns.classes;

public class myClass {
    private int id;

    // declaration an initialization of object
    private static myClass obj = new myClass();

    private myClass()
    {
        System.out.println("Private constructor");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static myClass getObject()
    {
        return obj;
    }
    @Override
    public String toString() {
        return "myClass{" +
                "id=" + id +
                '}';
    }

}
