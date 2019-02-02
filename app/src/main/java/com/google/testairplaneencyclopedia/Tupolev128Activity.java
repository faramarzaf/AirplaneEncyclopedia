package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev128Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu128_1;
    ImageView tu128_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev128);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        tu128_1 = (ImageView) findViewById(R.id.tu128_1);
        tu128_2 = (ImageView) findViewById(R.id.tu128_2);


        tu128_1.setOnClickListener(this);
        tu128_2.setOnClickListener(this);
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
        if (view.getId() == tu128_1.getId()) {
            fade();
        } else if (view.getId() == tu128_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu128_1.animate().alpha(1f - tu128_1.getAlpha()).setDuration(5);
        tu128_2.animate().alpha(1f - tu128_2.getAlpha()).setDuration(5);
    }
}
