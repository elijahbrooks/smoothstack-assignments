package com.ss.dayfour.assignmenttwo;

public class ThreadTwo implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread 2 running");
        SingletonData data = SingletonData.getInstance();
        data.decrementCount();

        System.out.println("Thread 2 finished");
    }
}
