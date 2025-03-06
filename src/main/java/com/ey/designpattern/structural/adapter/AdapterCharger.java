package com.ey.designpattern.structural.adapter;

//Adapter che permette di usare un CaricabatterieAmericano come un CaricabatterieEuropeo
class AdapterCharger implements EuropeanCharger {
	private AmericanCharger americanCharger;

	public AdapterCharger(AmericanCharger americanCharger) {
		this.americanCharger = americanCharger;
	}

	@Override
	public void charge() {
		System.out.println("Adattatore in uso...");
		americanCharger.charge110V(); // Chiama il metodo della classe incompatibile
	}

}
