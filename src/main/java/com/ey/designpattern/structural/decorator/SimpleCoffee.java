package com.ey.designpattern.structural.decorator;

public class SimpleCoffee implements Coffee{
	   @Override
	    public String descrizione() {
	        return "Caffè semplice";
	    }

	    @Override
	    public double costo() {
	        return 1.00;
	    }
}
