package com.google.testairplaneencyclopedia.helicopters;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Mil1Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView mil1_1;
    ImageView mil1_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mil1);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mil1_1 = (ImageView) findViewById(R.id.mil1_1);
        mil1_2 = (ImageView) findViewById(R.id.mil1_2);

        mil1_1.setOnClickListener(this);
        mil1_2.setOnClickListener(this);
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
        if (view.getId() == mil1_1.getId()) {
            fade();
        } else if (view.getId() == mil1_2.getId()) {
            fade();
        }
    }
    private void fade() {
        mil1_1.animate().alpha(1f - mil1_1.getAlpha()).setDuration(5);
        mil1_2.animate().alpha(1f - mil1_2.getAlpha()).setDuration(5);

    }
}
