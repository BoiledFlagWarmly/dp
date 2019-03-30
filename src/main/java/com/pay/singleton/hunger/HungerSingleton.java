package com.pay.singleton.hunger;

/**
 * 第一个饿汉单例
 */
public class HungerSingleton {

    private static HungerSingleton instance = new HungerSingleton();

    private HungerSingleton(){}

    public static HungerSingleton getInstance(){
        return instance;
    }
}
