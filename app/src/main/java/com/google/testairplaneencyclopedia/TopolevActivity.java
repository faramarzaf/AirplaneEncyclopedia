package com.google.testairplaneencyclopedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TopolevActivity extends AppCompatActivity {


    Button Tu104;
    Button Tu20;
    Button Tu80;
    Button Tu114;
    Button Tu22;
    Button Tu116;
    Button Tu22M;
    Button Tu85;
    Button Tu124;
    Button Tu128;
    Button Tu134;
    Button Tu126;
    Button Tu95LAL;
    Button Tu144;
    Button Tu142;
    Button Tu154;
    Button Tu160;
    Button Tu1;
    Button Tu214;
    Button Tu8;
    Button Tu334;
    Button Tu110;
    Button Tu155;
    Button Tu2;
    Button Tu70;
    Button Tu4;
    Button Tu14;
    Button Tu16;
    Button Tu75;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topolev);


        Tu104 = (Button) findViewById(R.id.Tu104);
        Tu4 = (Button) findViewById(R.id.Tu4);

        Tu114 = (Button) findViewById(R.id.Tu114);
        Tu14 = (Button) findViewById(R.id.Tu14);

        Tu116 = (Button) findViewById(R.id.Tu116);
        Tu16 = (Button) findViewById(R.id.Tu16);
        Tu70 = (Button) findViewById(R.id.Tu70);
        Tu124 = (Button) findViewById(R.id.Tu124);
        Tu20 = (Button) findViewById(R.id.Tu20);

        Tu134 = (Button) findViewById(R.id.Tu134);
        Tu22 = (Button) findViewById(R.id.Tu22);

        Tu144 = (Button) findViewById(R.id.Tu144);
        Tu22M = (Button) findViewById(R.id.Tu22M);
        Tu75 = (Button) findViewById(R.id.Tu75);
        Tu154 = (Button) findViewById(R.id.Tu154);
        Tu128 = (Button) findViewById(R.id.Tu128);
        Tu80 = (Button) findViewById(R.id.Tu80);

        Tu126 = (Button) findViewById(R.id.Tu126);

        Tu214 = (Button) findViewById(R.id.Tu214);
        Tu142 = (Button) findViewById(R.id.Tu142);
        Tu85 = (Button) findViewById(R.id.Tu85);
        Tu334 = (Button) findViewById(R.id.Tu334);
        Tu160 = (Button) findViewById(R.id.Tu160);


        Tu1 = (Button) findViewById(R.id.Tu1);
        Tu95LAL = (Button) findViewById(R.id.Tu95LAL);
        Tu2 = (Button) findViewById(R.id.Tu2);


        Tu8 = (Button) findViewById(R.id.Tu8);


        Tu110 = (Button) findViewById(R.id.Tu110);
        Tu155 = (Button) findViewById(R.id.Tu155);


        Tu104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu104 = new Intent(TopolevActivity.this, Tupolev104Activity.class);
                startActivity(intenttu104);
            }
        });


        Tu114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu114 = new Intent(TopolevActivity.this, Tupolev114Activity.class);
                startActivity(intenttu114);
            }
        });


        Tu116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu116 = new Intent(TopolevActivity.this, Tupolev116Activity.class);
                startActivity(intenttu116);
            }
        });


        Tu124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu124 = new Intent(TopolevActivity.this, Tupolev124Activity.class);
                startActivity(intenttu124);
            }
        });


        Tu134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu134 = new Intent(TopolevActivity.this, Tupolev134Activity.class);
                startActivity(intenttu134);
            }
        });


        Tu144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu144 = new Intent(TopolevActivity.this, Tupolev144Activity.class);
                startActivity(intenttu144);
            }
        });


        Tu154.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu154 = new Intent(TopolevActivity.this, Tupolev154Activity.class);
                startActivity(intenttu154);
            }
        });



        Tu214.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu214 = new Intent(TopolevActivity.this, Tupolev214Activity.class);
                startActivity(intenttu214);
            }
        });


        Tu334.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu334 = new Intent(TopolevActivity.this, Tupolev334Activity.class);
                startActivity(intenttu334);
            }
        });



        Tu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu2 = new Intent(TopolevActivity.this, Tupolev2Activity.class);
                startActivity(intenttu2);
            }
        });


        Tu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu4 = new Intent(TopolevActivity.this, Tupolev4Activity.class);
                startActivity(intenttu4);
            }
        });


        Tu14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu14 = new Intent(TopolevActivity.this, Tupolev14Activity.class);
                startActivity(intenttu14);
            }
        });


        Tu16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu16 = new Intent(TopolevActivity.this, Tupolev16Activity.class);
                startActivity(intenttu16);
            }
        });


        Tu20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu20 = new Intent(TopolevActivity.this, Tupolev20Activity.class);
                startActivity(intenttu20);
            }
        });


        Tu22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu22 = new Intent(TopolevActivity.this, Tupolev22Activity.class);
                startActivity(intenttu22);
            }
        });


        Tu22M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu22m = new Intent(TopolevActivity.this, Tupolev22_mActivity.class);
                startActivity(intenttu22m);
            }
        });


        Tu128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu128 = new Intent(TopolevActivity.this, Tupolev128Activity.class);
                startActivity(intenttu128);
            }
        });


        Tu126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu126 = new Intent(TopolevActivity.this, Tupolev126Activity.class);
                startActivity(intenttu126);
            }
        });


        Tu142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu142 = new Intent(TopolevActivity.this, Tupolev142Activity.class);
                startActivity(intenttu142);
            }
        });


        Tu160.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu160 = new Intent(TopolevActivity.this, Tupolev160Activity.class);
                startActivity(intenttu160);
            }
        });


        Tu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu1 = new Intent(TopolevActivity.this, Tupolev1Activity.class);
                startActivity(intenttu1);
            }
        });




        Tu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu8 = new Intent(TopolevActivity.this, Tupolev8Activity.class);
                startActivity(intenttu8);
            }
        });



        Tu70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu70 = new Intent(TopolevActivity.this, Tupolev70Activity.class);
                startActivity(intenttu70);
            }
        });




        Tu75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu75 = new Intent(TopolevActivity.this, Tupolev75Activity.class);
                startActivity(intenttu75);
            }
        });


        Tu80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu80 = new Intent(TopolevActivity.this, Tupolev80Activity.class);
                startActivity(intenttu80);
            }
        });



        Tu85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu85 = new Intent(TopolevActivity.this, Tupolev85Activity.class);
                startActivity(intenttu85);
            }
        });


        Tu95LAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu95lal = new Intent(TopolevActivity.this, Tupolev95_lalActivity.class);
                startActivity(intenttu95lal);
            }
        });


        Tu110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu110 = new Intent(TopolevActivity.this, Tupolev110Activity.class);
                startActivity(intenttu110);
            }
        });

        Tu155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttu155 = new Intent(TopolevActivity.this, Tupolev155Activity.class);
                startActivity(intenttu155);
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
