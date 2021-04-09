package com.ss.dayfour.assignmentone;

/**
 * @author elijahbrooks
        */
public class SingletonClass {
    /*
    Lazy Initiation gets done by JVM effectively.
    Thread safe
     */
    private static final SingletonClass instance = new SingletonClass();
    private SingletonClass(){};

    /**
     *
     * @return instance of SingletonClass
     */
    public static SingletonClass getInstance(){
        return instance;
    }

}
