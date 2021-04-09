package com.ss.dayfour.assignmenttwo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());

        threadOne.start();
        threadTwo.start();
    }
}
