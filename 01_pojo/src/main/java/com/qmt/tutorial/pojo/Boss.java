package com.qmt.tutorial.pojo;

public class Boss {

    private int age;
    private String name;

    public Boss(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Boss() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdultInFrance() {
        return age >= 18;
    }
}
