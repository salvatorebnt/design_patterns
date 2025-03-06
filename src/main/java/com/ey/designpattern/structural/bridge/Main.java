package com.ey.designpattern.structural.bridge;

/*
 * Il Bridge Pattern è un design pattern strutturale che separa l'astrazione dall'implementazione, 
 * permettendo di modificarle indipendentemente l'una dall'altra.
 * 
 * 📌 Quando usare il Bridge Pattern?
 * Quando hai più gerarchie di classi che crescono indipendentemente.
 * Quando vuoi separare l'astrazione (es. un dispositivo elettronico) dall'implementazione concreta (es. tipo di controllo remoto).
 * Quando vuoi evitare troppa ereditarietà e invece preferisci la composizione.
 * 
 * Immagina di avere una serie di dispositivi elettronici (TV, Radio, etc.) e diversi tipi di controlli remoti 
 * (base, avanzato).
 * Se usassimo solo ereditarietà, dovremmo creare una classe per ogni combinazione, ad esempio:
 * TVConTelecomandoBase, TVConTelecomandoAvanzato
 * RadioConTelecomandoBase, RadioConTelecomandoAvanzato
 * Questo diventa ingestibile!
 * Invece, con il Bridge Pattern, separiamo i dispositivi e i telecomandi in due gerarchie indipendenti.
 */
public class Main {
    public static void main(String[] args) {
        // Creiamo una TV con telecomando base
        Device tv = new Television();
        RemoteControl baseRemoteControl = new BaseRemoteControl(tv);
        
        baseRemoteControl.accendi();
        baseRemoteControl.aumentaVolume();
        baseRemoteControl.spegni();

        System.out.println("-------------------");

        // Creiamo una Radio con telecomando avanzato
        Device radio = new Radio();
        RemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);

        advancedRemoteControl.accendi();
        ((AdvancedRemoteControl) advancedRemoteControl).mute(); // Usa la funzione avanzata
        advancedRemoteControl.spegni();
    }
}
