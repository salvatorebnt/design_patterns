package com.ey.designpattern.structural.adapter;

public class Device {
    private EuropeanCharger charger;

    public Device(EuropeanCharger charger) {
        this.charger = charger;
    }


    public void charge() {
        System.out.println("Device in charging...");
        charger.charge();
    }
}
