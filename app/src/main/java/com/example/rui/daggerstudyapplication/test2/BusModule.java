package com.example.rui.daggerstudyapplication.test2;

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
 * <td>2018-08-21 09:25</td>
 * <td>${User}</td>
 * <td>All</td>
 * <td>Created.</td>
 * </tr>
 * </table>
 */
@Module
public class BusModule {
    private String driver;

    public BusModule(String driver) {
        this.driver = driver;
    }

    @Provides
    public String provideDriver(){
        return driver;
    }

    @Sign
    @Provides
    public Bus providerBus(){
        return new Bus(driver);
    }

    @Sign("zhangsan")
    @Provides
    public Bus providerBus1(){
        return new Bus("zhangsan");
    }
}
