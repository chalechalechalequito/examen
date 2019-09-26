package com.ejemplo.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class examen1erparcial extends AppCompatActivity {

    TextView alfa;
    SeekBar barra;
    View colorview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        alfa = findViewById(R.id.alfa1);
        barra = findViewById(R.id.barra1);
        colorview = findViewById(R.id.color);

        barra.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                alfa.setText("alpha: " + String.valueOf(progress) + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen1erparcial);
    }
}
