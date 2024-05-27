package com.study.java.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {

        String text = new String("");
        String name = "정령우";       //값의 자료형 String
        String phone = "iPhone";    //값의 자료형 null

        StringUtils stringUtils = new StringUtils();


        //System.out.println(text);
        //System.out.println(name);

        // == 주소값 비교
        // equals

        if (stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return;
        }

        if (stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비어있습니다.");
            return;
        } else if (stringUtils.isEmpty(text)) {
            System.out.println("text이 비어있습니다.");
            return;
        }
    }
}
