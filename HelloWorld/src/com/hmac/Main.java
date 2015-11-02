package com.hmac;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("Today is " + date);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
