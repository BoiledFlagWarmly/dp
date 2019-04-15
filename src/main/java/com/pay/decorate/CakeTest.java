package com.pay.decorate;

/**
 * Create by mingshuo.gu on 2019/4/12.
 */
public class CakeTest {

    public static void main(String[] args) {
        DefaultCake defaultCake = new DefaultCake();
        CaoMeiCake caoMeiCake = new CaoMeiCake(defaultCake);
        EggCake eggCake = new EggCake(caoMeiCake);
        System.out.println(eggCake.message()+" - "+eggCake.price());
    }
}
