package com.ey.designpattern.creational.singleton;

/*
 * Il Singleton Design Pattern viene utilizzato per garantire che una classe abbia una sola istanza e 
 * fornire un accesso globale a quell'istanza.
 * È utile in scenari come gestione della configurazione, connessioni al database, logger, ecc.
 */
public class Main {
    public static void main(String[] args) {
        // Otteniamo l'istanza del Logger e registriamo un messaggio
    	SingletonLogger logger1 = SingletonLogger.getIstanza();
        logger1.log("Primo messaggio di log.");

        // Otteniamo di nuovo il Logger e registriamo un altro messaggio
        SingletonLogger logger2 = SingletonLogger.getIstanza();
        logger2.log("Secondo messaggio di log.");

        // Verifichiamo che le due istanze siano la stessa
        System.out.println("Logger1 e Logger2 sono la stessa istanza? " + (logger1 == logger2));
    }
}
