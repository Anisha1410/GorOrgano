package com.example.admin.goorgano;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class SpicesSell extends AppCompatActivity {

    ImageView iss1; ImageView iss2; ImageView iss3; ImageView iss4;ImageView iss5;
    ImageView iss6; ImageView iss7; ImageView iss8 ;ImageView iss10; ImageView iss12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spices_sell);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        iss1 = (ImageView) findViewById(R.id.iv1); iss2 = (ImageView) findViewById(R.id.iv2); iss3 = (ImageView) findViewById(R.id.iv3);
        iss4 = (ImageView) findViewById(R.id.iv4); iss5 = (ImageView) findViewById(R.id.iv5); iss6 = (ImageView) findViewById(R.id.iv6);
        iss7 = (ImageView) findViewById(R.id.iv7); iss8 = (ImageView) findViewById(R.id.iv8);
        iss12 = (ImageView) findViewById(R.id.iv12);  iss10 = (ImageView) findViewById(R.id.iv10);

        iss1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpicesSell.this, Quantity.class));
            }
        });
        iss2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpicesSell.this, Quantity.class));
            }
        });
        iss3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpicesSell.this, Quantity.class));
            }
        });
        iss4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpicesSell.this, Quantity.class));
            }
        });
        iss5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpicesSell.this, Quantity.class));
            }
        });
        iss6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpicesSell.this, Quantity.class));
            }
        });
        iss7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpicesSell.this, Quantity.class));
            }
        });
        iss8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpicesSell.this, Quantity.class));
            }
        });

        iss10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpicesSell.this, Quantity.class));
            }
        });
        iss12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpicesSell.this, Quantity.class));
            }
        });
    }
}
