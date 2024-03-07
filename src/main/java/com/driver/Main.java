package com.driver;

public class Main {

    public static void main(String[] arg) {
        RWOnly rwOnly = new RWOnly();
        // The field rwOnly.member is not visible.
        rwOnly.setMember("KD");
        System.out.println(rwOnly.getMember());
    }
}