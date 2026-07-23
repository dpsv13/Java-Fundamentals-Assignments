package com.wipro.automobile.ship;

public class Compartment {

    private double height;
    private double width;
    private double breadth;

    public Compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Height  : " + height);
        System.out.println("Width   : " + width);
        System.out.println("Breadth : " + breadth);
    }

    public static void main(String[] args) {

        Compartment c = new Compartment(12.5, 8.5, 15.0);
        c.display();
    }
}