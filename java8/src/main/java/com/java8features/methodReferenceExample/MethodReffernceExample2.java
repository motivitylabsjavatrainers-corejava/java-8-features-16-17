package com.java8features.methodReferenceExample;

import java.util.Arrays;
import java.util.List;

class Elements {
    public static void staticReference(Integer object) {
        System.out.println(object);
    }
    public void instanceReference(Integer object){
        System.out.println(object);
    }
}
    public class MethodReffernceExample2 {

    public static void main(String args[]) {
        List<Integer> li= Arrays.asList(54,53,63,75,81);
        li.forEach(Elements::staticReference);
        Elements elements=new Elements();
        li.forEach(elements::instanceReference);
    }
        }

