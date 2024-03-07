package com.driver;

public class Main {

    public static void main(String[] arg) {
        RWOnly rwOnly = new RWOnly();
        rwOnly.setName("KD");
        System.out.println(rwOnly.getName());
       //name has private access in com.driver.RWOnly

    }
}