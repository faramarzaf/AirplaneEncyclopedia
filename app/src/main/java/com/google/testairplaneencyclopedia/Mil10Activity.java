package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Mil10Activity extends AppCompatActivity implements View.OnClickListener {
    ImageView mil10_1;
    ImageView mil10_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mil10);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mil10_1 = (ImageView) findViewById(R.id.mil10_1);
        mil10_2 = (ImageView) findViewById(R.id.mil10_2);

        mil10_1.setOnClickListener(this);
        mil10_2.setOnClickListener(this);
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
        if (view.getId() == mil10_1.getId()) {
            fade();
        } else if (view.getId() == mil10_2.getId()) {
            fade();
        }
    }
    private void fade() {
        mil10_1.animate().alpha(1f - mil10_1.getAlpha()).setDuration(5);
        mil10_2.animate().alpha(1f - mil10_2.getAlpha()).setDuration(5);

    }

}
