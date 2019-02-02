package com.google.testairplaneencyclopedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CivilAirplanesActivity extends AppCompatActivity {

    Button btn_airbus;
    Button btn_antonov;
    Button btn_boeing;
    Button btn_ilyushin;
    Button btn_topolev;
    Button btn_fokker;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_airplanes);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        btn_airbus = (Button) findViewById(R.id.btn_airbus);
        btn_antonov = (Button) findViewById(R.id.btn_antonov);
        btn_boeing = (Button) findViewById(R.id.btn_boeing);
        btn_ilyushin = (Button) findViewById(R.id.btn_ilyushin);
        btn_topolev = (Button) findViewById(R.id.btn_topolev);
        btn_fokker = (Button) findViewById(R.id.btn_fokker);


        btn_airbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentairbus = new Intent(CivilAirplanesActivity.this, AirbusActivity.class);
                startActivity(intentairbus);
            }
        });


        btn_antonov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentantonov = new Intent(CivilAirplanesActivity.this, AntonovActivity.class);
                startActivity(intentantonov);
            }
        });


        btn_boeing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing = new Intent(CivilAirplanesActivity.this, BoeingActivity.class);
                startActivity(intentboeing);
            }
        });


        btn_fokker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentfokker = new Intent(CivilAirplanesActivity.this, FokkerActivity.class);
                startActivity(intentfokker);
            }
        });


        btn_ilyushin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentilyushin = new Intent(CivilAirplanesActivity.this, IlyushinActivity.class);
                startActivity(intentilyushin);
            }
        });


        btn_topolev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttopolev = new Intent(CivilAirplanesActivity.this, TopolevActivity.class);
                startActivity(intenttopolev);
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
