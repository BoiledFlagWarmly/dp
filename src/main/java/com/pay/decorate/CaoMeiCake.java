package com.pay.decorate;

/**
 * Create by mingshuo.gu on 2019/4/12.
 */
public class CaoMeiCake extends CakeDecorator {

    public CaoMeiCake(Cake cake) {
        super(cake);
    }

    @Override
    public String message() {
        return super.message()+"cao mei";
    }

    @Override
    public int price() {
        return super.price()+10;
    }
}
