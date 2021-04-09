package com.ss.dayfour.assignmentthree;

public class ProduceConsumerProblem {
    public static void main(String[] args) {
        QueueList list = QueueList.getInstance();

        Producer producer = new Producer(list);
        producer.setName("Producer-1");
        producer.start();

        Producer producer2 = new Producer(list);
        producer2.setName("Producer-2");
        producer2.start();

        Producer producer3 = new Producer(list);
        producer3.setName("Producer-3");
        producer3.start();

        Consumer consumer = new Consumer(list);
        consumer.setName("Consumer-1");
        consumer.start();

        Consumer consumer2 = new Consumer(list);
        consumer2.setName("Consumer-2");
        consumer2.start();

        Consumer consumer3 = new Consumer(list);
        consumer3.setName("Consumer-3");
        consumer3.start();
    }
}
