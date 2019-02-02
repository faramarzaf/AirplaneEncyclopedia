package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev154Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu154_1;
    ImageView tu154_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev154);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tu154_1 = (ImageView) findViewById(R.id.tu154_1);
        tu154_2 = (ImageView) findViewById(R.id.tu154_2);


        tu154_1.setOnClickListener(this);
        tu154_2.setOnClickListener(this);


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
        if (view.getId() == tu154_1.getId()) {
            fade();
        } else if (view.getId() == tu154_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu154_1.animate().alpha(1f - tu154_1.getAlpha()).setDuration(5);
        tu154_2.animate().alpha(1f - tu154_2.getAlpha()).setDuration(5);

    }
}
