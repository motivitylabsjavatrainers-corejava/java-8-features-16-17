package com.java8features.functionalinterface;


import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> c1 = (a, b) -> System.out.println(a + b);
        c1.accept(10, 20);
        BiConsumer<String, String> c2 = (s1, s2) -> System.out.println(s1.concat(s2));
        c2.accept("motivity","labs");

    }

}
