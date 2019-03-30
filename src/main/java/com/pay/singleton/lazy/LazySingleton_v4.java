package com.pay.singleton.lazy;

/**
 * 内部类实现懒加载
 */
public class LazySingleton_v4 {

    private LazySingleton_v4(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public  static LazySingleton_v4 getInstance(){
        return Holder.INSTANCE;
    }

    private static class Holder{
        private static LazySingleton_v4 INSTANCE = new LazySingleton_v4();
    }

}
