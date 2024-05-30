package com.study.java.study.java_study.ch15_Static;

/*
    싱글톤 디자인 패턴
    1. 객체를 유일하게 하나만 생성하여 사용하는 기법
    2. 생성자가 private로 외부에서 생성할 수 없다.

 */

public class StudentMain {
    public static void main(String[] args) {
        StudentService studentService = StudentService.getInstance();
        StudentService studentService2 = StudentService.getInstance();

        studentService.addStudent();
        StudentRepository.getInstance().add("김준이");
        studentService2.addStudent();

        studentService.getStudentData();
    }
}
