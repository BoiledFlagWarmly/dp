package com.pay.proxy.dynamic.baseDemo;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class BaseDemoTest {

    public static void main1(String[] args) throws Exception {
        IDoHomework doHomework = (IDoHomework) new JDKParentGenerator(new BabyStudent()).getInstance();
        doHomework.math();

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IDoHomework.class});
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/mingshuo.gu/jad158g/clazzs/Proxy0.class");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    public static void main(String[] args) {
        BabyStudent doHomework = (BabyStudent) new CGLIBParentGenerator().getInstance(BabyStudent.class);
        doHomework.math();
    }
}
