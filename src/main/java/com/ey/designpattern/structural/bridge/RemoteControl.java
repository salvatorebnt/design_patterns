package com.ey.designpattern.structural.bridge;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void accendi() {
    	device.accendi();
    }

    public void spegni() {
    	device.spegni();
    }

    public void aumentaVolume() {
    	device.setVolume(20);
    }
}
