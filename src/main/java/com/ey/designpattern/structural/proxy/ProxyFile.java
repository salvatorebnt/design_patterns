package com.ey.designpattern.structural.proxy;

//Proxy per controllare l'accesso al file
//🔹 Se l’utente non ha i permessi, il proxy blocca l’accesso.
//🔹 Se l’utente ha i permessi, inizializza il file solo quando serve (Lazy Initialization).
class ProxyFile implements File {
 private String nomeFile;
 private RealFile fileReale;
 private boolean autorizzato; // Simuliamo l'autenticazione

 public ProxyFile(String nomeFile, boolean autorizzato) {
     this.nomeFile = nomeFile;
     this.autorizzato = autorizzato;
 }

 @Override
 public void apri() {
     if (!autorizzato) {
         System.out.println("❌ Accesso negato al file: " + nomeFile);
         return;
     }

     // Il file viene caricato solo se necessario (Lazy Initialization)
     if (fileReale == null) {
         fileReale = new RealFile(nomeFile);
     }

     fileReale.apri();
 }
}

