package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
//        rw.name = "xyz";
//        System.out.println(rw.name);
        // will get error because mane is private
        rw.setName("xyz");
        String ans = rw.getName();
        System.out.println(ans);
    }
}