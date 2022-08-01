package com.java8features.lambdaExample;
interface Human{
     void eat();
}
class Person implements Human{
    public void eat() {
        System.out.println("by using normal implementation(eat bread to survive)");
    }
}
public class LambdaExpression {
    public static void main(String[] args) {
        Person person=new Person();
        person.eat();
        Human human=()->System.out.println("by using lambda (eat bread to survive)");
        human.eat();
    }
}
