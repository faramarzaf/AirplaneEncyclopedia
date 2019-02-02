package com.google.testairplaneencyclopedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class IlyushinActivity extends AppCompatActivity {

    Button Il22;
    Button Il28;
    Button Il14;
    Button Il2;
    Button Il30;
    Button Il18;
    Button Il181946;
    Button Il10;
    Button Il54;
    Button Il62;
    Button Il16;
    Button Il12;
    Button Il86;
    Button Il96;
    Button Il40;
    Button Il32;
    Button Il102;
    Button Il76;
    Button Il114;
    Button DB3;
    Button Il78;
    Button Il103;
    Button Il80;
    Button Il6;
    Button Il112;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilyushin);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }



        Il102 = (Button) findViewById(R.id.Il102);

        DB3 = (Button) findViewById(R.id.DB3);
        Il2 = (Button) findViewById(R.id.Il2);
        Il10 = (Button) findViewById(R.id.Il10);
        Il6 = (Button) findViewById(R.id.Il6);
        Il16 = (Button) findViewById(R.id.Il16);
        Il28 = (Button) findViewById(R.id.Il28);
        Il30 = (Button) findViewById(R.id.Il30);
        Il40 = (Button) findViewById(R.id.Il40);


        Il54 = (Button) findViewById(R.id.Il54);
        Il76 = (Button) findViewById(R.id.Il76);
        Il22 = (Button) findViewById(R.id.Il22);
        Il78 = (Button) findViewById(R.id.Il78);
        Il12 = (Button) findViewById(R.id.Il12);
        Il80 = (Button) findViewById(R.id.Il80);
        Il32 = (Button) findViewById(R.id.Il32);
        Il112 = (Button) findViewById(R.id.Il112);
        Il86 = (Button) findViewById(R.id.Il86);
        Il14 = (Button) findViewById(R.id.Il14);
        Il96 = (Button) findViewById(R.id.Il96);
        Il18 = (Button) findViewById(R.id.Il18);
        Il181946 = (Button) findViewById(R.id.Il181946);
        Il114 = (Button) findViewById(R.id.Il114);
        Il62 = (Button) findViewById(R.id.Il62);
        Il103 = (Button) findViewById(R.id.Il103);





        Il2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil2 = new Intent(IlyushinActivity.this, Ilyushin2Activity.class);
                startActivity(intentil2);
            }
        });


        Il10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil10 = new Intent(IlyushinActivity.this, Ilyushin10Activity.class);
                startActivity(intentil10);
            }
        });


        Il16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil16 = new Intent(IlyushinActivity.this, Ilyushin16Activity.class);
                startActivity(intentil16);
            }
        });


        Il40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil40 = new Intent(IlyushinActivity.this, Ilyushin40Activity.class);
                startActivity(intentil40);
            }
        });


        Il102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil102 = new Intent(IlyushinActivity.this, Ilyushin102Activity.class);
                startActivity(intentil102);
            }
        });


        DB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentildb3 = new Intent(IlyushinActivity.this, IlyushinDB3Activity.class);
                startActivity(intentildb3);
            }
        });


        Il6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil6 = new Intent(IlyushinActivity.this, Ilyushin6Activity.class);
                startActivity(intentil6);
            }
        });


        Il22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil22 = new Intent(IlyushinActivity.this, Ilyushin22Activity.class);
                startActivity(intentil22);
            }
        });


        Il28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil28 = new Intent(IlyushinActivity.this, Ilyushin28Activity.class);
                startActivity(intentil28);
            }
        });


        Il30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil30 = new Intent(IlyushinActivity.this, Ilyushin30Activity.class);
                startActivity(intentil30);
            }
        });


        Il54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil54 = new Intent(IlyushinActivity.this, Ilyushin54Activity.class);
                startActivity(intentil54);
            }
        });


        Il12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil12 = new Intent(IlyushinActivity.this, Ilyushin12Activity.class);
                startActivity(intentil12);
            }
        });


        Il32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil32 = new Intent(IlyushinActivity.this, Ilyushin32Activity.class);
                startActivity(intentil32);
            }
        });


        Il76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil76 = new Intent(IlyushinActivity.this, Ilyushin76Activity.class);
                startActivity(intentil76);
            }
        });


        Il78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil78 = new Intent(IlyushinActivity.this, Ilyushin78Activity.class);
                startActivity(intentil78);
            }
        });


        Il80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil80 = new Intent(IlyushinActivity.this, Ilyushin80Activity.class);
                startActivity(intentil80);
            }
        });



        Il112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil112 = new Intent(IlyushinActivity.this, Ilyushin112Activity.class);
                startActivity(intentil112);
            }
        });



        Il14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil14 = new Intent(IlyushinActivity.this, Ilyushin14Activity.class);
                startActivity(intentil14);
            }
        });


        Il181946.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil181946 = new Intent(IlyushinActivity.this, Ilyushin18_1946Activity.class);
                startActivity(intentil181946);
            }
        });


        Il18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil18 = new Intent(IlyushinActivity.this, Ilyushin18Activity.class);
                startActivity(intentil18);
            }
        });


        Il62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil62 = new Intent(IlyushinActivity.this, Ilyushin62Activity.class);
                startActivity(intentil62);
            }
        });


        Il86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil86 = new Intent(IlyushinActivity.this, Ilyushin86Activity.class);
                startActivity(intentil86);
            }
        });


        Il96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil96 = new Intent(IlyushinActivity.this, Ilyushin96Activity.class);
                startActivity(intentil96);
            }
        });


        Il114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil114 = new Intent(IlyushinActivity.this, Ilyushin114Activity.class);
                startActivity(intentil114);
            }
        });


        Il103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentil103 = new Intent(IlyushinActivity.this, Ilyushin103Activity.class);
                startActivity(intentil103);
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
