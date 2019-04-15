package com.pay.decorate;

/**
 * Create by mingshuo.gu on 2019/4/12.
 */
public class DefaultCake implements Cake {

    @Override
    public String message() {
        return "面粉";
    }

    @Override
    public int price() {
        return 10;
    }
}
