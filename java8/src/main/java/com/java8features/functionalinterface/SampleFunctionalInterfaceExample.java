package com.java8features.functionalinterface;
@FunctionalInterface
interface Building{
    public void typeofBuilding();
}
public class SampleFunctionalInterfaceExample {
    public static void main(String[] args) {
                Building building=SampleFunctionalInterfaceExample::commercialBuilding;
                building.typeofBuilding();
                Building building1=SampleFunctionalInterfaceExample::duplexBuilding;
                building1.typeofBuilding();
    }
    public static void duplexBuilding(){
        System.out.println("it a duplex building ");
    }
    public static void commercialBuilding(){
        System.out.println("it is a commercial building");
    }
}
