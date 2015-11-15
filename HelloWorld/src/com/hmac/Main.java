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




        //rmi feature F2 number 4
        System.out.println("countdown");
        for (int i = 5; i > 0; i--)
            System.out.println(i);
        System.out.println("LAUNCH");

        //rmi featured F2 number 5
        // printing random numbers 1 to 10
        Random rnum = new Random();
            System.out.println("random number 0-10 = " + rnum.nextInt(10));


        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("Iron", "Man"));
        userList.add(new User("Captain","America"));

        ArrayList<Membership> memberList = new ArrayList<Membership>();
        userList.add(new User("super, "heroes"));

    }
}
