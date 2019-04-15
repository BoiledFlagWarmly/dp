package com.pay.decorate;

/**
 * Create by mingshuo.gu on 2019/4/12.
 */
public abstract class CakeDecorator implements Cake {

    private Cake cake;
    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String message() {
        return this.cake.message();
    }

    @Override
    public int price() {
        return this.cake.price();
    }
}
