package com.ey.designpattern.behavioral.chainofresposability;

/*
 * Il Chain of Responsibility Pattern è un design pattern comportamentale che permette di passare una richiesta 
 * lungo una catena di gestori finché uno di essi non la elabora.
 * Questo evita if annidati e rende il codice più flessibile e scalabile.
 * 
 * Quando usare il Chain of Responsibility?
 * ✅ Quando vogliamo evitare if annidati per gestire richieste diverse.
 * ✅ Quando vogliamo separare mittente e destinatario della richiesta.
 * ✅ Quando vogliamo creare un sistema estensibile, dove possiamo aggiungere nuovi gestori senza modificare il codice esistente.
 * 
 * Esempio: Gestione di Richieste di Supporto Tecnico
 * Immaginiamo un sistema di assistenza clienti con tre livelli di supporto:
 * 1️⃣ Operatore Base → gestisce problemi semplici.
 * 2️⃣ Supervisore → gestisce problemi più complessi.
 * 3️⃣ Responsabile Tecnico → gestisce problemi avanzati.
 * 
 * Se un operatore non può risolvere il problema, lo passa al livello successivo.
 */
public class Main {
    public static void main(String[] args) {
        // Creiamo i livelli di supporto
        Support operatore = new BaseOperator();
        Support supervisore = new SupervisorOperator();
        Support responsabile = new TechnicalOperator();

        // Creiamo la catena di responsabilità
        operatore.setSuccessivo(supervisore);
        supervisore.setSuccessivo(responsabile);

        // Testiamo la gestione delle richieste
        System.out.println("\n🔍 Cliente: Ho dimenticato la password.");
        operatore.gestisciRichiesta("password dimenticata");

        System.out.println("\n🔍 Cliente: Sto ricevendo un errore software.");
        operatore.gestisciRichiesta("errore software");

        System.out.println("\n🔍 Cliente: Il server non risponde.");
        operatore.gestisciRichiesta("server non risponde");
    }
}
