package com.google.testairplaneencyclopedia.civil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.testairplaneencyclopedia.R;

public class AirbusActivity extends AppCompatActivity {

    Button A300;
    Button A310;
    Button A318;
    Button A319;
    Button A320;
    Button A321;
    Button A330;
    Button A340;
    Button A350;
    Button A380;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airbus);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        A300 = (Button) findViewById(R.id.A300);
        A310 = (Button) findViewById(R.id.A310);
        A318 = (Button) findViewById(R.id.A318);
        A319 = (Button) findViewById(R.id.A319);
        A320 = (Button) findViewById(R.id.A320);
        A321 = (Button) findViewById(R.id.A321);
        A330 = (Button) findViewById(R.id.A330);
        A340 = (Button) findViewById(R.id.A340);
        A350 = (Button) findViewById(R.id.A350);
        A380 = (Button) findViewById(R.id.A380);


        A300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta300 = new Intent(AirbusActivity.this, A300Activity.class);
                startActivity(intenta300);
            }
        });


        A310.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta310 = new Intent(AirbusActivity.this, A310Activity.class);
                startActivity(intenta310);
            }
        });


        A318.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta318 = new Intent(AirbusActivity.this, A318Activity.class);
                startActivity(intenta318);
            }
        });


        A319.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta319 = new Intent(AirbusActivity.this, A319Activity.class);
                startActivity(intenta319);
            }
        });


        A320.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta320 = new Intent(AirbusActivity.this, A320Activity.class);
                startActivity(intenta320);
            }
        });


        A321.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta321 = new Intent(AirbusActivity.this, A321Activity.class);
                startActivity(intenta321);
            }
        });


        A330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta330 = new Intent(AirbusActivity.this, A330Activity.class);
                startActivity(intenta330);
            }
        });


        A340.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta340 = new Intent(AirbusActivity.this, A340Activity.class);
                startActivity(intenta340);
            }
        });


        A350.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta350 = new Intent(AirbusActivity.this, A350Activity.class);
                startActivity(intenta350);
            }
        });


        A380.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta380 = new Intent(AirbusActivity.this, A380Activity.class);
                startActivity(intenta380);
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
