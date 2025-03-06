package com.ey.designpattern.structural.bridge;

public class Radio implements Device{
    private int volume = 5;

    @Override
    public void accendi() {
        System.out.println("📻 Radio accesa.");
    }

    @Override
    public void spegni() {
        System.out.println("📻 Radio spenta.");
    }

    @Override
    public void setVolume(int livello) {
        this.volume = livello;
        System.out.println("📻 Volume Radio impostato a " + volume);
    }
}
