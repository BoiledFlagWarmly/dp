package com.pay.decorate;

/**
 * Create by mingshuo.gu on 2019/4/12.
 */
public class EggCake extends CakeDecorator {

    public EggCake(Cake cake) {
        super(cake);
    }

    @Override
    public String message() {
        return super.message()+"egg";
    }

    @Override
    public int price() {
        return super.price()+10;
    }
}
