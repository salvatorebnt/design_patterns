package com.ey.designpattern.creational.factorymethod;

public class FactoryMethod {
	// Metodo factory che restituisce un oggetto Veicolo
    public static Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("auto")) {
            return new Car();
        } else if (type.equalsIgnoreCase("moto")) {
            return new Moto();
        } else {
            throw new IllegalArgumentException("Tipo di veicolo non supportato");
        }
    }
}
