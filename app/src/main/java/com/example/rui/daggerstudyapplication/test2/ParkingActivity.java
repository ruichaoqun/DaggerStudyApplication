package com.example.rui.daggerstudyapplication.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rui.daggerstudyapplication.R;

import javax.inject.Inject;

public class ParkingActivity extends AppCompatActivity {
    @Sign("zhangsan")
    @Inject
    Bus bus;

    @Sign
    @Inject
    Bus bus1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);
        DaggerParkingComponent.builder().busModule(new BusModule("lisi")).build().inject(this);
        bus.run();
        bus1.run();
    }
}
