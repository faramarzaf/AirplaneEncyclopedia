package com.google.testairplaneencyclopedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class KamovActivity extends AppCompatActivity {

    Button ka20;
    Button ka37;
    Button ka25;

    Button ka27;
    Button ka115;
    Button ka31;

    Button ka35;
    Button ka226;
    Button ka40;
    Button ka50;
    Button ka60;
    Button ka18;
    Button ka26;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamov);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        ka20 = (Button) findViewById(R.id.ka20);
        ka26 = (Button) findViewById(R.id.ka26);
        ka25 = (Button) findViewById(R.id.ka25);
        ka37 = (Button) findViewById(R.id.ka37);
        ka27 = (Button) findViewById(R.id.ka27);
        ka31 = (Button) findViewById(R.id.ka31);
        ka35 = (Button) findViewById(R.id.ka35);
        ka226 = (Button) findViewById(R.id.ka226);
        ka40 = (Button) findViewById(R.id.ka40);
        ka50 = (Button) findViewById(R.id.ka50);
        ka60 = (Button) findViewById(R.id.ka60);
        ka18 = (Button) findViewById(R.id.ka18);
        ka115 = (Button) findViewById(R.id.ka115);

        ka20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KamovActivity.this, Kamov20Activity.class);
                startActivity(intent);
            }
        });


        ka25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KamovActivity.this, Kamov25Activity.class);
                startActivity(intent);
            }
        });


        ka27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KamovActivity.this, Kamov27Activity.class);
                startActivity(intent);
            }
        });


        ka31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KamovActivity.this, Kamov31Activity.class);
                startActivity(intent);
            }
        });


        ka35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KamovActivity.this, Kamov35Activity.class);
                startActivity(intent);
            }
        });


        ka40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KamovActivity.this, Kamov40Activity.class);
                startActivity(intent);
            }
        });


        ka50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KamovActivity.this, Kamov50Activity.class);
                startActivity(intent);
            }
        });


        ka60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KamovActivity.this, Kamov60Activity.class);
                startActivity(intent);
            }
        });


        ka18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KamovActivity.this, Kamov18Activity.class);
                startActivity(intent);
            }
        });


        ka26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KamovActivity.this, Kamov26Activity.class);
                startActivity(intent);
            }
        });


        ka37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KamovActivity.this, Kamov37Activity.class);
                startActivity(intent);
            }
        });



        ka226.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KamovActivity.this, Kamov226Activity.class);
                startActivity(intent);
            }
        });

        ka115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KamovActivity.this, Kamov115Activity.class);
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
