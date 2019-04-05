package com.pay.proxy.statics.baseDemo;

/**
 * 被代理类
 */
public class Son implements Person {

    @Override
    public void findLove() {
        System.out.println("我的条件是吧啦吧啦吧啦");
    }
}
