package com.java8features.functionalinterface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer=name->System.out.println("company name is :"+name);
        consumer.accept("motivitylabs");
    }
}
