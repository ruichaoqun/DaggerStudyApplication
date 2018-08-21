package com.example.rui.daggerstudyapplication.subcomponent;

import dagger.Component;
import dagger.Subcomponent;

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
 * <td>2018-08-21 16:05</td>
 * <td>${User}</td>
 * <td>All</td>
 * <td>Created.</td>
 * </tr>
 * </table>
 */
@Subcomponent(modules = ChildModule.class)
public interface ChildComponent {
    void inject(SubComponentActivity activity);

    @Subcomponent.Builder
    interface Builder{
        ChildComponent build();
    }
}
