package com.druv.encapsulation;

public class encap_demo {
    public static void main(String[] args) {
        encap s1 = new encap();
        s1.setName("Druv");
//        System.out.println("Name of s1: " + s1.getName());
        s1.setAge(21);
//        System.out.println("Age of s1: " +s1.getAge());
        s1.setId(101);
//        System.out.println("ID of s1: " +s1.getId());
        System.out.println(s1);
    }
}
