package com.pay.proxy.statics.baseDemo;

/**
 * 静态代理类
 */
public class Friend implements Person {

    private Person person;

    public Friend(Person person) {
        this.person = person;
    }

    @Override
    public void findLove() {
        System.out.println("帮你找好了");
        person.findLove();
        System.out.println("再帮你找");
    }
}
