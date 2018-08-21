
package com.example.rui.daggerstudyapplication.test3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rui.daggerstudyapplication.R;

import javax.inject.Inject;

public class DependenciesActivity extends AppCompatActivity {
    @Inject
    Child child;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependencies);
        FatherComponent component = DaggerFatherComponent.create();
        DaggerChildComponent.builder().fatherComponent(component).build().inject(this);
        System.out.println("child = [" + child.toString() + "]");
        System.out.println("father = [" + child.getFather().toString() + "]");

        DaggerChildComponent.builder().fatherComponent(component).build().inject(this);
        System.out.println("child = [" + child.toString() + "]");
        System.out.println("father = [" + child.getFather().toString() + "]");
    }
}
