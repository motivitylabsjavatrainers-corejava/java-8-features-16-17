package com.java8features.functionalinterface;

import java.util.function.Predicate;

public class PerdIcateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate=number->number>100;
        System.out.println(predicate.test(200));
    }
}
