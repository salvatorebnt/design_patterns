package com.ey.designpattern.structural.decorator;

class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffeeDecorated) {
        super(coffeeDecorated);
    }

    @Override
    public String descrizione() {
        return coffeeDecorated.descrizione() + " + Zucchero";
    }

    @Override
    public double costo() {
        return coffeeDecorated.costo() + 0.20;
    }
}