package com.ey.designpattern.creational.abstractfactory;

/*
 * Questo pattern è utile quando vogliamo delegare la creazione di oggetti a una classe separata, 
 * invece di istanziarli direttamente nel codice client.
 */
public class ElectricFactory implements AbstractFactory{

	public Car createCar() {
		return new ElectricCar();
	}

	public Moto createMoto() {
		return new ElectricMoto();
	}

}
