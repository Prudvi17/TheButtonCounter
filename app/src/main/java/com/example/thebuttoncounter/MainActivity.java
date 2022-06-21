package com.example.thebuttoncounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnTapMe = findViewById(R.id.btnTapMe);
        Button btnReset = findViewById(R.id.btnReset);
        TextView txtTapCounts = findViewById(R.id.txtTapCounts);

        counter = 0;

        btnTapMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = increaseTapCount();
               txtTapCounts.setText(""+count);
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = resetCount();
                txtTapCounts.setText(""+count);
            }
        });
    }

    private int increaseTapCount() {
        counter++;
        return counter;
    }
    private int resetCount() {
        counter = 0;
        return counter;
    }
}