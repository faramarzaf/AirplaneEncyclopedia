package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Mil24Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView mil24_1;
    ImageView mil24_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mil24);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mil24_1 = (ImageView) findViewById(R.id.mil24_1);
        mil24_2 = (ImageView) findViewById(R.id.mil24_2);

        mil24_1.setOnClickListener(this);
        mil24_2.setOnClickListener(this);
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
        if (view.getId() == mil24_1.getId()) {
            fade();
        } else if (view.getId() == mil24_2.getId()) {
            fade();
        }
    }
    private void fade() {
        mil24_1.animate().alpha(1f - mil24_1.getAlpha()).setDuration(5);
        mil24_2.animate().alpha(1f - mil24_2.getAlpha()).setDuration(5);

    }
}
