package com.example.rui.daggerstudyapplication.subcomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rui.daggerstudyapplication.R;

import javax.inject.Inject;

public class SubComponentActivity extends AppCompatActivity {
    @Inject
    Child child;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_component);
        DaggerFatherComponent.builder().build().buildeChildComponent().build().inject(this);
    }
}
