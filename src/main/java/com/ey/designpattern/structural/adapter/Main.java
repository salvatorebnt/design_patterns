package com.ey.designpattern.structural.adapter;

/*
 * Il Design Pattern Adapter è uno dei Structural Patterns e viene utilizzato per far comunicare 
 * due classi con interfacce incompatibili senza modificarne il codice.
 * 
 * Scenario d'esempio:
 * Immaginiamo di avere un sistema che lavora con Caricabatterie Europei (220V), 
 * ma vogliamo adattarlo per funzionare con Caricabatterie Americani (110V) senza modificare il codice esistente.
 * 
 * Use case
 * Hai un dispositivo elettronico che si aspetta un caricabatterie europeo (220V).
 * Però hai solo un caricabatterie americano (110V), che ha un'interfaccia diversa.
 * Non vuoi (o non puoi) modificare né il dispositivo né il caricabatterie americano.
 */
public class Main {
    public static void main(String[] args) {
        // Caso 1: Uso del caricabatterie europeo senza adattatore
        EuropeanCharger europeanCharger = () -> System.out.println("European charger: 220V.");
        Device device1 = new Device(europeanCharger);
        device1.charge();

        System.out.println("-------------------");

        // Caso 2: Uso del caricabatterie americano con adattatore
        AmericanCharger americanCharger = new AmericanCharger();
        EuropeanCharger adapter = new AdapterCharger(americanCharger);
        Device device2 = new Device(adapter);
        device2.charge();
    }
}
