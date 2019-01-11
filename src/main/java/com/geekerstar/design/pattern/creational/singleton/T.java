package com.geekerstar.design.pattern.creational.singleton;

/**
 * @author geekerstar
 * date: 2019/1/11 09:43
 * description:
 */
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+instance);

    }
}
