package com.example;


public class Rectangle {

    int length;
    int breadth;
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int calculateArea() {
        return length * breadth;
    }

    public int calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public static Rectangle createSquare(int side){
        return new Rectangle(side, side);
    }
}
