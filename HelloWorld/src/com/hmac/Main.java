package com.hmac;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("Today is " + date);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        System.out.println(greeter.sayMorning());

        OddOrEven oddOrEven = new OddOrEven();
        oddOrEven.getOddOrEven(5);

        //Feature 4 - 8;
        for (int i = 10; i> 0; i--){
            System.out.print("The number: " + i + " ");
            oddOrEven.getOddOrEven(i);
        }

        System.out.println("newsonate2");

    }
}
