package com.ey.designpattern.creational.builder;

/*
 * Senza il pattern Builder, potremmo avere un costruttore con molti parametri, 
 * il che renderebbe il codice difficile da leggere e mantenere.
 */
public class Main {
	public static void main(String[] args) {
        // Creazione di un'auto con il builder
		Car sportCar = new Car.Builder("V8", "Rosso")
                .setNavigatore(true)
                .setSediliRiscaldati(true)
                .build();

        // Creazione di un'auto base senza optional
        Car baseCar = new Car.Builder("1.6 Diesel", "Blu")
                .build();

        // Mostriamo i dettagli delle auto
        System.out.println("Sport Car:");
        sportCar.showDetails();

        System.out.println("\nBase Car:");
        baseCar.showDetails();
    }
}
