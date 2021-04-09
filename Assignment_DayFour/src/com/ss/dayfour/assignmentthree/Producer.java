package com.ss.dayfour.assignmentthree;

import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread{
    private QueueList queue;

    public Producer(QueueList queue) {
        this.queue = queue;
    }

    @Override
    public void run(){
        while(true){
            try {
                queue.produce();
                System.out.println(this.getName() + " has produced.");
            } catch (Exception e) {}
        }
    }

}
