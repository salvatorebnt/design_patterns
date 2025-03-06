package com.ey.designpattern.creational.builder;

class Car {
	private String motore;
	private String colore;
	private boolean haNavigatore;
	private boolean haSediliRiscaldati;

	// Costruttore privato, accessibile solo dal Builder
	private Car(Builder builder) {
		this.motore = builder.motore;
		this.colore = builder.colore;
		this.haNavigatore = builder.haNavigatore;
		this.haSediliRiscaldati = builder.haSediliRiscaldati;
	}

	// Metodo per mostrare i dettagli dell'auto
	public void showDetails() {
		System.out.println("Auto con motore: " + motore);
		System.out.println("Colore: " + colore);
		System.out.println("Navigatore: " + (haNavigatore ? "Sì" : "No"));
		System.out.println("Sedili riscaldati: " + (haSediliRiscaldati ? "Sì" : "No"));
	}

	// Classe Builder statica
	public static class Builder {
		private String motore;
		private String colore;
		private boolean haNavigatore;
		private boolean haSediliRiscaldati;

		// Costruttore del Builder con parametri obbligatori
		public Builder(String motore, String colore) {
			this.motore = motore;
			this.colore = colore;
		}

		// Metodi per aggiungere caratteristiche opzionali
		public Builder setNavigatore(boolean haNavigatore) {
			this.haNavigatore = haNavigatore;
			return this; // Restituisce il Builder stesso per il chaining
		}

		public Builder setSediliRiscaldati(boolean haSediliRiscaldati) {
			this.haSediliRiscaldati = haSediliRiscaldati;
			return this;
		}

		// Metodo build() che costruisce e restituisce un oggetto Auto
		public Car build() {
			return new Car(this);
		}
	}
}
