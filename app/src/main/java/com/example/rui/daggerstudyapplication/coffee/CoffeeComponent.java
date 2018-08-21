package com.example.rui.daggerstudyapplication.coffee;

import com.example.rui.daggerstudyapplication.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

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
 * <td>2018-08-20 14:29</td>
 * <td>${User}</td>
 * <td>All</td>
 * <td>Created.</td>
 * </tr>
 * </table>
 */
@Singleton
@Component(modules = {DripCoffeeModule.class})
public interface CoffeeComponent {
    MainActivity inject(MainActivity mainActivity);
}
