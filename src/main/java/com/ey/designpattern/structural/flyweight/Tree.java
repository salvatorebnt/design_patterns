package com.ey.designpattern.structural.flyweight;

//Flyweight (Parte condivisa tra più oggetti)
//🔹 Tipo, colore e texture sono condivisi tra più alberi.
//🔹 La posizione (x, y) è variabile e viene passata nel metodo disegna().
class Tree {
	private String tipo;
	private String colore;
	private String texture;

	public Tree(String tipo, String colore, String texture) {
		this.tipo = tipo;
		this.colore = colore;
		this.texture = texture;
	}

	public void disegna(int x, int y) {
		System.out.println("🌲 Albero di tipo: " + tipo + " - Colore: " + colore + " - Texture: " + texture
				+ " → Posizione: (" + x + ", " + y + ")");
	}
}
