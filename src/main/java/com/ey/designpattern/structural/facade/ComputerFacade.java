package com.ey.designpattern.structural.facade;

public class ComputerFacade {
    private PowerSupply alimentazione;
    private Cpu cpu;
    private Memory memoria;
    private Disk discoRigido;

    public ComputerFacade() {
        this.alimentazione = new PowerSupply();
        this.cpu = new Cpu();
        this.memoria = new Memory();
        this.discoRigido = new Disk();
    }

    public void avvia() {
        System.out.println("🖥️ Avvio del computer...");
        alimentazione.accendi();
        cpu.avvia();
        memoria.carica();
        discoRigido.avvia();
        System.out.println("✅ Computer avviato con successo!");
    }

    public void spegni() {
        System.out.println("🖥️ Spegnimento del computer...");
        alimentazione.spegni();
        System.out.println("✅ Computer spento.");
    }
}
