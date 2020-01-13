package com.google.testairplaneencyclopedia.helicopters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.testairplaneencyclopedia.R;

public class BellActivity extends AppCompatActivity {

    Button bell47;
    Button bell429;
    Button bell47j;
    Button bell430;
    Button bell204;
    Button bell525;
    Button bell206;
    Button bell_h12;
    Button bell212;
    Button bell_h13;
    Button bell214;
    Button bell_xh15;
    Button bell214st;
    Button bell_hsl;
    Button bell222;
    Button bell_uh1;
    Button bell407;
    Button bell207;
    Button bell412;
    Button bell_ah1cobra;
    Button bell427;
    Button bell_ah1supercobra;
    Button bell_ah_1z_Viper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bell47 = (Button) findViewById(R.id.bell47);
        bell429 = (Button) findViewById(R.id.bell429);
        bell47j = (Button) findViewById(R.id.bell47j);
        bell430 = (Button) findViewById(R.id.bell430);
        bell204 = (Button) findViewById(R.id.bell204);
        bell525 = (Button) findViewById(R.id.bell525);
        bell206 = (Button) findViewById(R.id.bell206);
        bell_h12 = (Button) findViewById(R.id.bell_h12);
        bell212 = (Button) findViewById(R.id.bell212);
        bell_h13 = (Button) findViewById(R.id.bell_h13);
        bell214 = (Button) findViewById(R.id.bell214);
        bell_xh15 = (Button) findViewById(R.id.bell_xh15);
        bell214st = (Button) findViewById(R.id.bell214st);
        bell_hsl = (Button) findViewById(R.id.bell_hsl);
        bell222 = (Button) findViewById(R.id.bell222);
        bell_uh1 = (Button) findViewById(R.id.bell_uh1);
        bell407 = (Button) findViewById(R.id.bell407);
        bell207 = (Button) findViewById(R.id.bell207);
        bell412 = (Button) findViewById(R.id.bell412);
        bell_ah1cobra = (Button) findViewById(R.id.bell_ah1cobra);
        bell427 = (Button) findViewById(R.id.bell427);
        bell_ah1supercobra = (Button) findViewById(R.id.bell_ah1supercobra);
        bell_ah_1z_Viper = (Button) findViewById(R.id.bell_ah_1z_Viper);

        bell47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell47Activity.class);
                startActivity(intent);

            }
        });


        bell47j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell47jActivity.class);
                startActivity(intent);
            }
        });


        bell204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell204Activity.class);
                startActivity(intent);
            }
        });


        bell206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell206Activity.class);
                startActivity(intent);
            }
        });


        bell212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell212Activity.class);
                startActivity(intent);
            }
        });


        bell214.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell214Activity.class);
                startActivity(intent);
            }
        });


        bell214st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell214stActivity.class);
                startActivity(intent);
            }
        });


        bell222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell222Activity.class);
                startActivity(intent);
            }
        });


        bell407.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell407Activity.class);
                startActivity(intent);
            }
        });


        bell412.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell412Activity.class);
                startActivity(intent);
            }
        });


        bell427.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell427Activity.class);
                startActivity(intent);
            }
        });


        bell429.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell429Activity.class);
                startActivity(intent);
            }
        });


        bell430.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell430Activity.class);
                startActivity(intent);
            }
        });


        bell525.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell525Activity.class);
                startActivity(intent);
            }
        });


        bell_h12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell_h12Activity.class);
                startActivity(intent);
            }
        });


        bell_h13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell_h13Activity.class);
                startActivity(intent);
            }
        });


        bell_xh15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell_xh15Activity.class);
                startActivity(intent);
            }
        });


        bell_hsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell_hslActivity.class);
                startActivity(intent);
            }
        });


        bell_uh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell_uh1Activity.class);
                startActivity(intent);
            }
        });


        bell207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell207Activity.class);
                startActivity(intent);
            }
        });


        bell_ah1cobra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell_ah1cobraActivity.class);
                startActivity(intent);
            }
        });


        bell_ah1supercobra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BellActivity.this, Bell_ah1supercobraActivity.class);
                startActivity(intent);
            }
        });

        bell_ah_1z_Viper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BellActivity.this, Bell_ah1Z_ViperActivity.class);
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
