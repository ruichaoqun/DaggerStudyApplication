package com.example.rui.daggerstudyapplication.coffee;

/**
 * 加热器接口
 */
public interface Heater {
    void on();//打开
    void off();//关闭
    boolean isHot();//是否已加热
}
