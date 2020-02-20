package com.example.teamsscorecounterexplicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class WinnerActivity extends AppCompatActivity {

    public static final String TAG = "WinnerActivity";
    public TextView winner_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        Log.d(TAG, "inside of onCreate method of WinnerActivity");

        winner_result = (TextView) findViewById(R.id.winner_result);
        Intent intent = getIntent();
        String winner = intent.getStringExtra(MainActivity.RESULT);
        winner_result.setText(winner);

    }
}
