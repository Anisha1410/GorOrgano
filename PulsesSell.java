package com.example.admin.goorgano;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class PulsesSell extends AppCompatActivity {

    ImageView ipp1; ImageView ipp2; ImageView ipp3; ImageView ipp4;ImageView ipp5;
    ImageView ipp6; ImageView ipp7; ImageView ipp8; ImageView ipp9;ImageView ipp10;
    ImageView ipp11;ImageView ipp12;ImageView ipp13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulses_sell);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ipp1 = (ImageView) findViewById(R.id.ip1); ipp2 = (ImageView) findViewById(R.id.ip2); ipp3 = (ImageView) findViewById(R.id.ip3);
        ipp4 = (ImageView) findViewById(R.id.ip4); ipp5 = (ImageView) findViewById(R.id.ip5); ipp6 = (ImageView) findViewById(R.id.ip6);
        ipp7 = (ImageView) findViewById(R.id.ip7); ipp8 = (ImageView) findViewById(R.id.ip8); ipp9 = (ImageView) findViewById(R.id.ip9);
        ipp12 = (ImageView) findViewById(R.id.ip12); ipp11 = (ImageView) findViewById(R.id.ip11);
        ipp10 = (ImageView) findViewById(R.id.ip10); ipp13 = (ImageView) findViewById(R.id.ip13);

        ipp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PulsesSell.this, Quantity.class));
            }
        });
        ipp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PulsesSell.this, Quantity.class));
            }
        });
        ipp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PulsesSell.this, Quantity.class));
            }
        });
        ipp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PulsesSell.this, Quantity.class));
            }
        });
        ipp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PulsesSell.this, Quantity.class));
            }
        });
        ipp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PulsesSell.this, Quantity.class));
            }
        });
        ipp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PulsesSell.this, Quantity.class));
            }
        });
        ipp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PulsesSell.this, Quantity.class));
            }
        });
        ipp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PulsesSell.this, Quantity.class));
            }
        });
        ipp10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PulsesSell.this, Quantity.class));
            }
        });
        ipp11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PulsesSell.this, Quantity.class));
            }
        });
        ipp12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PulsesSell.this, Quantity.class));
            }
        });
        ipp13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PulsesSell.this, Quantity.class));
            }
        });

    }
}
