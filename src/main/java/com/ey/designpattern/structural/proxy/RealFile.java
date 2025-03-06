package com.ey.designpattern.structural.proxy;

//Classe che rappresenta il file vero e proprio
//Il file reale carica i dati al momento della creazione, quindi potrebbe essere costoso in termini di performance.
class RealFile implements File {
 private String nomeFile;

 public RealFile(String nomeFile) {
     this.nomeFile = nomeFile;
     caricaFile();
 }

 private void caricaFile() {
     System.out.println("📂 Caricamento del file: " + nomeFile);
 }

 @Override
 public void apri() {
     System.out.println("✅ Aprendo il file: " + nomeFile);
 }
}