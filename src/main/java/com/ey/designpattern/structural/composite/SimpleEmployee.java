package com.ey.designpattern.structural.composite;

public class SimpleEmployee implements Employee{
    private String nome;
    private String ruolo;

    public SimpleEmployee(String nome, String ruolo) {
        this.nome = nome;
        this.ruolo = ruolo;
    }

    @Override
    public void mostraDettagli() {
        System.out.println("👤 " + nome + " - " + ruolo);
    }
}