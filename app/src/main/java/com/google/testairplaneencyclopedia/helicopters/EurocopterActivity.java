package com.google.testairplaneencyclopedia.helicopters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.testairplaneencyclopedia.R;

public class EurocopterActivity extends AppCompatActivity {


    Button eurocopter_As532;
    Button eurocopter_As565;
    Button eurocopter_Ec635;
    Button eurocopter_Ec725;
    Button eurocopter_Fennec;
    Button eurocopter_HH65;
    Button eurocopter_Tiger;
    Button eurocopter_Uh72;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eurocopter);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        eurocopter_As532  = (Button) findViewById(R.id.eurocopter_As532);
        eurocopter_As565  = (Button) findViewById(R.id.eurocopter_As565);
        eurocopter_Ec635  = (Button) findViewById(R.id.eurocopter_Ec635);
        eurocopter_Ec725  = (Button) findViewById(R.id.eurocopter_Ec725);
        eurocopter_Fennec = (Button) findViewById(R.id.eurocopter_Fennec);
        eurocopter_HH65   = (Button) findViewById(R.id.eurocopter_HH65);
        eurocopter_Tiger  = (Button) findViewById(R.id.eurocopter_Tiger);
        eurocopter_Uh72   = (Button) findViewById(R.id.eurocopter_Uh72);


        eurocopter_As532.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EurocopterActivity.this,EurocopterAs532Activity.class);
                startActivity(intent);
            }
        });


        eurocopter_As565.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EurocopterActivity.this,EurocopterAs565Activity.class);
                startActivity(intent);
            }
        });


        eurocopter_Ec635.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EurocopterActivity.this,EurocopterEc635Activity.class);
                startActivity(intent);
            }
        });


        eurocopter_Ec725.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EurocopterActivity.this,EurocopterEc725Activity.class);
                startActivity(intent);
            }
        });


        eurocopter_Fennec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EurocopterActivity.this,EurocopterFennecActivity.class);
                startActivity(intent);
            }
        });


        eurocopter_HH65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EurocopterActivity.this,EurocopterHH_65dolphinActivity.class);
                startActivity(intent);
            }
        });


        eurocopter_Tiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EurocopterActivity.this,EurocopterTigerActivity.class);
                startActivity(intent);
            }
        });


        eurocopter_Uh72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EurocopterActivity.this,EurocopterUh72lakotaActivity.class);
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
