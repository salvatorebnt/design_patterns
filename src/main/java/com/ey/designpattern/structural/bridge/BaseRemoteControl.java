package com.ey.designpattern.structural.bridge;

public class BaseRemoteControl extends RemoteControl{
    public BaseRemoteControl(Device device) {
        super(device);
    }

    public void info() {
        System.out.println("📟 Telecomando base in uso.");
    }
}
