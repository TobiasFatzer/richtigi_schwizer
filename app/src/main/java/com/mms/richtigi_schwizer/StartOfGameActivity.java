package com.mms.richtigi_schwizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class StartOfGameActivity extends AppCompatActivity {

    Button btn_start;
    Button btn_mix;
    TextView tV_questionText;
    List<String> localQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_of_game);

        btn_start = findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame();
            }
        });
        btn_mix = findViewById(R.id.btn_mix);
        btn_mix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShuffleQuestions();
            }
        });

        tV_questionText = findViewById(R.id.tV_questionText);
        this.localQuestions = Questions.questions;

    }

    private void ShuffleQuestions() {
        Collections.shuffle(this.localQuestions);
    }

    private void startGame() {
        btn_start.clearComposingText();
        btn_start.setText("Weiter");
        int min = 1;
        int max = this.localQuestions.size();
        int index = (int) (Math.random() * (max - min)) + min;
        tV_questionText.clearComposingText();
        tV_questionText.setText(this.localQuestions.get(index));
    }
}