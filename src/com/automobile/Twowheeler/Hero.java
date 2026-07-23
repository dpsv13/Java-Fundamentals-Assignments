package com.automobile.Twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {

    public String getModelName() {
        return "Hero Splendor";
    }

    public String getRegistrationNumber() {
        return "AP39AB1234";
    }

    public String getOwnerName() {
        return "Ramesh";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio facility available.");
    }
}