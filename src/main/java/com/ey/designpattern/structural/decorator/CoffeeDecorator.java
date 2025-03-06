package com.ey.designpattern.structural.decorator;

//Decorator astratto che implementa l'interfaccia Caffe
abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffeeDecorated;

    public CoffeeDecorator(Coffee caffeDecorated) {
        this.coffeeDecorated = caffeDecorated;
    }

    @Override
    public String descrizione() {
        return coffeeDecorated.descrizione();
    }

    @Override
    public double costo() {
        return coffeeDecorated.costo();
    }
}
