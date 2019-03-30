package com.pay.singleton.resolve;

import java.io.Serializable;

public enum EnumSingleton implements Serializable {

    INSTANCE;


    public static EnumSingleton getInstance(){
       return INSTANCE;
    }
}
