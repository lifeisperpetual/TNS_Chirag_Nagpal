package com.tns.accessModifiers;

public class myProfile {
    public String name;
    private int age;
    long MobileNo;
    protected String email;

    public void displayName()
    {
        System.out.println(name);
    }
    private void showAge()
    {
        System.out.println(age);
    }
    void getMobileNo()
    {
        System.out.println(MobileNo);
    }
    protected void sendEmail()
    {
        System.out.println(email);
    }

    public void display()
    {
        email="druvnagpal@gmail.com";
        sendEmail();
    }
}
