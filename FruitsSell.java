package com.example.admin.goorgano;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class FruitsSell extends AppCompatActivity {

    ImageView i1; ImageView i2; ImageView i3; ImageView i4;ImageView i5;
    ImageView i6; ImageView i7; ImageView i8; ImageView i9;ImageView i10;
    ImageView i11;ImageView i13;
    ImageView i14; ImageView i15; ImageView i16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits_sell);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        i1 = (ImageView) findViewById(R.id.if1); i2 = (ImageView) findViewById(R.id.if2); i3 = (ImageView) findViewById(R.id.if3);
        i4 = (ImageView) findViewById(R.id.if4); i5 = (ImageView) findViewById(R.id.if5); i6 = (ImageView) findViewById(R.id.if6);
        i7 = (ImageView) findViewById(R.id.if7); i8 = (ImageView) findViewById(R.id.if8); i9 = (ImageView) findViewById(R.id.if9);
        i11 = (ImageView) findViewById(R.id.if11); i10 = (ImageView) findViewById(R.id.if10);
        i13 = (ImageView) findViewById(R.id.if13); i14 = (ImageView) findViewById(R.id.if14);
        i15 = (ImageView) findViewById(R.id.if15); i16 = (ImageView) findViewById(R.id.if16);


        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });

        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });

        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });

        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });

        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });

        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });


        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });

        i14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });

        i15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });
        i16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsSell.this, Quantity.class));
            }
        });


    }
}
