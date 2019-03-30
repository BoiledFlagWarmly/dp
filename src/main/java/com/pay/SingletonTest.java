package com.pay;

import com.pay.singleton.lazy.LazySingleton_v2;
import com.pay.singleton.lazy.LazySingleton_v3;
import com.pay.singleton.lazy.LazySingleton_v4;
import com.pay.singleton.resolve.EnumSingleton;
import com.pay.singleton.resolve.ResolveReflectSingleton;
import com.pay.singleton.resolve.ResolveSerializeSingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单例测试类
 */
public class SingletonTest {

    public static void main(String[] args) throws Exception {
        // 1 并发测试，检测创建实例是否唯一
        //concurrentTest();
        // 2 反射破坏单例
        //reflectTest();
        // 3 序列化破坏单例
        serializeTest();
    }


    private static void serializeTest() throws IOException, ClassNotFoundException {

        EnumSingleton instance = EnumSingleton.getInstance();
        //ResolveSerializeSingleton instance = ResolveSerializeSingleton.getInstance();
        System.out.println(instance);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.obj"));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.obj"));
        Object obj = ois.readObject();
        System.out.println(obj);

        System.out.println(instance == obj);
    }

    private static void reflectTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        ResolveReflectSingleton instance = ResolveReflectSingleton.getInstance();
        System.out.println(instance);

        Class<?> lazySingleton_v4Class = ResolveReflectSingleton.class;
        Constructor<?> constructor = lazySingleton_v4Class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object reflectInstance = constructor.newInstance();
        System.out.println(reflectInstance);

        System.out.println(instance==reflectInstance);
    }

    private static void concurrentTest() throws InterruptedException {

        int concurrentCount = 100;
        CountDownLatch latch = new CountDownLatch(1);
        ExecutorService threadPool1 = Executors.newFixedThreadPool(concurrentCount);

        for(int i=0;i<concurrentCount;i++){
            threadPool1.execute(()->{
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //HungerSingleton hungerSingleton = HungerSingleton.getInstance();
                //System.out.println(hungerSingleton);

                long currentTimeMillis = System.currentTimeMillis();
                LazySingleton_v4 lazySingleton = LazySingleton_v4.getInstance();
                System.out.println(lazySingleton+" use time:"+(System.currentTimeMillis() - currentTimeMillis));

            });
        }

        latch.countDown();
        Thread.currentThread().join();
    }
}
