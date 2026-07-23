package demo;

import test.Foundation;

public class AccessTest {

    public static void main(String[] args) {

        Foundation obj = new Foundation();

        // System.out.println(obj.var1); // Not Accessible (private)

        // System.out.println(obj.var2); // Not Accessible (default)

        // System.out.println(obj.var3); // Not Accessible (protected)

        System.out.println("Public Variable : " + obj.var4);
    }
}