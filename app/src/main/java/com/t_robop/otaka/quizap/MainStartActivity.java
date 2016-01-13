package com.t_robop.otaka.quizap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainStartActivity extends AppCompatActivity {

    TextView tvstart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_main);
        tvstart = (TextView) findViewById(R.id.Quizapp);;
    }

    public void buttonstart (View view){
        Intent intent = new Intent();   //QuizActivityに変遷
        intent.setClass(this,QuizActivity.class);

        startActivity(intent);


    }
}
