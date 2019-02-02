package com.google.testairplaneencyclopedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FokkerActivity extends AppCompatActivity {

    Button btn_fokker25;
    Button btn_fokker27;
    Button btn_fokker28;
    Button btn_fokker50;
    Button btn_fokker70;
    Button btn_fokker100;
    Button btn_fokkerS13;
    Button btn_fokkerS14;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fokker);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        btn_fokker25 = (Button) findViewById(R.id.btn_fokker25);
        btn_fokker27 = (Button) findViewById(R.id.btn_fokker27);
        btn_fokker28 = (Button) findViewById(R.id.btn_fokker28);
        btn_fokker50 = (Button) findViewById(R.id.btn_fokker50);
        btn_fokker70 = (Button) findViewById(R.id.btn_fokker70);
        btn_fokker100 = (Button) findViewById(R.id.btn_fokker100);
        btn_fokkerS13 = (Button) findViewById(R.id.btn_fokkerS13);
        btn_fokkerS14 = (Button) findViewById(R.id.btn_fokkerS14);


        btn_fokker25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentfokker25 = new Intent(FokkerActivity.this, Fokker25Activity.class);
                startActivity(intentfokker25);
            }
        });


        btn_fokker27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentfokker27 = new Intent(FokkerActivity.this, Fokker27Activity.class);
                startActivity(intentfokker27);
            }
        });


        btn_fokker28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentfokker28 = new Intent(FokkerActivity.this, Fokker28Activity.class);
                startActivity(intentfokker28);
            }
        });


        btn_fokker50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentfokker50 = new Intent(FokkerActivity.this, Fokker50Activity.class);
                startActivity(intentfokker50);
            }
        });


        btn_fokker70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentfokker70 = new Intent(FokkerActivity.this, Fokker70Activity.class);
                startActivity(intentfokker70);
            }
        });


        btn_fokker100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentfokker100 = new Intent(FokkerActivity.this, Fokker100Activity.class);
                startActivity(intentfokker100);
            }
        });


        btn_fokkerS13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentfokkers13 = new Intent(FokkerActivity.this, FokkerS13Activity.class);
                startActivity(intentfokkers13);
            }
        });


        btn_fokkerS14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentfokkers14 = new Intent(FokkerActivity.this, FokkerS14Activity.class);
                startActivity(intentfokkers14);
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
