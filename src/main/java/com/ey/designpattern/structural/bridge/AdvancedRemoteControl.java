package com.ey.designpattern.structural.bridge;

public class AdvancedRemoteControl extends RemoteControl{
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("🔇 Dispositivo in modalità silenziosa.");
        device.setVolume(0);
    }
}
