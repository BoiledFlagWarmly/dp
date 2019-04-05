package com.pay.proxy.statics.business.service.impl;

import com.pay.proxy.statics.business.DbChooseMark;
import com.pay.proxy.statics.business.Order;
import com.pay.proxy.statics.business.service.IOrderService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceProxy implements IOrderService {

    private SimpleDateFormat yyyyFormat = new SimpleDateFormat("yyyy");
    private IOrderService orderService;

    public OrderServiceProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void createOrder(Order order) {
        Date createTime = order.getCreateTime();
        DbChooseMark.set(yyyyFormat.format(createTime));
        orderService.createOrder(order);
        DbChooseMark.restore();
    }
}
