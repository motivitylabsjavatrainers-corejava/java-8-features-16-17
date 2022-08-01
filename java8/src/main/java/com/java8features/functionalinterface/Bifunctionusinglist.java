package com.java8features.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
class Person {
    private String name;
    private String Village;

    public Person(String name, String village) {
        this.name = name;
        Village = village;
    }

    public String getName() {
        return name;
    }

    public String getVillage() {
        return Village;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Village='" + Village + '\'' +
                '}';
    }
}
class PersonDetails{
    public static List getPersonVillage( List<Person> list,String village){
        List<Person> li=new ArrayList();
        for(Person person:list){
            if (village.equals(person.getVillage())){
                li.add(person);
            }
        }
        return li;
    }
}
public class Bifunctionusinglist {
    public static void main(String[] args) {
        List<Person> li=new ArrayList();
        li.add(new Person("sandeep","ravulapalem"));
        li.add(new Person("hari","vizag"));
        li.add(new Person("ramana","ravulapalem"));
        BiFunction<List,String,List> bifunctionusinglist=PersonDetails::getPersonVillage;
       System.out.println( bifunctionusinglist.apply(li,"ravulapalem"));





    }
}
