package com.tns.inheritance;

public class main {
    public static void main(String[] args) {
        child c1 = new child("Druv","123456789011",123645,"male",211,"watumull","computer");
        System.out.println(c1);

        c1.studies();
        c1.paytaxes();
    }
}
