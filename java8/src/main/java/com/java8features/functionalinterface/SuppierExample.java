package com.java8features.functionalinterface;

import java.util.function.Supplier;

public class SuppierExample {
    public static void main(String[] args) {
        Supplier<String> supplier=()->"motivity labs";
       System.out.println("name of the company "+ supplier.get());
    }
}
