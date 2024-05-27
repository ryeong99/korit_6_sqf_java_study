package com.study.java.study.java_study.ch08_클래스03;

import java.awt.*;

public class ColorMain {
    /*
        문제
        color 객체 5개를 담을 수 있는 배열을 생성하여
        #FFBE98, peach Fuzz
        #CA848A, Brandied Apricot
        #964F4C, Marsala
        #A78C7B, Almindine
        #D8c88D, Almond peach

        색상 데이터를 저장한 후에 for문을 사용하여
        배열에 들어있는 모든 색상 정보를
        printInfo()로 호출하여 출력한 다음
        모든 code와 name의 값을 null로 바꾸어 다시 출력한다.
        이 때 null로 바꿀 때에는 반복문을 사용한다

     */
    public static void main(String[] args) {


        Color[] colors = new Color[5];
        colors[0] = new Color("#CA848A", "Brandued Apericot");
        colors[1] = new Color("#FFBE98", "Peach Fuzz");
        colors[2] = new Color("#964F4C", "Marsala");
        colors[3] = new Color("#A78C7B", "Almindine");
        colors[4] = new Color("#D8C8BD", "Almind peach");

        Color[] colors2 = new Color[5];
        colors2[0] = new Color("#CA848A", "Brandued Apericot");
        colors2[1] = new Color("#FFBE98", "Peach Fuzz");
        colors2[2] = new Color("#964F4C", "Marsala");
        colors2[3] = new Color("#A78C7B", "Almindine");
        colors2[4] = new Color("#D8C8BD", "Almind peach");


        for (Color color : colors) {
            color.printInfo();
        }

        for (Color color : colors) {
            color.setCode(null);
            color.setName(null);
        }
        for (int i = 0; i < colors.length; i++) {
            colors[i].printInfo();
        }
        for (Color color : colors) {
            color.printInfo();
        }
    }
}
