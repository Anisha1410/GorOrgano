package com.example.admin.goorgano;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Sell extends AppCompatActivity {

    ImageButton imbb1;
    ImageButton imbb2;
    ImageButton imbb3;
    ImageButton imbb4;
    ImageButton imbb5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);

        imbb1 = (ImageButton) findViewById(R.id.imB1);
        imbb2 = (ImageButton) findViewById(R.id.imageButton2);
        imbb3 = (ImageButton) findViewById(R.id.imageButton3);
        imbb4 = (ImageButton) findViewById(R.id.imageButton4);
        imbb5 = (ImageButton) findViewById(R.id.imageButton5);

        imbb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sell.this, FruitsSell.class));
            }
        });
        imbb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sell.this, VeggieSell.class));
            }
        });
        imbb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sell.this, PulsesSell.class));
            }
        });
        imbb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sell.this, SpicesSell.class));
            }
        });
        imbb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sell.this, GrainsSell.class));
            }
        });




    }
}
