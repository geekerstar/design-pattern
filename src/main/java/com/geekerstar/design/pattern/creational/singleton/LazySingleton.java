package com.geekerstar.design.pattern.creational.singleton;

/**
 * @author geekerstar
 * date: 2019/1/11 09:39
 * description: 线程不安全
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){

    }
    public synchronized static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
