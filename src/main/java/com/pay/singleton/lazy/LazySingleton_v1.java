package com.pay.singleton.lazy;

/**
 * 懒加载 线程不安全
 */
public class LazySingleton_v1 {

    private static LazySingleton_v1 instance = null;

    private LazySingleton_v1() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static LazySingleton_v1 getInstance() {

        if (instance == null) {
            instance = new LazySingleton_v1();
        }

        return instance;
    }
}
