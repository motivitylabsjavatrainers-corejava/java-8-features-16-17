package com.java8features.functionalinterface;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
class Employee {
    private String name;
    private  int age;

    public Employee(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  int getAge() {
        return age;
    }
}
class EmployeeDetails{
    public static List<Integer> getAges(List<Employee> list){
        List<Integer> li=new ArrayList();
        for (Employee e:list) {
            li.add(e.getAge());
        }
        return li;
    }
    public static List<String> getNames(List<Employee> list){
        List<String> li=new ArrayList();
        for (Employee e:list) {
            li.add(e.getName());
        }
        return li;
    }
}
public class FunctionUsingList {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("sandeep",24));
        list.add(new Employee("hari",23));
        list.add(new Employee("sai",23));

        Function<List,List> function=EmployeeDetails::getAges;
        System.out.println(function.apply(list));
        function=EmployeeDetails::getNames;
        System.out.println(function.apply(list));
    }

}
