package com.google.testairplaneencyclopedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MilActivity extends AppCompatActivity {

    Button mil1;
    Button mil2;
    Button mil4;
    Button mil6;
    Button mil8;
    Button mil10;
    Button mil14;
    Button mil17;
    Button mil24;
    Button mil26;
    Button mil28;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mil);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mil1 = (Button) findViewById(R.id.mil1);  mil10 = (Button) findViewById(R.id.mil10);
        mil2 = (Button) findViewById(R.id.mil2);  mil14 = (Button) findViewById(R.id.mil14);
        mil4 = (Button) findViewById(R.id.mil4);  mil17 = (Button) findViewById(R.id.mil17);
        mil6 = (Button) findViewById(R.id.mil6);  mil24 = (Button) findViewById(R.id.mil24);
        mil8 = (Button) findViewById(R.id.mil8);  mil26 = (Button) findViewById(R.id.mil26);
        mil28 = (Button) findViewById(R.id.mil28);

        mil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MilActivity.this,Mil1Activity.class);
                startActivity(intent);
            }
        });


        mil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MilActivity.this,Mil2Activity.class);
                startActivity(intent);
            }
        });


        mil4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MilActivity.this,Mil4Activity.class);
                startActivity(intent);
            }
        });


        mil6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MilActivity.this,Mil6Activity.class);
                startActivity(intent);
            }
        });


        mil8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MilActivity.this,Mil8Activity.class);
                startActivity(intent);
            }
        });


        mil28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MilActivity.this,Mil28Activity.class);
                startActivity(intent);
            }
        });


        mil10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MilActivity.this,Mil10Activity.class);
                startActivity(intent);
            }
        });


        mil14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MilActivity.this,Mil14Activity.class);
                startActivity(intent);
            }
        });


        mil17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MilActivity.this,Mil17Activity.class);
                startActivity(intent);
            }
        });


        mil24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MilActivity.this,Mil24Activity.class);
                startActivity(intent);
            }
        });


        mil26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MilActivity.this,Mil26Activity.class);
                startActivity(intent);
            }
        });

        mil28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MilActivity.this,Mil28Activity.class);
                startActivity(intent);
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
