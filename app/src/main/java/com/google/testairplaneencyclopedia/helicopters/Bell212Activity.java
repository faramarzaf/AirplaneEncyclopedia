package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Bell212Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell212_1;
    ImageView bell212_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell212);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        bell212_1 = (ImageView) findViewById(R.id.bell212_1);
        bell212_2 = (ImageView) findViewById(R.id.bell212_2);

        bell212_1.setOnClickListener(this);
        bell212_2.setOnClickListener(this);
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
        if (view.getId() == bell212_1.getId()) {
            fade();
        } else if (view.getId() == bell212_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell212_1.animate().alpha(1f - bell212_1.getAlpha()).setDuration(5);
        bell212_2.animate().alpha(1f - bell212_2.getAlpha()).setDuration(5);

    }
}
