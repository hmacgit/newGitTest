package com.hmac;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        System.out.println(greeter.sayMorning());

        OddOrEven oddOrEven = new OddOrEven();
        oddOrEven.getOddOrEven(5);


    }
}
