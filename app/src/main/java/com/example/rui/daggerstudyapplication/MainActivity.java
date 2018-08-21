package com.example.rui.daggerstudyapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rui.daggerstudyapplication.coffee.CoffeeMaker;
import com.example.rui.daggerstudyapplication.coffee.DaggerCoffeeComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    CoffeeMaker maker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerCoffeeComponent.builder().build().inject(this);
        maker.brew();
    }
}
