package com.ey.designpattern.behavioral.chainofresposability;

// Ogni handler può passare la richiesta al successivo.
abstract class Support {
    protected Support successivo; // Prossimo handler nella catena

    public void setSuccessivo(Support successivo) {
        this.successivo = successivo;
    }

    public abstract void gestisciRichiesta(String problema);
}