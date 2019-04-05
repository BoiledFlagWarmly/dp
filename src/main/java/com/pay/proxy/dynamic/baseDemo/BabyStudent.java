package com.pay.proxy.dynamic.baseDemo;

/**
 * 被代理类
 */
public class BabyStudent implements IDoHomework {
    @Override
    public void math() {
        System.out.println("baby is working the maths");
    }
}
