package com.google.testairplaneencyclopedia;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Mil2Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView mil2_1;
    ImageView mil2_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mil2);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        mil2_1 = (ImageView) findViewById(R.id.mil2_1);
        mil2_2 = (ImageView) findViewById(R.id.mil2_2);

        mil2_1.setOnClickListener(this);
        mil2_2.setOnClickListener(this);

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
        if (view.getId() == mil2_1.getId()) {
            fade();
        } else if (view.getId() == mil2_2.getId()) {
            fade();
        }
    }
    private void fade() {
        mil2_1.animate().alpha(1f - mil2_1.getAlpha()).setDuration(5);
        mil2_2.animate().alpha(1f - mil2_2.getAlpha()).setDuration(5);

    }
}
