package com.study.java.study.java_study.ch11_추상화02;

public abstract class Animal {

    private String name;

    public abstract void move();

    public void eat() {
        System.out.println("동물이 밥을 먹습니다.");
    }
    // 추상 클래스 (abstract)
    // 1. 추상 메서드를 하나라도 정의되어 있으면 추상클래스로 정의해줘야한다.
    // 2. 추상클래스는 생성할 수 없다.
    // 3. 일반 클래스와 정의 할 수 있는 멤버변수, 멤버 메소드는 동일하다.
    // 4. 추상클래스라고 해서 무조건 추상 메소드를 가지고 있어야 하는 것은 아니다.
    // 5. 추상클래스를 상속받은 클래스는 추상메소드를 모두 구현하거나
    //    해당 클래스도 추상 클래스로 정의하여야 한다.


}
