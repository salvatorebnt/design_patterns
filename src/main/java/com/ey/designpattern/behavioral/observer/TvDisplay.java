package com.ey.designpattern.behavioral.observer;

public class TvDisplay implements Observator{
    @Override
    public void aggiorna(float temperatura) {
        System.out.println("📺 TV: Nuova temperatura: " + temperatura + "°C");
    }
}
