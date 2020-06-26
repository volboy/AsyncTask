package com.example.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int[] integers = null;
    int clicks = 0;
    ProgressBar indicatorBar;
    TextView statusView;
    TextView clicksView;
    Button progressBtn;
    Button clicksBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clicksView = findViewById(R.id.clicksView);
        clicksBtn = findViewById(R.id.clicksBtn);
        clicksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                clicksView.setText("Clicks: " + clicks);
            }
        });
    }
}

