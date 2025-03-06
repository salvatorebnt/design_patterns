package com.ey.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory (Gestisce la creazione e il riuso degli oggetti)
//🔹 La Flyweight Factory gestisce gli oggetti condivisi.
//🔹 Se un albero esiste già, lo riutilizziamo invece di crearne uno nuovo.

class TreeFactory {
    static Map<String, Tree> trees = new HashMap<>();

    public static Tree getAlbero(String tipo, String colore, String texture) {
        String chiave = tipo + "-" + colore + "-" + texture;

        // Se l'albero esiste già, lo riutilizziamo
        if (!trees.containsKey(chiave)) {
            System.out.println("🆕 Creazione nuovo albero: " + chiave);
            trees.put(chiave, new Tree(tipo, colore, texture));
        }

        return trees.get(chiave);
    }
}
