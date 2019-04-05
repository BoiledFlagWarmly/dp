package com.pay.proxy.statics.baseDemo;

public class BaseDemoTest {

    public static void main(String[] args) {
        Person person = new Friend(new Son());
        person.findLove();
    }
}
