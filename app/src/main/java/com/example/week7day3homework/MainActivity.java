package com.example.week7day3homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.ContentViewEvent;

public class MainActivity extends AppCompatActivity {
    CustomLayout customLayout;
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvAnswer = findViewById(R.id.tvAnswer);

        customLayout = findViewById(R.id.lytCustomLayout);

        Animation questionAnimation = AnimationUtils.loadAnimation(this, R.anim.pivot);
        tvAnswer.startAnimation(questionAnimation);
    }

    public void onClick(View view) {

        startActivity(new Intent(this, SecondActivity.class));
        overridePendingTransition(R.anim.fadeout, R.anim.fadeout);

        Answers.getInstance().logContentView(new ContentViewEvent().putContentName("Tweet");
    }
}
