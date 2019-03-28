package com.example.week7day3homework;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomLayout extends LinearLayout implements View.OnClickListener {
    EditText etQuestion;
    EditText etAnswer;
    Button btnSubmit;
    TextView tvQuestion;
    TextView tvAnswer;


    public CustomLayout(Context context) {
        this(context, null);
    }

    public CustomLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        inflate(getContext(), R.layout.custom_layout, this);
        etQuestion = findViewById(R.id.etEnterQuestion);
        etAnswer = findViewById(R.id.etEnterAnswer);
        tvQuestion = findViewById(R.id.tvQuestion);
        tvAnswer = findViewById(R.id.tvAnswer);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnSubmit:
                tvAnswer.setText(etAnswer.getText().toString());
                tvQuestion.setText(etQuestion.getText().toString());
                break;

        }

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }
}
