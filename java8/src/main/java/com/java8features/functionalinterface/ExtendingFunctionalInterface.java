package com.java8features.functionalinterface;
interface Drawable{
    public default  void draw(){
        System.out.println("draw a painting");
    }
}
interface Printable extends Drawable{
    public void print();
}
public class ExtendingFunctionalInterface {
    public static void main(String[] args) {
        Printable printable=()->System.out.println("print the paint");
        printable.draw();
        printable.print();
    }
}
