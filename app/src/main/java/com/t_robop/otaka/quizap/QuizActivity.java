package com.t_robop.otaka.quizap;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
TextView tvQ,tvA,tvB,tvC,tvD;
    int clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
             tvQ =  (TextView) findViewById(R.id.Qtext);
                tvA=   (TextView) findViewById(R.id.Aanswer);
                tvB=  (TextView) findViewById(R.id.Banswer);
                tvC=  (TextView) findViewById(R.id.Canswer);
                tvD=  (TextView) findViewById(R.id.Danswer);
            }
        });
    }

    public void Abutton(View view){//正解
        clear=1;
        if(clear==0){
            tvA.setText("不正解");
        }else{
            tvA.setText("正解");
        }

    }
    public void Bbutton(View view){
        if(clear==0){
            tvA.setText("不正解");
        }else{
            tvA.setText("正解");
        }

    }
    public void Cbutton(View view){
        if(clear==0){
            tvA.setText("不正解");
        }else{
            tvA.setText("正解");
        }

    }
    public void Dbutton(View view){
        if(clear==0){
            tvA.setText("不正解");
        }else{
            tvA.setText("正解");
        }

    }

}
