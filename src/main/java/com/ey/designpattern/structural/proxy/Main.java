package com.ey.designpattern.structural.proxy;
/*
 * Il Proxy Pattern è un design pattern strutturale che fornisce un oggetto sostituto o surrogato di un altro oggetto 
 * per controllare l’accesso a quest'ultimo.
 * Viene spesso utilizzato per ritardare l'inizializzazione di un oggetto costoso, aggiungere sicurezza 
 * o gestire l'accesso remoto.
 * 
 * Quando usare il Proxy Pattern?
 * ✅ Per controllare l'accesso a un oggetto (es. sicurezza, autenticazione).
 * ✅ Per ritardare la creazione di un oggetto "pesante" fino a quando non è realmente necessario (Lazy Initialization).
 * ✅ Per fornire un’interfaccia identica all'oggetto reale, senza esporlo direttamente.
 * ✅ Per gestire richieste remote come nel caso di chiamate a server o file remoti.
 * 
 * Esempio: Accesso ai file protetti 📂
 * Immaginiamo di avere un sistema che consente agli utenti di accedere a file protetti.
 * Un Proxy verrà utilizzato per controllare gli accessi ai file:
 * 
 * Se l'utente ha i permessi → può accedere al file.
 * Se l'utente NON ha i permessi → viene negato l’accesso.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("👤 Utente non autorizzato:");
        File file1 = new ProxyFile("documento_segreto.pdf", false);
        file1.apri(); // Accesso negato
        
        System.out.println("\n👤 Utente autorizzato:");
        File file2 = new ProxyFile("documento_segreto.pdf", true);
        file2.apri(); // File caricato e aperto
    }
}
