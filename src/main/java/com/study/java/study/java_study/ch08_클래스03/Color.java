package com.study.java.study.java_study.ch08_클래스03;

public class Color {
    private  String code;
    private  String name;


    // AllArgscontructor
    // =         this.code = code;
    // =         this.name = name;

    // geter and seter

    public Color(String code, String name) {
        this.code = code;
        this.name = name;
    }

    //    public color (String code, String name) {
//        this.code;
//        this.name;
//    }


    public void printInfo() {
        System.out.println("색상코드: " + code);
        System.out.println("색상명: " + name);
        System.out.println();

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
