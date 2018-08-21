package com.example.rui.daggerstudyapplication.test3;

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
 * <td>2018-08-21 14:59</td>
 * <td>${User}</td>
 * <td>All</td>
 * <td>Created.</td>
 * </tr>
 * </table>
 */
@Component(modules = ChildModule.class,dependencies = FatherComponent.class)
public interface ChildComponent {
    void inject(DependenciesActivity activity);
}
