// To demonstrate encapsulation concept
package com.druv.encapsulation;

public class encap {
    private String name;
    private int Id;
    private int age;

    // generating getters and setters

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

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

    @Override
    public String toString() {
        return "encap{" +
                "Id=" + Id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';


    }
}
