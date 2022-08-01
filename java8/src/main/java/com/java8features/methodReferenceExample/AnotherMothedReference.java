package com.java8features.methodReferenceExample;

import java.util.Arrays;
import java.util.List;

class People<String>{
    public  void name(String str){
        System.out.println(str);
    }
}
public class AnotherMothedReference {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("sandeep","hari","ramana","satya","venu","sai","nihkil");
        People people=new People();
       list.forEach (people::name);
    }
}
