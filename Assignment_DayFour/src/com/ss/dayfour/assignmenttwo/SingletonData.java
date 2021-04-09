package com.ss.dayfour.assignmenttwo;
/**
 * Singleton Class
 * @author elijahbrooks
 */
public class SingletonData {
    private static final SingletonData instance = new SingletonData();
    public int count = 0;

    private SingletonData(){}

    /**
     * @return instance of SingletonClass
     */
    public static SingletonData getInstance() {
        return instance;
    }

    /**
     * increment count
     */
    synchronized public void incrementCount(){
        try {
            Thread.sleep(1000);
            count++;
            decrementCount();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * decrement count
     */
    synchronized public void decrementCount(){
        count--;
        incrementCount();
    }
}
