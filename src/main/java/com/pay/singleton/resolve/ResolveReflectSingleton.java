package com.pay.singleton.resolve;

public class ResolveReflectSingleton {

    private ResolveReflectSingleton(){
        if(Holder.INSTANCE != null){
            throw new RuntimeException("instance exist");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public  static ResolveReflectSingleton getInstance(){
        return Holder.INSTANCE;
    }

    private static class Holder{
        private static ResolveReflectSingleton INSTANCE = new ResolveReflectSingleton();
    }
}
