package com.ey.designpattern.structural.flyweight;

/*
 * Il Flyweight Pattern è un design pattern strutturale usato per ottimizzare l'uso della memoria 
 * quando si hanno molti oggetti simili. Si basa sul riutilizzo di oggetti condivisi invece di crearne sempre di nuovi.
 * 
 * Quando usare il Flyweight Pattern?
 * ✅ Quando abbiamo un grande numero di oggetti simili, e vogliamo risparmiare memoria.
 * ✅ Quando gli oggetti possono avere una parte intrinseca (condivisa) e una estrinseca (variabile).
 * ✅ Quando vogliamo evitare duplicazioni inutili di oggetti identici.
 * 
 * Esempio: Creazione di Alberi in un Videogioco 🌲
 * Immaginiamo di dover creare migliaia di alberi in un videogioco.
 * Ogni albero ha:
 * Parte intrinseca (condivisa) → Tipo di albero, texture, colore.
 * Parte estrinseca (variabile) → Posizione (x, y).
 * Senza Flyweight, avremmo migliaia di oggetti duplicati con gli stessi dati.
 * Con il Flyweight Pattern, riutilizziamo gli alberi già creati! 🚀
 */
public class Main {
    public static void main(String[] args) {
        // Creiamo alberi riutilizzando quelli esistenti
    	Tree albero1 = TreeFactory.getAlbero("Quercia", "Verde", "Foglie Estive");
        albero1.disegna(10, 20);

        Tree albero2 = TreeFactory.getAlbero("Pino", "Verde Scuro", "Aghi Lunghi");
        albero2.disegna(30, 40);

        Tree albero3 = TreeFactory.getAlbero("Quercia", "Verde", "Foglie Estive"); // Riutilizza il primo albero!
        albero3.disegna(50, 60);

        // Stampiamo quanti oggetti sono stati creati
        System.out.println("\n🔍 Numero totale di oggetti creati: " + TreeFactory.trees.size());
    }
}
