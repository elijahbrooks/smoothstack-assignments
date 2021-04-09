package com.ss.dayfour.assignmenttwo;

/**
 * @authoer elijahbrooks
 */
public class ThreadOne implements Runnable{
    @Override
    /**
     * increment count immediately
     */
    public void run() {
        System.out.println("Thread one running");
        SingletonData data = SingletonData.getInstance();
        data.incrementCount();

        System.out.println("Thread 1 finished");
    }
}
