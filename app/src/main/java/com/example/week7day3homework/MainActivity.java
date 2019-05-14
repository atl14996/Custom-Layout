package com.example.week7day3homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    CustomLayout customLayout;
    TextView tvAnswer;
    Button btnNewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvAnswer = findViewById(R.id.tvAnswer);
        btnNewActivity = findViewById(R.id.btnNewActivity);

        customLayout = findViewById(R.id.lytCustomLayout);

        Animation questionAnimation = AnimationUtils.loadAnimation(this, R.anim.pivot);
        tvAnswer.startAnimation(questionAnimation);
    }

    public void onClick(View view) {

        startActivity(new Intent(this, SecondActivity.class));
        overridePendingTransition(R.anim.fadeout, R.anim.fadeout);


    }
}

