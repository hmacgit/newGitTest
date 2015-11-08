package com.hmac;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("Today is " + date);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        //rmi feature F2 number 4
        System.out.println("countdown");
        for (int i = 5; i > 0; i--)
            System.out.println(i);
        System.out.println("LAUNCH");


    }
}
