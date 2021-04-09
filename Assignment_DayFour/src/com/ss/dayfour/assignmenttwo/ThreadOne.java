package com.ss.dayfour.assignmenttwo;

public class ThreadOne implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread one running");
        SingletonData data = SingletonData.getInstance();
        data.incrementCount();

        System.out.println("Thread 1 finished");
    }
}
