package com.ey.designpattern.creational.factorymethod;

/*
 * Questo pattern è utile quando vogliamo delegare la creazione di oggetti a una classe separata, 
 * invece di istanziarli direttamente nel codice client.
 * 
 * Immaginiamo di voler creare diversi tipi di veicoli (Auto e Moto) 
 * senza specificare direttamente la loro classe nel codice client.
 */
public class Main {
    public static void main(String[] args) {
        // Creazione di un'auto
        Vehicle auto = FactoryMethod.createVehicle("auto");
        auto.drive();

        // Creazione di una moto
        Vehicle moto = FactoryMethod.createVehicle("moto");
        moto.drive();
    }
}
