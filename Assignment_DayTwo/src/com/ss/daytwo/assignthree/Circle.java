package com.ss.daytwo.assignthree;

public class Circle implements Shape{
    private int radius;

    Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of this circle is "+getArea());
    }

    @Override
    public void display() {
        System.out.println("Displaying a circle with an area of "+getArea());
    }

    private double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
