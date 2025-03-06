package com.ey.designpattern.creational.abstractfactory;

/*
 * Il pattern Abstract Factory è un'estensione del Factory Method, usato quando abbiamo più famiglie di oggetti correlati e vogliamo gestire la loro creazione in modo centralizzato.
 * 
 * Scenario d'esempio
 * Immaginiamo di dover creare due tipi di veicoli: Auto e Moto, e ognuno può appartenere a una famiglia di veicoli Elettrici o a Benzina. L'Abstract Factory ci aiuterà a generare gli oggetti giusti senza accoppiare il codice client a classi specifiche.
 */
public class Main {
    public static void main(String[] args) {
        // Creiamo una factory per veicoli elettrici
    	AbstractFactory factoryElettrica = new ElectricFactory();
        Car autoElettrica = factoryElettrica.createCar();
        Moto motoElettrica = factoryElettrica.createMoto();
        autoElettrica.showDetails();
        motoElettrica.showDetails();

        System.out.println("-------------------");

        // Creiamo una factory per veicoli a benzina
        AbstractFactory factoryBenzina = new GasFactory();
        Car autoBenzina = factoryBenzina.createCar();
        Moto motoBenzina = factoryBenzina.createMoto();
        autoBenzina.showDetails();
        motoBenzina.showDetails();
    }
}
