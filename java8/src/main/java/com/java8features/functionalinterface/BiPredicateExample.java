package com.java8features.functionalinterface;


import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        // A basic BiPredicate usage
        BiPredicate<Integer, Integer> p = (n1, n2) -> n1 > n2;
        System.out.println(p.test(20, 10));
        System.out.println(p.test(12, 24));
    }
}
