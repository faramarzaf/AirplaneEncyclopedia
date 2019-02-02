package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Fokker50Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView fokker50_1;
    ImageView fokker50_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fokker50);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        fokker50_1 = (ImageView) findViewById(R.id.fokker50_1);
        fokker50_2 = (ImageView) findViewById(R.id.fokker50_2);

        fokker50_1.setOnClickListener(this);
        fokker50_2.setOnClickListener(this);
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
        if (view.getId() == fokker50_1.getId()) {
            fade();
        } else if (view.getId() == fokker50_2.getId()) {
            fade();
        }
    }

    private void fade() {
        fokker50_1.animate().alpha(1f - fokker50_1.getAlpha()).setDuration(5);
        fokker50_2.animate().alpha(1f - fokker50_2.getAlpha()).setDuration(5);

    }
}
