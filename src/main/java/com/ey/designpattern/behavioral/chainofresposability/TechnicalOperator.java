package com.ey.designpattern.behavioral.chainofresposability;

//Ogni classe gestisce solo certe richieste e passa le altre al successivo.
public class TechnicalOperator extends Support{
    @Override
    public void gestisciRichiesta(String problema) {
        System.out.println("✅ Responsabile Tecnico: Problema avanzato risolto.");
    }
}
