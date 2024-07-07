package com.tns.accessModifiers;

public class ProfileExecutor {
    public static void main(String[] args) {
        myProfile p = new myProfile();

        //public access modifier
        p.name="Druv";
        p.displayName();
//
        // private modifier
//      p.age=21;
//      p.showAge();

        //default access modifier
//        p.MobileNo=457614;
//        p.getMobileNo();
//
        //protected
//        p.email="druvnagpal@gmail.com";
//        p.sendEmail();
        p.display();
    }
}
