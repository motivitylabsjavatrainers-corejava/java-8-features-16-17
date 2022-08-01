package com.java8features.methodReferenceExample;
interface  Parser{
    String parse(String str);
}
class StringParser{
    public static String convert(String s){
        if(s.length()>3){
            s=s.toUpperCase();
        }
        else {
            s=s.toLowerCase();
        }
        return s;
    }
}
class MyPrinter{
    public void print(String str,Parser p){
       ;
        System.out.println( p.parse(str));
    }
}
public class MethodsReferenceExample3 {
    public static void main(String[] args) {
        String str="motivity";
        MyPrinter myPrinter=new MyPrinter();
        Parser parser=StringParser::convert;
        myPrinter.print(str,parser);

    }
}
