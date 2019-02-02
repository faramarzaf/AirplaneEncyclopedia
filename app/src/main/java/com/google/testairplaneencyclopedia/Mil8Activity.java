package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Mil8Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView mil8_1;
    ImageView mil8_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mil8);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mil8_1 = (ImageView) findViewById(R.id.mil8_1);
        mil8_2 = (ImageView) findViewById(R.id.mil8_2);

        mil8_1.setOnClickListener(this);
        mil8_2.setOnClickListener(this);
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
        if (view.getId() == mil8_1.getId()) {
            fade();
        } else if (view.getId() == mil8_2.getId()) {
            fade();
        }
    }

    private void fade() {
        mil8_1.animate().alpha(1f - mil8_1.getAlpha()).setDuration(5);
        mil8_2.animate().alpha(1f - mil8_2.getAlpha()).setDuration(5);

    }
}
