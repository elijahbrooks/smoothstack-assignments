package com.ss.daytwo.assignthree;

/**
 * @author elijahbrooks
 */
public class MainClass {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10, 10);
        Circle cir = new Circle(10);
        Triangle tri = new Triangle(10, 5);

        Shape[] shapes = {rec, cir, tri};
        for(Shape shape : shapes) {
            shape.calculateArea();
            shape.display();
            System.out.println();
        }
    }
}
