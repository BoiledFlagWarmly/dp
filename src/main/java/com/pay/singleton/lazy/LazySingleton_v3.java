package com.pay.singleton.lazy;

/**
 * 懒加载 线程安全 双重检查锁性能更高
 */
public class LazySingleton_v3 {

    private static LazySingleton_v3 instance = null;

    private LazySingleton_v3(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public  static LazySingleton_v3 getInstance(){

        if(instance == null){
            synchronized(LazySingleton_v3.class){
                if(instance == null){
                    instance = new LazySingleton_v3();
                }
            }
        }

        return instance;
    }
}
