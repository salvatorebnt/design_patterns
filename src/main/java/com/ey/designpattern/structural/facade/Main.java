package com.ey.designpattern.structural.facade;

/*
 * Il Facade Pattern è un design pattern strutturale che fornisce un'interfaccia semplificata a un sistema complesso.
 * 
 * Quando usare il Facade Pattern?
 * Quando hai un sistema complesso con molte classi e vuoi fornire un'interfaccia più semplice per l'uso.
 * Quando vuoi nascondere i dettagli interni del sistema e offrire un'interfaccia unica.
 * Quando vuoi ridurre la dipendenza tra il codice client e le classi interne di un sistema.
 * 
 * Immagina di dover avviare un computer. Il processo coinvolge diversi sottosistemi:
 * Alimentazione
 * CPU
 * Memoria
 * Disco rigido
 * Senza un Facade, il client dovrebbe interagire con tutte queste classi separatamente. 
 * Con il Facade Pattern, possiamo nascondere la complessità dietro un'unica interfaccia semplice, come Computer.avvia().
 */
public class Main {
    public static void main(String[] args) {
        // Il client usa solo il Facade invece di interagire con le classi interne
        ComputerFacade mioComputer = new ComputerFacade();
        
        mioComputer.avvia(); // Nasconde la complessità
        System.out.println("-------------------");
        mioComputer.spegni();
    }
}
