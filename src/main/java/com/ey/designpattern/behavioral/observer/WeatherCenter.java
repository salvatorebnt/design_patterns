package com.ey.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherCenter {
	private List<Observator> osservatori = new ArrayList<>();
    private float temperatura;

    // Aggiunge un osservatore
    public void aggiungiOsservatore(Observator osservatore) {
        osservatori.add(osservatore);
    }

    // Rimuove un osservatore
    public void rimuoviOsservatore(Observator osservatore) {
        osservatori.remove(osservatore);
    }

    // Notifica tutti gli osservatori
    public void notificaOsservatori() {
        for (Observator osservatore : osservatori) {
            osservatore.aggiorna(temperatura);
        }
    }

    // Metodo per aggiornare la temperatura e notificare gli osservatori
    public void setTemperatura(float nuovaTemperatura) {
        this.temperatura = nuovaTemperatura;
        System.out.println("🌡️ Temperatura aggiornata: " + temperatura + "°C");
        notificaOsservatori();
    }
}
