package com.java8features.lambdaExample;
interface ReversingOfaNumber{
    int reverseOfaNumber(int number);
}

public class LambdaMultipleStatement {
    public static void main(String[] args) {
        ReversingOfaNumber reversingOfaNumber=num->{
           int reverse=0;
            while(num != 0)
            {
                int remainder = num % 10;
                reverse = reverse * 10 + remainder;
                num = num/10;
            }
            return reverse;
        };
       System.out.println( reversingOfaNumber.reverseOfaNumber(456));
    }
}
