package com.example.fitness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXERCISE_WEIGHTS = "Weight";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout btnWeight = (RelativeLayout) findViewById(R.id.btnWeight);
        RelativeLayout btnYoga   = (RelativeLayout) findViewById(R.id.btnYoga);
        RelativeLayout btnCardio = (RelativeLayout) findViewById(R.id.btnCardio);

        btnWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(EXERCISE_WEIGHTS);
            }
        });

        btnYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(EXERCISE_YOGA);
            }
        });

        btnCardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(EXERCISE_CARDIO);
            }
        });

    }

    private void loadDetailActivity(String exerciseTitle) {

    }
}
