package com.java8features.lambdaExample;
interface Food{
    void foodDatails(String name,int cost);
}
public class LambdaWithParameters {
    public static void main(String[] args) {
        Food food=(itemname,itemcost)->System.out.println("name "+itemname+"cost "+itemcost);
        food.foodDatails("idly",45);
    }
}
