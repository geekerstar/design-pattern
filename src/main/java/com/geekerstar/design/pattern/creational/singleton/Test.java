package com.geekerstar.design.pattern.creational.singleton;

/**
 * @author geekerstar
 * date: 2019/1/11 09:41
 * description:
 */
public class Test {
    public static void main(String[] args) {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");

    }
}
