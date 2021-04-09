package com.ss.dayfour.assignmentthree;

import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread{

    private final int MAX_SIZE = 5;
    private List<Double> integerList = new ArrayList<Double>();


    @Override
    public void run(){
        while(true){
            try {
                produce();
            } catch (Exception e) {}
        }
    }

    synchronized public void produce() throws InterruptedException {
        if(integerList.size() >= MAX_SIZE){
            System.out.println("List is full.");
            wait(); // Halt here until notified to continue by another thread.
        }
        System.out.println("Adding new item to list");
        integerList.add(Math.random()*10);

        notify();
    }

    synchronized public Double consume() throws InterruptedException {
        if(integerList.isEmpty()){
            System.out.println("List is empty.");
            wait();
        }
        Double data = integerList.get(0);
        integerList.remove(0);

        notify();
        return data;
    }
}
