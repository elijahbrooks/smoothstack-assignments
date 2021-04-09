package com.ss.dayfour.assignmenttwo;

/**
 * @author elijahbrooks
 */
public class ThreadTwo implements Runnable{
    @Override
    /**
     * decrement count immediately.
     */
    public void run() {
        System.out.println("Thread 2 running");
        SingletonData data = SingletonData.getInstance();
        data.decrementCount();

        System.out.println("Thread 2 finished");
    }
}
