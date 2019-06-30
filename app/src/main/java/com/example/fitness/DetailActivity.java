package com.example.fitness;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView txtExercise = (TextView) findViewById(R.id.exerciseTitle);
        ImageView imgExercise = (ImageView) findViewById(R.id.exerciseImg);
        ConstraintLayout bgMain = (ConstraintLayout) findViewById(R.id.mainBg);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        txtExercise.setText(exerciseTitle);

        if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)) {
            imgExercise.setImageDrawable(getResources().getDrawable(R.drawable.weight,getApplication().getTheme()));
            bgMain.setBackgroundColor(Color.parseColor("#2ca5f5"));

        } else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {
            imgExercise.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplication().getTheme()));
            bgMain.setBackgroundColor(Color.parseColor("#916bcd"));
        } else {
            imgExercise.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplication().getTheme()));
            bgMain.setBackgroundColor(Color.parseColor("#52ad56"));
        }
    }
}
