package com.ey.designpattern.creational.singleton;

public class SingletonLogger {
    // Istanza statica privata della classe (inizialmente null)
    private static SingletonLogger istanza;

    // Costruttore privato per impedire l'istanziazione diretta
    private SingletonLogger() {}

    // Metodo pubblico per ottenere l'unica istanza del Logger
    public static SingletonLogger getIstanza() {
        if (istanza == null) {
            istanza = new SingletonLogger();
        }
        return istanza;
    }

    // Metodo per registrare messaggi di log
    public void log(String messaggio) {
        System.out.println("[LOG]: " + messaggio);
    }
}
