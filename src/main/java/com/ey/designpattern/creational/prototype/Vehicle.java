package com.ey.designpattern.creational.prototype;

class Vehicle implements VehiclePrototype {
    private String tipo;
    private String modello;
    private int anno;

    public Vehicle(String tipo, String modello, int anno) {
        this.tipo = tipo;
        this.modello = modello;
        this.anno = anno;
    }

    // Metodo per mostrare i dettagli del veicolo
    public void showDetails() {
        System.out.println("Tipo: " + tipo + ", Modello: " + modello + ", Anno: " + anno);
    }

    // Implementazione del metodo clone()
    @Override
    public Vehicle clone() {
        try {
            return (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clonazione non supportata", e);
        }
    }
}

