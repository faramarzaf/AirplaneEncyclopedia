package com.google.testairplaneencyclopedia.fighter_jets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.testairplaneencyclopedia.R;

public class FighterJetsActivity extends AppCompatActivity {


    Button btn_f4;
    Button btn_f5;
    Button btn_f14;
    Button btn_f15;
    Button btn_f16;
    Button btn_f18;
    Button btn_f22;
    Button btn_f35;
    Button btn_mig21;
    Button btn_mig23;
    Button btn_mig25;
    Button btn_mig29;
    Button btn_mig31;
    Button btn_su24;
    Button btn_su25;
    Button btn_su27;
    Button btn_su34;
    Button btn_su35;
    Button btn_eurofighterTyphoon;
    Button btn_SepecatJaguar;
    Button btn_Dassault_Mirage_2000;
    Button btn_Dassault_Rafale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fighter_jets);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        btn_f4 = (Button) findViewById(R.id.btn_f4);
        btn_f5 = (Button) findViewById(R.id.btn_f5);
        btn_f14 = (Button) findViewById(R.id.btn_f14);
        btn_f15 = (Button) findViewById(R.id.btn_f15);
        btn_f16 = (Button) findViewById(R.id.btn_f16);
        btn_f18 = (Button) findViewById(R.id.btn_f18);
        btn_f22 = (Button) findViewById(R.id.btn_f22);
        btn_f35 = (Button) findViewById(R.id.btn_f35);
        btn_mig21 = (Button) findViewById(R.id.btn_mig21);
        btn_mig23 = (Button) findViewById(R.id.btn_mig23);
        btn_mig25 = (Button) findViewById(R.id.btn_mig25);
        btn_mig29 = (Button) findViewById(R.id.btn_mig29);
        btn_mig31 = (Button) findViewById(R.id.btn_mig31);
        btn_su24 = (Button) findViewById(R.id.btn_su24);
        btn_su25 = (Button) findViewById(R.id.btn_su25);
        btn_su27 = (Button) findViewById(R.id.btn_su27);
        btn_su34 = (Button) findViewById(R.id.btn_su34);
        btn_su35 = (Button) findViewById(R.id.btn_su35);
        btn_eurofighterTyphoon = (Button) findViewById(R.id.btn_eurofighterTyphoon);
        btn_SepecatJaguar = (Button) findViewById(R.id.btn_SepecatJaguar);
        btn_Dassault_Mirage_2000 = (Button) findViewById(R.id.btn_Dassault_Mirage_2000);
        btn_Dassault_Rafale = (Button) findViewById(R.id.btn_Dassault_Rafale);

        btn_f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentf4 = new Intent(FighterJetsActivity.this, F4Activity.class);
                startActivity(intentf4);
            }
        });


        btn_f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentf5 = new Intent(FighterJetsActivity.this, F5Activity.class);
                startActivity(intentf5);
            }
        });


        btn_f14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentf14 = new Intent(FighterJetsActivity.this, F14Activity.class);
                startActivity(intentf14);
            }
        });


        btn_f15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentf15 = new Intent(FighterJetsActivity.this, F15Activity.class);
                startActivity(intentf15);
            }
        });


        btn_f16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentf16 = new Intent(FighterJetsActivity.this, F16Activity.class);
                startActivity(intentf16);
            }
        });


        btn_f18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentf18 = new Intent(FighterJetsActivity.this, F18Activity.class);
                startActivity(intentf18);
            }
        });


        btn_f22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentf22 = new Intent(FighterJetsActivity.this, F22Activity.class);
                startActivity(intentf22);
            }
        });


        btn_f35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentf35 = new Intent(FighterJetsActivity.this, F35Activity.class);
                startActivity(intentf35);
            }
        });


        btn_mig21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmig21 = new Intent(FighterJetsActivity.this, Mig21Activity.class);
                startActivity(intentmig21);
            }
        });


        btn_mig23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmig23 = new Intent(FighterJetsActivity.this, Mig23Activity.class);
                startActivity(intentmig23);
            }
        });


        btn_mig25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmig25 = new Intent(FighterJetsActivity.this, Mig25Activity.class);
                startActivity(intentmig25);
            }
        });


        btn_mig29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmig29 = new Intent(FighterJetsActivity.this, Mig29Activity.class);
                startActivity(intentmig29);
            }
        });


        btn_mig31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmig31 = new Intent(FighterJetsActivity.this, Mig31Activity.class);
                startActivity(intentmig31);
            }
        });


        btn_su24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsu24 = new Intent(FighterJetsActivity.this, Su24Activity.class);
                startActivity(intentsu24);
            }
        });


        btn_su25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsu25 = new Intent(FighterJetsActivity.this, Su25Activity.class);
                startActivity(intentsu25);
            }
        });


        btn_su27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsu27 = new Intent(FighterJetsActivity.this, Su27Activity.class);
                startActivity(intentsu27);
            }
        });


        btn_su34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsu34 = new Intent(FighterJetsActivity.this, Su34Activity.class);
                startActivity(intentsu34);
            }
        });


        btn_su35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsu35 = new Intent(FighterJetsActivity.this, Su35Activity.class);
                startActivity(intentsu35);
            }
        });

        btn_eurofighterTyphoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FighterJetsActivity.this, EurofighterTyphoonActivity.class);
                startActivity(intent);
            }
        });

        btn_SepecatJaguar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FighterJetsActivity.this, SepecatJaguarActivity.class);
                startActivity(intent);
            }
        });

        btn_Dassault_Mirage_2000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FighterJetsActivity.this, DassaultMirage2000Activity.class);
                startActivity(intent);
            }
        });

        btn_Dassault_Rafale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FighterJetsActivity.this, DassaultRafaleActivity.class);
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
