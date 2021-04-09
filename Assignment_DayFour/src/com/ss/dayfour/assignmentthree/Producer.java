package com.ss.dayfour.assignmentthree;

/**
 * @author elijahbrooks
 */
public class Producer extends Thread{
    private QueueList queue;

    /**
     *
     * @param queue queueList to try and produce from
     */
    public Producer(QueueList queue) {
        this.queue = queue;
    }

    @Override
    /**
     * constantly produce data to queue
     */
    public void run(){
        while(true){
            try {
                queue.produce();
                System.out.println(this.getName() + " has produced.");
            } catch (Exception e) {}
        }
    }

}
