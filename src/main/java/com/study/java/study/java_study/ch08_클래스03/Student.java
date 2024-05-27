package com.study.java.study.java_study.ch08_클래스03;

public class Student {
    private int code;
    private String name;
    private int age;

    public Student() {
    }

// constructor

    public Student(int age, String name, int code) {
        this.age = age;
        this.name = name;
        this.code = code;
    }

// geter and  seter
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
}
