package com.tns.newProfile;

import com.tns.accessModifiers.myProfile;

public class NewProfileExecutor extends myProfile {
        public static void main(String[] args) {
            myProfile p = new myProfile();

            //public access modifier
            p.name="Druv";
            p.displayName();
//
            // private access modifier only works within a class
//          p.age=21;
//          p.showAge();

            //default access modifier cannot be used outside of package
//            p.MobileNo=457614;
//            p.getMobileNo();
//
//            //protected cannot be used outside of package
//            p.email="druvnagpal@gmail.com";
//            p.sendEmail();
            p.display();
        }


}
