package com.pay.proxy.statics.business;

/**
 * 存储数据源key
 */
public class DbChooseMark {

    private static ThreadLocal<String> keyMap = new ThreadLocal<>();

    public static void set(String key){
        System.out.println("set key");
        keyMap.set(key);
    }

    public static String get(){
        return keyMap.get();
    }

    public static void restore(){
        System.out.println("remove key");
        keyMap.remove();
    }



}
