//it is a single
package com.tns.classes;

public class maindemo {
    public static void main(String[] args) {
//        myClass obj = new myClass();

        myClass obj1 = myClass.getObject();
        obj1.setId(21);
        System.out.println(obj1);

        myClass m = myClass.getObject();
        System.out.println(m);
    }
}
