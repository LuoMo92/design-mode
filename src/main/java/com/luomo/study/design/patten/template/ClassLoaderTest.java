package com.luomo.study.design.patten.template;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author LiuMei
 * @date 2018-11-28.
 */
public class ClassLoaderTest {

    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = new MyClassLoader();
        Class<?> clazz = classLoader.loadClass("com.luomo.study.design.patten.template.ClassLoaderTest");
        Object entity = clazz.newInstance();
        System.out.println(entity instanceof ClassLoaderTest);
    }

}

class MyClassLoader extends ClassLoader{

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        String fileName = name.substring(name.lastIndexOf(".")+1) + ".class";
        InputStream is = getClass().getResourceAsStream(fileName);
        if (is == null) {
            return super.loadClass(name);
        }
        try {
            byte[] b = new byte[is.available()];
            is.read(b);
            return defineClass(name, b, 0, b.length);
        } catch (IOException e) {
            throw new ClassNotFoundException();
        }
    }

}