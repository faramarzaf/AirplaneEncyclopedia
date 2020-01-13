package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Mil14Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView mil14_1;
    ImageView mil14_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mil14);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        mil14_1 = (ImageView) findViewById(R.id.mil14_1);
        mil14_2 = (ImageView) findViewById(R.id.mil14_2);

        mil14_1.setOnClickListener(this);
        mil14_2.setOnClickListener(this);

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
        if (view.getId() == mil14_1.getId()) {
            fade();
        } else if (view.getId() == mil14_2.getId()) {
            fade();
        }
    }

    private void fade() {
        mil14_1.animate().alpha(1f - mil14_1.getAlpha()).setDuration(5);
        mil14_2.animate().alpha(1f - mil14_2.getAlpha()).setDuration(5);

    }
}
