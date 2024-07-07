package com.druv.scanner;

public class Person {
    // data members
    private String name;
    private int age;
    private String gender;
    private double income;
    private int tax;

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int d) {
        this.tax = d;
    }

    // object class
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", income=" + income + ", tax=" + tax
                + "]";
    }

}