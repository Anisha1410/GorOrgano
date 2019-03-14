package com.example.admin.goorgano;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Buy extends AppCompatActivity {

    ImageButton imbby1;
    ImageButton imbby2;
    ImageButton imbby3;
    ImageButton imbby4;
    ImageButton imbby5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        imbby1 = (ImageButton) findViewById(R.id.imbuy1);
        imbby2 = (ImageButton) findViewById(R.id.imbuy2);
        imbby3 = (ImageButton) findViewById(R.id.imbuy3);
        imbby4 = (ImageButton) findViewById(R.id.imbuy4);
        imbby5 = (ImageButton) findViewById(R.id.imbuy5);

        imbby1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Buy.this, Buyoption.class));
            }
        });
        imbby2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Buy.this, Buyoption.class));
            }
        });
        imbby3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Buy.this, Buyoption.class));
            }
        });
        imbby4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Buy.this, Buyoption.class));
            }
        });
        imbby5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Buy.this, Buyoption.class));
            }
        });


    }
}
