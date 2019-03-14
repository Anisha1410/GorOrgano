package com.example.admin.goorgano;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class VeggieSell extends AppCompatActivity {

    ImageView ivv1; ImageView ivv2; ImageView ivv3; ImageView ivv4;ImageView ivv5;
    ImageView ivv6; ImageView ivv7; ImageView ivv8; ImageView ivv9;ImageView ivv10;
    ImageView ivv11;ImageView ivv12;ImageView ivv13;
    ImageView ivv14; ImageView ivv15; ImageView ivv16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veggie_sell);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ivv1 = (ImageView) findViewById(R.id.iv1); ivv2 = (ImageView) findViewById(R.id.iv2); ivv3 = (ImageView) findViewById(R.id.iv3);
        ivv4 = (ImageView) findViewById(R.id.iv4); ivv5 = (ImageView) findViewById(R.id.iv5); ivv6 = (ImageView) findViewById(R.id.iv6);
        ivv7 = (ImageView) findViewById(R.id.iv7); ivv8 = (ImageView) findViewById(R.id.iv8); ivv9 = (ImageView) findViewById(R.id.iv9);
        ivv12 = (ImageView) findViewById(R.id.iv12); ivv11 = (ImageView) findViewById(R.id.iv11); ivv10 = (ImageView) findViewById(R.id.iv10);
        ivv13 = (ImageView) findViewById(R.id.iv13); ivv14 = (ImageView) findViewById(R.id.iv14);
        ivv15 = (ImageView) findViewById(R.id.iv15); ivv16 = (ImageView) findViewById(R.id.iv16);

        ivv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });
        ivv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VeggieSell.this, Quantity.class));
            }
        });


    }
}
