package com.example.rui.daggerstudyapplication.coffee;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

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
 * <td>2018-08-20 10:46</td>
 * <td>${User}</td>
 * <td>All</td>
 * <td>Created.</td>
 * </tr>
 * </table>
 */
@Module(includes = PumpModule.class)
public class DripCoffeeModule {
    @Provides
    @Singleton
    public Heater providerHeater(){
        return new ElectricHeater();
    }
}
