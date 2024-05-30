package com.study.java.study.java_study.ch14_Object;

import java.util.Objects;

public class Student {

    // 1. 변수 정의
    private String name;
    private int age;

    // 2. 생성자
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 3. 게터셋터 (원래)

    // 4. 이퀄스  (ctrl + o)
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj.getClass() == this.getClass()) {
            Student student = (Student) obj;
            return Objects.equals(student.name, name) && Objects.equals(student.age, age);
        }
        return false;
    }

    //5. 해쉬코드  (ctrl + o)
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // 1-2
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
