package com.ey.designpattern.behavioral.chainofresposability;

//Ogni classe gestisce solo certe richieste e passa le altre al successivo.
public class SupervisorOperator extends Support {
    @Override
    public void gestisciRichiesta(String problema) {
        if (problema.equals("errore software")) {
            System.out.println("✅ Supervisore: Problema software risolto.");
        } else if (successivo != null) {
            System.out.println("⏩ Supervisore: Problema troppo complesso, passo al responsabile tecnico...");
            successivo.gestisciRichiesta(problema);
        }
    }
}
