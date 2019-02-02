package com.google.testairplaneencyclopedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AntonovActivity extends AppCompatActivity {


    Button A40;
    Button An24;
    Button An132;
    Button An2;
    Button An26;
    Button An140;
    Button An3;
    Button An28;
    Button An148;
    Button An30;
    Button An158;
    Button An32;
    Button An8;
    Button An38;
    Button An10;
    Button An50;
    Button An178;
    Button An11;
    Button An70;
    Button An12;
    Button An71;
    Button An13;
    Button An72;
    Button An14;
    Button An74;
    Button An22;
    Button An124;
    Button An225;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antonov);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        A40 = (Button) findViewById(R.id.A40);
        An124 = (Button) findViewById(R.id.An124);
        An2 = (Button) findViewById(R.id.An2);
        An132 = (Button) findViewById(R.id.An132);
        An3 = (Button) findViewById(R.id.An3);
        An140 = (Button) findViewById(R.id.An140);
        An148 = (Button) findViewById(R.id.An148);
        An158 = (Button) findViewById(R.id.An158);
        An8 = (Button) findViewById(R.id.An8);
        An10 = (Button) findViewById(R.id.An10);
        An11 = (Button) findViewById(R.id.An11);
        An178 = (Button) findViewById(R.id.An178);
        An12 = (Button) findViewById(R.id.An12);
        An13 = (Button) findViewById(R.id.An13);
        An14 = (Button) findViewById(R.id.An14);
        An22 = (Button) findViewById(R.id.An22);
        An24 = (Button) findViewById(R.id.An24);
        An225 = (Button) findViewById(R.id.An225);
        An26 = (Button) findViewById(R.id.An26);
        An28 = (Button) findViewById(R.id.An28);
        An30 = (Button) findViewById(R.id.An30);
        An32 = (Button) findViewById(R.id.An32);
        An38 = (Button) findViewById(R.id.An38);
        An50 = (Button) findViewById(R.id.An50);
        An70 = (Button) findViewById(R.id.An70);
        An71 = (Button) findViewById(R.id.An71);
        An72 = (Button) findViewById(R.id.An72);
        An74 = (Button) findViewById(R.id.An74);


        A40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta40 = new Intent(AntonovActivity.this, A40Activity.class);
                startActivity(intenta40);

            }
        });


        An2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan2 = new Intent(AntonovActivity.this, An2Activity.class);
                startActivity(intentan2);
            }
        });


        An3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan3 = new Intent(AntonovActivity.this, An3Activity.class);
                startActivity(intentan3);
            }
        });


        An8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan8 = new Intent(AntonovActivity.this, An8Activity.class);
                startActivity(intentan8);
            }
        });


        An10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan10 = new Intent(AntonovActivity.this, An10Activity.class);
                startActivity(intentan10);
            }
        });


        An11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan11 = new Intent(AntonovActivity.this, An11Activity.class);
                startActivity(intentan11);
            }
        });


        An12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan12 = new Intent(AntonovActivity.this, An12Activity.class);
                startActivity(intentan12);
            }
        });


        An13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan13 = new Intent(AntonovActivity.this, An13Activity.class);
                startActivity(intentan13);
            }
        });


        An14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan14 = new Intent(AntonovActivity.this, An14Activity.class);
                startActivity(intentan14);
            }
        });


        An22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan22 = new Intent(AntonovActivity.this, An22Activity.class);
                startActivity(intentan22);
            }
        });


        An24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan24 = new Intent(AntonovActivity.this, An24Activity.class);
                startActivity(intentan24);
            }
        });


        An26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan26 = new Intent(AntonovActivity.this, An26Activity.class);
                startActivity(intentan26);
            }
        });


        An28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan28 = new Intent(AntonovActivity.this, An28Activity.class);
                startActivity(intentan28);
            }
        });


        An30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan30 = new Intent(AntonovActivity.this, An30Activity.class);
                startActivity(intentan30);
            }
        });


        An32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan32 = new Intent(AntonovActivity.this, An32Activity.class);
                startActivity(intentan32);
            }
        });


        An38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan38 = new Intent(AntonovActivity.this, An38Activity.class);
                startActivity(intentan38);
            }
        });


        An50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan50 = new Intent(AntonovActivity.this, An50Activity.class);
                startActivity(intentan50);
            }
        });

        An70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan70 = new Intent(AntonovActivity.this, An70Activity.class);
                startActivity(intentan70);
            }
        });


        An71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan71 = new Intent(AntonovActivity.this, An71Activity.class);
                startActivity(intentan71);
            }
        });


        An72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan72 = new Intent(AntonovActivity.this, An72Activity.class);
                startActivity(intentan72);
            }
        });


        An74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan74 = new Intent(AntonovActivity.this, An74Activity.class);
                startActivity(intentan74);
            }
        });


        An124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan124 = new Intent(AntonovActivity.this, An124Activity.class);
                startActivity(intentan124);
            }
        });


        An132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan132 = new Intent(AntonovActivity.this, An132Activity.class);
                startActivity(intentan132);
            }
        });


        An140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan140 = new Intent(AntonovActivity.this, An140Activity.class);
                startActivity(intentan140);
            }
        });


        An148.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan148 = new Intent(AntonovActivity.this, An148Activity.class);
                startActivity(intentan148);
            }
        });


        An158.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan158 = new Intent(AntonovActivity.this, An158Activity.class);
                startActivity(intentan158);
            }
        });


        An178.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan178 = new Intent(AntonovActivity.this, An178Activity.class);
                startActivity(intentan178);
            }
        });



        An225.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentan225 = new Intent(AntonovActivity.this, An225Activity.class);
                startActivity(intentan225);
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