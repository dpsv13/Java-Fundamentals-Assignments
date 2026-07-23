package com.automobile.Fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    public String getModelName() {
        return "Ford EcoSport";
    }

    public String getRegistrationNumber() {
        return "AP39GH2222";
    }

    public String getOwnerName() {
        return "Naresh";
    }

    public int speed() {
        return 160;
    }

    public int tempControl() {
        System.out.println("Temperature Control facility available.");
        return 1;
    }
}