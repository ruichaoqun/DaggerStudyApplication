package com.example.rui.daggerstudyapplication.di;

import android.app.Application;

import com.example.rui.daggerstudyapplication.TodoApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author Rui Chaoqun
 * @date :2019/11/27 17:41
 * description:
 */
@Singleton
@Component(modules = {ApplicationModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<TodoApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}
