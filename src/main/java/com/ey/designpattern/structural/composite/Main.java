package com.ey.designpattern.structural.composite;

/*
 * Il Composite Pattern è un design pattern strutturale che permette di trattare oggetti singoli e collezioni di oggetti 
 * in modo uniforme.
 * Si utilizza per rappresentare strutture gerarchiche (come alberi, menu, sistemi di cartelle, organizzazioni aziendali, 
 * ecc.).
 * 
 * Quando usare il Composite Pattern?
 * ✅ Quando hai strutture gerarchiche (es. un sistema di cartelle, una struttura aziendale).
 * ✅ Quando vuoi trattare oggetti singoli e gruppi di oggetti nello stesso modo.
 * ✅ Quando vuoi aggiungere facilmente nuovi componenti senza cambiare il codice esistente.
 * 
 * Esempio: Struttura di una Azienda 👔
 * Immaginiamo una struttura aziendale con:
 * 
 * Dipendenti normali (senza sottoposti).
 * Manager (che hanno dipendenti sotto di loro).
 * Con il Composite Pattern, possiamo gestire sia dipendenti singoli che gruppi di dipendenti nello stesso modo! 🚀
 */
public class Main {
    public static void main(String[] args) {
        // Creiamo dipendenti semplici
        Employee dip1 = new SimpleEmployee("Mario Rossi", "Sviluppatore");
        Employee dip2 = new SimpleEmployee("Luca Bianchi", "Designer");
        Employee dip3 = new SimpleEmployee("Anna Verdi", "Marketing");

        // Creiamo i manager
        ManagerEmployee manager1 = new ManagerEmployee("Giovanni Neri", "Team Leader");
        ManagerEmployee manager2 = new ManagerEmployee("Laura Gialli", "Direttrice Generale");

        // Assegniamo dipendenti ai manager
        manager1.aggiungiDipendente(dip1);
        manager1.aggiungiDipendente(dip2);

        manager2.aggiungiDipendente(manager1); // manager2 ha manager1 sotto di sé
        manager2.aggiungiDipendente(dip3);

        // Mostriamo la struttura aziendale
        System.out.println("📌 Struttura Aziendale:");
        manager2.mostraDettagli();
    }
}
