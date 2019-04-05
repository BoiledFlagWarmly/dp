package com.pay.proxy.statics.business;

import com.pay.proxy.statics.business.service.IOrderService;
import com.pay.proxy.statics.business.service.impl.OrderService;
import com.pay.proxy.statics.business.service.impl.OrderServiceProxy;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;
import java.util.UUID;

public class BusinessTest {
    public static void main(String[] args) throws ParseException {

        Order order = new Order();
        //order.setCreateTime(new Date());
        order.setCreateTime(DateUtils.parseDate("20180101","yyyyMMdd"));
        order.setId(UUID.randomUUID().toString());
        order.setOrderId(UUID.randomUUID().toString());
        order.setRemark("test");

        IOrderService orderService = new OrderServiceProxy(new OrderService());
        orderService.createOrder(order);
    }
}
