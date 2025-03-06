package com.ey.designpattern.structural.decorator;
/*
 * Il Decorator Pattern è un design pattern strutturale che permette di aggiungere dinamicamente nuove funzionalità a 
 * un oggetto senza modificare la sua struttura originale.
 * 
 * Quando usare il Decorator Pattern?
 * Quando vuoi estendere il comportamento di un oggetto in modo flessibile, senza usare l'ereditarietà.
 * Quando hai diverse combinazioni di funzionalità da applicare a un oggetto.
 * Quando vuoi evitare la creazione di troppe sottoclassi per ogni variazione di comportamento.
 * 
 * Immagina di gestire una caffetteria dove puoi ordinare un caffè semplice e aggiungere decorazioni come latte, zucchero, cioccolato, ecc.
 * Senza il Decorator Pattern, dovremmo creare sottoclassi come:
 * CaffeConLatte
 * CaffeConZucchero
 * CaffeConLatteEZucchero
 * ... e così via! 
 * Con il Decorator Pattern, possiamo aggiungere dinamicamente ingredienti al caffè senza creare infinite sottoclassi
 * 
 */
public class Main {
    public static void main(String[] args) {
        // Caffè semplice
        Coffee mioCaffe = new SimpleCoffee();
        System.out.println(mioCaffe.descrizione() + " -> €" + mioCaffe.costo());

        // Aggiungiamo Latte
        mioCaffe = new Milk(mioCaffe);
        System.out.println(mioCaffe.descrizione() + " -> €" + mioCaffe.costo());

        // Aggiungiamo Zucchero
        mioCaffe = new Sugar(mioCaffe);
        System.out.println(mioCaffe.descrizione() + " -> €" + mioCaffe.costo());

        // Aggiungiamo Cioccolato
        mioCaffe = new Chocolate(mioCaffe);
        System.out.println(mioCaffe.descrizione() + " -> €" + mioCaffe.costo());
    }
}
