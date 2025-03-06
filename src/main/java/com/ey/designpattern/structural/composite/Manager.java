package com.ey.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composito (Manager con dipendenti sotto di sé)
//🔹 Manager è un nodo dell'albero, cioè può avere dipendenti sotto di sé.
//🔹 Usa un ArrayList per gestire i suoi dipendenti.
//🔹 Può aggiungere o rimuovere dipendenti dinamicamente.
class ManagerEmployee implements Employee {
    private String nome;
    private String ruolo;
    private List<Employee> dipendenti = new ArrayList<>();

    public ManagerEmployee(String nome, String ruolo) {
        this.nome = nome;
        this.ruolo = ruolo;
    }

    // Aggiunge un dipendente sotto questo manager
    public void aggiungiDipendente(Employee dipendente) {
        dipendenti.add(dipendente);
    }

    // Rimuove un dipendente
    public void rimuoviDipendente(Employee dipendente) {
        dipendenti.remove(dipendente);
    }

    @Override
    public void mostraDettagli() {
        System.out.println("\n👨‍💼 " + nome + " - " + ruolo);
        System.out.println("   📋 Sottoposti:");

        for (Employee d : dipendenti) {
            System.out.print("   ➜ ");
            d.mostraDettagli();
        }
    }
}
