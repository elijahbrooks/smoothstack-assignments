package com.ss.dayfour.assignmentthree;

public class Consumer extends Thread {
    private QueueList queue;

    public Consumer(QueueList queue) {
        this.queue = queue;
    }

    @Override
    public void run(){
        while(true){
            try {
                Double data = queue.consume();
                System.out.println("Consumed data from: " + this.getName() + " " + data);
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }

}
