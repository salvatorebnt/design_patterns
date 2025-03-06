package com.ey.designpattern.behavioral.observer;

/*
 * Il Observer Pattern è un design pattern comportamentale che definisce una relazione uno-a-molti tra oggetti, 
 * in modo che quando un oggetto cambia stato, tutti gli oggetti dipendenti vengano notificati automaticamente.
 * 
 * Quando usare l'Observer Pattern?
 * Quando hai un oggetto principale (soggetto) che deve notificare più oggetti (osservatori) in caso di cambiamenti.
 * Quando vuoi disaccoppiare il soggetto e gli osservatori, in modo che possano evolvere indipendentemente.
 * Quando hai eventi che devono aggiornare più componenti in tempo reale.
 * 
 * Esempio: Un Sistema di Notifiche Meteo 
 * Immaginiamo un sistema di monitoraggio del meteo.
 * 
 * Un Centro Meteo raccoglie dati sulle temperature.
 * Diversi dispositivi (app sul telefono, display in aeroporto, display TV) devono essere aggiornati automaticamente quando la temperatura cambia.
 * Usiamo l'Observer Pattern per garantire che tutti i display ricevano l'aggiornamento senza dover modificare il codice del Centro Meteo!
 */
public class Main {
	public static void main(String[] args) {
		// Creiamo il soggetto (Centro Meteo)
		WeatherCenter centroMeteo = new WeatherCenter();

		// Creiamo gli osservatori (dispositivi)
		Observator smartphone = new SmartphoneDisplay();
		Observator aeroporto = new AirportDisplay();
		Observator tv = new TvDisplay();

		// Registriamo gli osservatori al Centro Meteo
        // Registriamo gli osservatori al Centro Meteo
        centroMeteo.aggiungiOsservatore(smartphone);
        centroMeteo.aggiungiOsservatore(aeroporto);
        centroMeteo.aggiungiOsservatore(tv);

        // Cambiamo la temperatura, tutti gli osservatori verranno notificati
        centroMeteo.setTemperatura(25.5f);
        System.out.println("-------------------");

        // Rimuoviamo un osservatore (il display TV non riceverà più aggiornamenti)
        centroMeteo.rimuoviOsservatore(tv);

        // Cambiamo di nuovo la temperatura
        centroMeteo.setTemperatura(30.0f);
	}
}
