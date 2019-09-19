package com.example.repaso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.ColorUtils;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String colorHex = "#FFFFFF";
      View colorSample;
    private SeekBar gColor,bColor,rColor;
    private TextView hexColor;

    @Override
      protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorSample = findViewById(R.id.colorSample);
        colorSample.setBackgroundColor(Color.parseColor(colorHex));

         rColor = findViewById(R.id.rColor);
         gColor = findViewById(R.id.gColor);
         bColor = findViewById(R.id.bColor);

         hexColor = findViewById(R.id.hexColor);

        this.rColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                String Hex = "#"+
                        color2.decimalToHex(rColor.getProgress()) +
                        color2.decimalToHex(gColor.getProgress()) +
                        color2.decimalToHex(bColor.getProgress()) ;

                         hexColor.setText(Hex);
                         colorSample.setBackgroundColor(Color.parseColor(Hex));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        this.gColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                String Hex = "#"+
                        color2.decimalToHex(rColor.getProgress()) +
                        color2.decimalToHex(gColor.getProgress()) +
                        color2.decimalToHex(bColor.getProgress()) ;

                hexColor.setText(Hex);
                colorSample.setBackgroundColor(Color.parseColor(Hex));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        this.bColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                String Hex = "#"+
                        color2.decimalToHex(rColor.getProgress()) +
                        color2.decimalToHex(gColor.getProgress()) +
                        color2.decimalToHex(bColor.getProgress()) ;

                hexColor.setText(Hex);
                colorSample.setBackgroundColor(Color.parseColor(Hex));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        this.rColor.setMax(255);
        this.gColor.setMax(255);
        this.bColor.setMax(255);


    }




    }

