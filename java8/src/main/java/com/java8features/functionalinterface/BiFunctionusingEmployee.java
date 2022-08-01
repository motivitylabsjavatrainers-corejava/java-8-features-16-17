package com.java8features.functionalinterface;

import java.util.function.BiFunction;

class Employee3 {
    private String name;
    private  int age;

    public Employee3(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  int getAge() {
        return age;
    }

    @Override
    public  String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
class Example1{
    public Employee3 getEmployeeDetails(Employee3 e,Employee3 e2){

        if(e.getAge()>e2.getAge()){
            return e;
        }
        else {
            return e2;
        }
    }
}

public class BiFunctionusingEmployee {
    public static void main(String[] args) {
        Employee3 employee=new Employee3("sandeep",23);
        Employee3 employee1=new Employee3("hari",24);
        Example1 e=new Example1();
        BiFunction<Employee3,Employee3,Employee3> biFunction=e::getEmployeeDetails;
        System.out.println(biFunction.apply(employee,employee1));

    }
}
