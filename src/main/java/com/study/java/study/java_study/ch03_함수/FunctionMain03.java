package com.study.java.study.java_study.ch03_함수;

public class FunctionMain03 {

    public static void main(String[] args) {
        Function03 fx = new Function03();
        fx.fx01(1234, "정령우", 26, "010-8714-4431");

        //-----------------------------------------//

        Student student = new Student();
        student.studentCode = 1234;
        student.name= "정령우";
        student.age = 26;
        student.phone = "010-8714-4431";

        fx.fx02(student);

    }

}
