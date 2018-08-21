package com.example.rui.daggerstudyapplication.coffee;

/**
 * 加热器接口的一个实现，电加热器
 */
public class ElectricHeater implements Heater {
    boolean heating;

    @Override
    public void on() {
        System.out.println("-- heating --");
        this.heating = true;
    }

    @Override
    public void off() {
        this.heating = false;
    }

    @Override
    public boolean isHot() {
        return heating;
    }
}
