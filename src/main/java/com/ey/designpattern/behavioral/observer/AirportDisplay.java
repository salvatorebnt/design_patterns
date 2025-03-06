package com.ey.designpattern.behavioral.observer;

public class AirportDisplay implements Observator {
    @Override
    public void aggiorna(float temperatura) {
        System.out.println("✈️ Aeroporto: Nuova temperatura: " + temperatura + "°C");
    }
}
