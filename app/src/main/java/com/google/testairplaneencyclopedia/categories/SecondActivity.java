package com.google.testairplaneencyclopedia.categories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.testairplaneencyclopedia.carriage.CarriageAirplanesActivity;
import com.google.testairplaneencyclopedia.civil.CivilAirplanesActivity;
import com.google.testairplaneencyclopedia.fighter_jets.FighterJetsActivity;
import com.google.testairplaneencyclopedia.helicopters.HelicoptersActivity;
import com.google.testairplaneencyclopedia.R;

public class SecondActivity extends AppCompatActivity {

    Button btn1_act2;
    Button btn2_act2;
    Button btn3_act2;
    Button btn4_act2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn1_act2 = (Button) findViewById(R.id.btn1_act2);
        btn2_act2 = (Button) findViewById(R.id.btn2_act2);
        btn3_act2 = (Button) findViewById(R.id.btn3_act2);
        btn4_act2 = (Button) findViewById(R.id.btn4_act2);



        btn1_act2.setOnClickListener(new View.OnClickListener() {
             @Override
              public void onClick(View view) {
                 Intent intentbtn1_act2 = new Intent(SecondActivity.this, CivilAirplanesActivity.class);
                 startActivity(intentbtn1_act2);
         }
         });


        btn2_act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtn2_act2 = new Intent(SecondActivity.this, FighterJetsActivity.class);
                startActivity(intentbtn2_act2);
            }
        });



        btn3_act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtn3_act2 = new Intent(SecondActivity.this, CarriageAirplanesActivity.class);
                startActivity(intentbtn3_act2);
            }
        });



        btn4_act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtn4_act2 = new Intent(SecondActivity.this, HelicoptersActivity.class);
                startActivity(intentbtn4_act2);
            }
        });



    }

}

