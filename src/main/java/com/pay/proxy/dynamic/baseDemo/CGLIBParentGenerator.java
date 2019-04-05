package com.pay.proxy.dynamic.baseDemo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLIBParentGenerator implements MethodInterceptor {


    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("help finish homework");
        Object resp = methodProxy.invokeSuper(o, objects);
        System.out.println("check homework");
        return resp;
    }
}
