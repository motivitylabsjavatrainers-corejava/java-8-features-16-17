package com.java8features.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;
class Employee1{
    private String name;
    private int age;
    public Employee1(String name,int age){
        this.age=age;
        this.name=name;
    }
   public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class FunctionExample {
    public static void main(String[] args) {
        Employee1 employee=new Employee1("sandeep",25);
        Function<Employee1,Integer> function=Employee1::getAge;
        System.out.println(function.apply(employee));
        Function<Employee1,String> function1=emp->emp.getName();
        System.out.println(function1.apply(employee));
        }
    }
