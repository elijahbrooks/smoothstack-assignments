package com.ss.daytwo.assignthree;

public class Rectangle implements Shape {
    private int length;
    private int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of this rectangle is "+length*width);
    }

    @Override
    public void display() {
        System.out.println("Displaying rectangle with an area of " + length * width);
    }
}
