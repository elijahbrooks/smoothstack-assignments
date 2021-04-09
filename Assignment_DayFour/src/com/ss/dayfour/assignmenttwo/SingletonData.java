package com.ss.dayfour.assignmenttwo;
/**
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

    synchronized public void incrementCount(){
        try {
            Thread.sleep(1000);
            count++;
            decrementCount();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void decrementCount(){
        count--;
        incrementCount();
    }
}
