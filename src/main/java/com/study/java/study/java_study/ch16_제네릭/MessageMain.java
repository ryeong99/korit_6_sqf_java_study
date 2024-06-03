package com.study.java.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        // 제네릭 와일드 카드: 기호 -> ?

        //Intger => Objent or ?
        Message<?> m1;
        Message<String> m2;

        m1 = new Message<>("10");
        String s = (String) m1.getMessage();

        // 와일드 카드 제약
        Message<? extends String> m3 = new Message<>("10"); // 하행
        Message<? super String> m4 = new Message<>(new Object()); // 상행

        String s2 = m3.getMessage();
    }
}
