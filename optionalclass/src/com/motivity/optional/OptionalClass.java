package com.motivity.optional;

import java.util.Optional;  
public class OptionalClass {  
    public static void main(String[] args) {  
        String[] str = new String[10];        
        str[4] = "Java 8 features";  
        str[3] = "ram";
        Optional<String> empty = Optional.empty();  
        System.out.println(empty);  
       
        Optional<String> value = Optional.of(str[4]);  
        value = Optional.of(str[3]);
       
        System.out.println("Filtered value: "+value.filter((s)->s.equals("java")));  
        System.out.println("Filtered value: "+value.filter((s)->s.equals("Java 8 features")));  
         
        System.out.println("Getting value: "+value.get());  
         
        System.out.println("Getting hashCode: "+value.hashCode());  
      
        System.out.println("Is value present: "+value.isPresent());  
       
        System.out.println("Nullable Optional: "+Optional.ofNullable(str[4]));  
       
        System.out.println("orElse: "+value.orElse("Value is not present"));  
        System.out.println("orElse: "+empty.orElse("Value is not present"));  
        value.ifPresent(System.out::println);    
    }  
}