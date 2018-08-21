package com.example.rui.daggerstudyapplication.subcomponent;

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
 * <td>2018-08-21 16:51</td>
 * <td>${User}</td>
 * <td>All</td>
 * <td>Created.</td>
 * </tr>
 * </table>
 */
@Component(modules = FatherModule.class)
public interface FatherComponent {
    ChildComponent.Builder buildeChildComponent();
}
