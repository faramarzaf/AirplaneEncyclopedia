package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Fokker25Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView fokker25_1;
    ImageView fokker25_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fokker25);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        fokker25_1 = (ImageView) findViewById(R.id.fokker25_1);
        fokker25_2 = (ImageView) findViewById(R.id.fokker25_2);

        fokker25_1.setOnClickListener(this);
        fokker25_2.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == fokker25_1.getId()) {
            fade();
        } else if (view.getId() == fokker25_2.getId()) {
            fade();
        }
    }

    private void fade() {
        fokker25_1.animate().alpha(1f - fokker25_1.getAlpha()).setDuration(5);
        fokker25_2.animate().alpha(1f - fokker25_2.getAlpha()).setDuration(5);

    }

}
