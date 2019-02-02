package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class F14Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView f14_1;
    ImageView f14_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f14);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        f14_1 = (ImageView) findViewById(R.id.f14_1);
        f14_2 = (ImageView) findViewById(R.id.f14_2);


        f14_1.setOnClickListener(this);
        f14_2.setOnClickListener(this);


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
        if (view.getId() == f14_1.getId()) {
            fade();
        } else if (view.getId() == f14_2.getId()) {
            fade();
        }
    }

    private void fade() {
        f14_1.animate().alpha(1f - f14_1.getAlpha()).setDuration(5);
        f14_2.animate().alpha(1f - f14_2.getAlpha()).setDuration(5);
    }
}
