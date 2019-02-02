package com.google.testairplaneencyclopedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HelicoptersActivity extends AppCompatActivity {

    Button btn_bell;
    Button btn_kamov;
    Button btn_mil;
    Button btn_eurocopter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helicopters);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        btn_bell = (Button) findViewById(R.id.btn_bell);
        btn_kamov = (Button) findViewById(R.id.btn_kamov);
        btn_mil = (Button) findViewById(R.id.btn_mil);
        btn_eurocopter = (Button) findViewById(R.id.btn_eurocopter);


        btn_bell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbell = new Intent(HelicoptersActivity.this,BellActivity.class);
                startActivity(intentbell);
            }
        });


        btn_kamov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentkamov = new Intent(HelicoptersActivity.this,KamovActivity.class);
                startActivity(intentkamov);
            }
        });

        btn_mil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmil = new Intent(HelicoptersActivity.this,MilActivity.class);
                startActivity(intentmil);
            }
        });


        btn_eurocopter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenteurocopter = new Intent(HelicoptersActivity.this,EurocopterActivity.class);
                startActivity(intenteurocopter);
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
