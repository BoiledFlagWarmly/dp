package com.pay.proxy.statics.business.service.impl;

import com.pay.proxy.statics.business.Order;
import com.pay.proxy.statics.business.dao.OrderDAO;
import com.pay.proxy.statics.business.service.IOrderService;

public class OrderService implements IOrderService {

    private OrderDAO orderDAO;

    public OrderService() {
        orderDAO = new OrderDAO();
    }

    @Override
    public void createOrder(Order order) {
        orderDAO.insert(order);
    }
}
