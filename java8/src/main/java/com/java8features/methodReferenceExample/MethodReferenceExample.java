package com.java8features.methodReferenceExample;


interface JavaInterface{
    void showInterfaceInfo();
}

public class MethodReferenceExample {
    static void show() {
        System.out.println("This is called using method reference");
    }
    public static void main(String[] args) {
        JavaInterface ji = MethodReferenceExample::show;//we are reffering method
        ji.showInterfaceInfo();
    }
}
