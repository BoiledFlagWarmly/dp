package com.pay.proxy.dynamic.baseDemo;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类生成类
 */
public class JDKParentGenerator implements InvocationHandler {

    private Object obj;

    public JDKParentGenerator(Object obj) {
        this.obj = obj;
    }

    public Object getInstance() {
        Class<?> clazz = obj.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("help finish homework");
        Object resp = method.invoke(obj, args);
        System.out.println("check homework");
        return resp;
    }
}
