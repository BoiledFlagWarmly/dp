package com.pay.singleton.lazy;

/**
 * 懒加载 线程安全
 */
public class LazySingleton_v2 {

    private static LazySingleton_v2 instance = null;

    private LazySingleton_v2(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized static LazySingleton_v2 getInstance(){

        if(instance == null){
            instance = new LazySingleton_v2();
        }

        return instance;
    }
}
