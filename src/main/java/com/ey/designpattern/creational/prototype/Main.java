package com.ey.designpattern.creational.prototype;

/*
 * Il Prototype Design Pattern viene utilizzato quando vogliamo creare nuovi oggetti copiando un'istanza 
 * esistente invece di crearli da zero. 
 * Questo è utile per evitare costi di creazione elevati o quando la configurazione di un oggetto è complessa.
 */
public class Main {
    public static void main(String[] args) {
        // Creiamo un'istanza originale di veicolo
        Vehicle original = new Vehicle("Auto", "Ferrari", 2024);
        System.out.println("Original:");
        original.showDetails();

        // Cloniamo il veicolo
        Vehicle cloned = original.clone();
        System.out.println("\nCloned:");
        cloned.showDetails();
    }
}
