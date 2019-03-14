package com.example.admin.goorgano;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class GrainsSell extends AppCompatActivity {

    ImageView igg1; ImageView igg2; ImageView igg3; ImageView igg4;
    ImageView igg5; ImageView igg6; ImageView igg7; ImageView igg8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grains_sell);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        igg1 = (ImageView) findViewById(R.id.ig1); igg2 = (ImageView) findViewById(R.id.ig2); igg3 = (ImageView) findViewById(R.id.ig3);
        igg4 = (ImageView) findViewById(R.id.ig4); igg5 = (ImageView) findViewById(R.id.ig5); igg6 = (ImageView) findViewById(R.id.ig6);
        igg7 = (ImageView) findViewById(R.id.ig7); igg8 = (ImageView) findViewById(R.id.ig8);

        igg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GrainsSell.this, Quantity.class));
            }
        });
        igg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GrainsSell.this, Quantity.class));
            }
        });
        igg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GrainsSell.this, Quantity.class));
            }
        });
        igg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GrainsSell.this, Quantity.class));
            }
        });
        igg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GrainsSell.this, Quantity.class));
            }
        });
        igg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GrainsSell.this, Quantity.class));
            }
        });
        igg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GrainsSell.this, Quantity.class));
            }
        });
        igg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GrainsSell.this, Quantity.class));
            }
        });

    }
}
