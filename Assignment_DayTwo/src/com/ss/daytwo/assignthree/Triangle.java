package com.ss.daytwo.assignthree;

public class Triangle implements Shape {
    private int base;
    private int height;

    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of this triangle is "+getArea());
    }

    @Override
    public void display() {
        System.out.println("Displaying a triangle with an area of "+getArea());
    }

    private double getArea(){
        return (base*height)/2;
    }
}
