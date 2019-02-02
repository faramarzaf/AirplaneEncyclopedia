package com.google.testairplaneencyclopedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CarriageAirplanesActivity extends AppCompatActivity {

    Button c_130;
    Button c_130j;
    Button c_5;
    Button c_12;
    Button c_17;
    Button c_26;
    Button c_144;
    Button c_146;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carriage_airplanes);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        c_130 = (Button) findViewById(R.id.c_130);
        c_130j = (Button) findViewById(R.id.c_130j);
        c_5 = (Button) findViewById(R.id.c_5);
        c_12 = (Button) findViewById(R.id.c_12);
        c_17 = (Button) findViewById(R.id.c_17);
        c_26 = (Button) findViewById(R.id.c_26);
        c_144 = (Button) findViewById(R.id.c_144);
        c_146 = (Button) findViewById(R.id.c_146);

        c_130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc130 = new Intent(CarriageAirplanesActivity.this, C130Activity.class);
                startActivity(intentc130);
            }
        });


        c_130j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc130j = new Intent(CarriageAirplanesActivity.this, C130jActivity.class);
                startActivity(intentc130j);
            }
        });


        c_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc5 = new Intent(CarriageAirplanesActivity.this, C5Activity.class);
                startActivity(intentc5);
            }
        });


        c_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc12 = new Intent(CarriageAirplanesActivity.this, C12Activity.class);
                startActivity(intentc12);
            }
        });


        c_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc17 = new Intent(CarriageAirplanesActivity.this, C17Activity.class);
                startActivity(intentc17);
            }
        });


        c_26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc26 = new Intent(CarriageAirplanesActivity.this, C26Activity.class);
                startActivity(intentc26);
            }
        });


        c_144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc144 = new Intent(CarriageAirplanesActivity.this, C144Activity.class);
                startActivity(intentc144);
            }
        });


        c_146.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc146 = new Intent(CarriageAirplanesActivity.this, C146Activity.class);
                startActivity(intentc146);
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }


}

