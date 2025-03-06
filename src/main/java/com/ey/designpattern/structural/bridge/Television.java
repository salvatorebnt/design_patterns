package com.ey.designpattern.structural.bridge;

public class Television implements Device{
    private int volume = 10;

    @Override
    public void accendi() {
        System.out.println("📺 TV accesa.");
    }

    @Override
    public void spegni() {
        System.out.println("📺 TV spenta.");
    }

    @Override
    public void setVolume(int livello) {
        this.volume = livello;
        System.out.println("📺 Volume TV impostato a " + volume);
    }
}
