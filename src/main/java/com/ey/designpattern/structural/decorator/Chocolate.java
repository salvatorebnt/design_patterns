package com.ey.designpattern.structural.decorator;

public class Chocolate extends CoffeeDecorator  {
    public Chocolate(Coffee coffeeDecorated) {
        super(coffeeDecorated);
    }

    @Override
    public String descrizione() {
        return coffeeDecorated.descrizione() + " + Cioccolato";
    }

    @Override
    public double costo() {
        return coffeeDecorated.costo() + 0.70;
    }
}
