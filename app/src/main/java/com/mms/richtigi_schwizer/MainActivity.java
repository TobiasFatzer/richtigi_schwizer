package com.mms.richtigi_schwizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button start_game_button;
    Button btn_rules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start_game_button = findViewById(R.id.bt_start_game);
        start_game_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStartGameActivity();
            }
        });
        btn_rules = findViewById(R.id.btn_rules);
        btn_rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRulesActivity();
            }
        });

    }

    private void openRulesActivity() {
        Intent intent = new Intent(this, RulesActivity.class);
        startActivity(intent);
    }

    private void openStartGameActivity() {
        Intent intent = new Intent(this, StartOfGameActivity.class);
        startActivity(intent);
    }
}