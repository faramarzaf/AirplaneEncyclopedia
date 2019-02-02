package com.google.testairplaneencyclopedia;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class C12Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView c12_1;
    ImageView c12_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c12);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        c12_1 = (ImageView) findViewById(R.id.c12_1);
        c12_2 = (ImageView) findViewById(R.id.c12_2);

        c12_1.setOnClickListener(this);
        c12_2.setOnClickListener(this);
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
        if (view.getId() == c12_1.getId()) {
            fade();
        } else if (view.getId() == c12_2.getId()) {
            fade();
        }
    }

    private void fade() {
        c12_1.animate().alpha(1f - c12_1.getAlpha()).setDuration(5);
        c12_2.animate().alpha(1f - c12_2.getAlpha()).setDuration(5);
    }
}
