package com.hmac;

/**
 * Created by hungmac on 2015-11-15.
 */
// F3
public class Membership extends User{

    int level = 0;

    public Membership(String firstName, String lastName) {
        super(firstName, lastName);
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
