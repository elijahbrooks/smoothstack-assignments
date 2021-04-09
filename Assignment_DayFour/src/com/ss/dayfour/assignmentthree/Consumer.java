package com.ss.dayfour.assignmentthree;

public class Consumer extends Thread {
    private Producer producer;

    public Consumer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run(){
        while(true){
            try {
                Double data = producer.consume();
                System.out.println("Consumed data from: " + this.getName() + " " + data);
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }

}
