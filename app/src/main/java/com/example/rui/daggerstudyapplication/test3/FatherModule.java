package com.example.rui.daggerstudyapplication.test3;

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
 * <td>2018-08-21 14:55</td>
 * <td>${User}</td>
 * <td>All</td>
 * <td>Created.</td>
 * </tr>
 * </table>
 */
@Module
public class FatherModule {
    @Provides
    public Father provideFather(){
        return new Father();
    }
}
