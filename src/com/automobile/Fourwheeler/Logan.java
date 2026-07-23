package com.automobile.Fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {

    public String getModelName() {
        return "Logan";
    }

    public String getRegistrationNumber() {
        return "AP39EF1111";
    }

    public String getOwnerName() {
        return "Mahesh";
    }

    public int speed() {
        return 140;
    }

    public int gps() {
        System.out.println("GPS facility available.");
        return 1;
    }
}