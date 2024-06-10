package com.study.java.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {

        // 1
        Runnable runnable = () -> {
            System.out.println("프로그램 시작");
            System.out.println("프로그램 종료");
        };
        runnable.run();

        // 2
        Function<String, Integer> fx = x -> Integer.parseInt(x);
        Integer num = fx.apply("10");
        System.out.println("num: " + num);
        Integer numB = fx.andThen(result -> result + 1000).apply("15");
        System.out.println("numB: "+ numB);

        // 3
        Consumer<String> name = a -> {
            System.out.println("유저 " + a + " 등장");
            System.out.println("유저 " + a + " 퇴장");
        };
        name.accept("정씨");

        // 4
        Supplier<Integer> XX = () -> {
            Integer ppl = num + 1989;
            return ppl;
        };

        System.out.println(XX.get());

        // 5
        Predicate<Integer> ABC = z -> z % 2 == 0;

        System.out.println(ABC.test(11));

    }
}
