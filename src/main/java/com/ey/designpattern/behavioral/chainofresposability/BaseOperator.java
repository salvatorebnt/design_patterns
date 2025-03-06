package com.ey.designpattern.behavioral.chainofresposability;

//Ogni classe gestisce solo certe richieste e passa le altre al successivo.
public class BaseOperator extends Support{
    @Override
    public void gestisciRichiesta(String problema) {
        if (problema.equals("password dimenticata")) {
            System.out.println("✅ Operatore: Reset della password effettuato.");
        } else if (successivo != null) {
            System.out.println("⏩ Operatore: Problema troppo complesso, passo al supervisore...");
            successivo.gestisciRichiesta(problema);
        }
    }
}
