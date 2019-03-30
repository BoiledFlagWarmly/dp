package com.pay.singleton.resolve;

import java.io.Serializable;

/**
 * 解决 序列化破坏单例
 */
public class ResolveSerializeSingleton implements Serializable{

    private ResolveSerializeSingleton(){
        System.out.println("init -.-");
        if(Holder.INSTANCE != null){
            throw new RuntimeException("instance exist");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public  static ResolveSerializeSingleton getInstance(){
        return Holder.INSTANCE;
    }

    private static class Holder{
        private static ResolveSerializeSingleton INSTANCE = new ResolveSerializeSingleton();
    }

    private Object readResolve(){
        return Holder.INSTANCE;
    }
}
