package com.designpattern.creational.Singleton;
//http://howtodoinjava.com/design-patterns/creational/singleton-design-pattern-in-java/
//Double locking with volatile 
public class LazySingleton {
    private static volatile LazySingleton instance = null;
 
    // private constructor
    private LazySingleton() {
    }
 
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                // Double check
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}