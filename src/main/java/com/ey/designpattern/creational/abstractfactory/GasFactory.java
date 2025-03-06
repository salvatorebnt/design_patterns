package com.ey.designpattern.creational.abstractfactory;

/*
 * Questo pattern è utile quando vogliamo delegare la creazione di oggetti a una classe separata, 
 * invece di istanziarli direttamente nel codice client.
 */
public class GasFactory implements AbstractFactory{

	public Car createCar() {
		return new GasCar();
	}

	public Moto createMoto() {
		return new GasMoto();
	}

}
