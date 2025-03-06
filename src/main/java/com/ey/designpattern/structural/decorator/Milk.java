package com.ey.designpattern.structural.decorator;

class Milk extends CoffeeDecorator {
	public Milk(Coffee coffeeDecorated) {
		super(coffeeDecorated);
	}

	@Override
	public String descrizione() {
		return coffeeDecorated.descrizione() + " + Latte";
	}

	@Override
	public double costo() {
		return coffeeDecorated.costo() + 0.50;
	}
}
