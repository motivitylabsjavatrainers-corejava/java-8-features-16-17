package com.java8features.methodReferenceExample;
interface JavaInterface2{
    void showInterfaceInfo();
}

class StaticMethodRefference{
    public static void staticReffernce(){
        System.out.println("this is static refference");
    }
}
class InstanceMethodRefference{
    public void InstanceRefference(){
        System.out.println("this is instance refference");
    }
}
public class MethodsReffernceByStaticAndInstance {
    public static void main(String[] args) {
        InstanceMethodRefference instanceMethodRefference=new InstanceMethodRefference();
        JavaInterface2 j2=(instanceMethodRefference::InstanceRefference);
        j2.showInterfaceInfo();
        JavaInterface2 j3=(StaticMethodRefference::staticReffernce);
        j3.showInterfaceInfo();
    }
}
