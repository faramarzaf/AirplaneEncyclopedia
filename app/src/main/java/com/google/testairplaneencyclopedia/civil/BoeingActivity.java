package com.google.testairplaneencyclopedia.civil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.testairplaneencyclopedia.R;

public class BoeingActivity extends AppCompatActivity {

    Button Boeing707;
    Button Boeing717200;
    Button Boeing720;
    Button Boeing727;
    Button Boeing737Original;
    Button Boeing737Classic;
    Button Boeing737NG;
    Button Boeing737Max;
    Button Boeing747;
    Button Boeing7478;
    Button Boeing757;
    Button Boeing767;
    Button Boeing777;
    Button Boeing777X;
    Button Boeing787;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boeing);

        Boeing707 = (Button) findViewById(R.id.Boeing707);
        Boeing717200 = (Button) findViewById(R.id.Boeing717200);
        Boeing720 = (Button) findViewById(R.id.Boeing720);
        Boeing727 = (Button) findViewById(R.id.Boeing727);
        Boeing737Original = (Button) findViewById(R.id.Boeing737Original);
        Boeing737Classic = (Button) findViewById(R.id.Boeing737Classic);
        Boeing737NG = (Button) findViewById(R.id.Boeing737NG);
        Boeing737Max = (Button) findViewById(R.id.Boeing737Max);
        Boeing747 = (Button) findViewById(R.id.Boeing747);
        Boeing7478 = (Button) findViewById(R.id.Boeing7478);
        Boeing757 = (Button) findViewById(R.id.Boeing757);
        Boeing767 = (Button) findViewById(R.id.Boeing767);
        Boeing777 = (Button) findViewById(R.id.Boeing777);
        Boeing777X = (Button) findViewById(R.id.Boeing777X);
        Boeing787 = (Button) findViewById(R.id.Boeing787);


        Boeing707.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing707 = new Intent(BoeingActivity.this, Boeing707Activity.class);
                startActivity(intentboeing707);
            }
        });


        Boeing717200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing717200 = new Intent(BoeingActivity.this, Boeing717_200Activity.class);
                startActivity(intentboeing717200);
            }
        });

        Boeing720.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing720 = new Intent(BoeingActivity.this, Boeing720Activity.class);
                startActivity(intentboeing720);
            }
        });


        Boeing727.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing727 = new Intent(BoeingActivity.this, Boeing727Activity.class);
                startActivity(intentboeing727);
            }
        });


        Boeing737Original.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing737Original = new Intent(BoeingActivity.this, Boeing737OriginalActivity.class);
                startActivity(intentboeing737Original);
            }
        });


        Boeing737Classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing737Classic = new Intent(BoeingActivity.this, Boeing737ClassicActivity.class);
                startActivity(intentboeing737Classic);
            }
        });


        Boeing737NG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing737NG = new Intent(BoeingActivity.this, Boeing737NGActivity.class);
                startActivity(intentboeing737NG);
            }
        });

        Boeing737Max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing737Max = new Intent(BoeingActivity.this, Boeing737MaxActivity.class);
                startActivity(intentboeing737Max);
            }
        });

        Boeing747.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing747 = new Intent(BoeingActivity.this, Boeing747Activity.class);
                startActivity(intentboeing747);
            }
        });


        Boeing7478.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing7478 = new Intent(BoeingActivity.this, Boeing747_8Activity.class);
                startActivity(intentboeing7478);
            }
        });


        Boeing757.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing757 = new Intent(BoeingActivity.this, Boeing757Activity.class);
                startActivity(intentboeing757);
            }
        });


        Boeing767.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing767 = new Intent(BoeingActivity.this, Boeing767Activity.class);
                startActivity(intentboeing767);
            }
        });


        Boeing777.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing777 = new Intent(BoeingActivity.this, Boeing777Activity.class);
                startActivity(intentboeing777);
            }
        });


        Boeing777X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing777X = new Intent(BoeingActivity.this, Boeing777_XActivity.class);
                startActivity(intentboeing777X);
            }
        });


        Boeing787.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentboeing787 = new Intent(BoeingActivity.this, Boeing787Activity.class);
                startActivity(intentboeing787);
            }
        });


        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}
