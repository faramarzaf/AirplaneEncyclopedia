package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Bell206Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell206_1;
    ImageView bell206_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell206);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        bell206_1 = (ImageView) findViewById(R.id.bell206_1);
        bell206_2 = (ImageView) findViewById(R.id.bell206_2);

        bell206_1.setOnClickListener(this);
        bell206_2.setOnClickListener(this);
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
        if (view.getId() == bell206_1.getId()) {
            fade();
        } else if (view.getId() == bell206_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell206_1.animate().alpha(1f - bell206_1.getAlpha()).setDuration(5);
        bell206_2.animate().alpha(1f - bell206_2.getAlpha()).setDuration(5);

    }
}
