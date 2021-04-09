package com.ss.dayfour.assignmenttwo;

/**
 * @author elijahbrooks
 */
public class Main {
    /**
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());

        threadOne.start();
        threadTwo.start();
    }
}
