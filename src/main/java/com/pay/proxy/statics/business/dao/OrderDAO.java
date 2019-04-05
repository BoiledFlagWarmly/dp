package com.pay.proxy.statics.business.dao;

import com.pay.proxy.statics.business.DbChooseMark;
import com.pay.proxy.statics.business.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderDAO {

    public void insert(Order order){
        System.out.println("choose datasource : "+DbChooseMark.get()+" insert order");
    }
}
