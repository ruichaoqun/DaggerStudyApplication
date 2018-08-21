package com.example.rui.daggerstudyapplication.coffee;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * <p>Description.</p>
 * <p>
 * <b>Maintenance History</b>:
 * <table>
 * <tr>
 * <th>Date</th>
 * <th>Developer</th>
 * <th>Target</th>
 * <th>Content</th>
 * </tr>
 * <tr>
 * <td>2018-08-20 10:37</td>
 * <td>${User}</td>
 * <td>All</td>
 * <td>Created.</td>
 * </tr>
 * </table>
 */
public class CoffeeMaker {
    private final Lazy<Heater> heater;
    private final Pump pump;

    @Inject
    public CoffeeMaker(Lazy<Heater> heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew(){
        heater.get().on();//开始加热
        pump.pump();
        System.out.println("上咖啡了！");
        heater.get().off();
    }
}
