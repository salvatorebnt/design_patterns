package com.ey.designpattern.behavioral.observer;

public class SmartphoneDisplay implements Observator{
	
    @Override
    public void aggiorna(float temperatura) {
        System.out.println("📱 Smartphone: Nuova temperatura: " + temperatura + "°C");
    }
}
