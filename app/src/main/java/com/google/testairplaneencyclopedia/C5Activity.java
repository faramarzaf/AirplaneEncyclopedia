package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class C5Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView c5_1;
    ImageView c5_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c5);


        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        c5_1 = (ImageView) findViewById(R.id.c5_1);
        c5_2 = (ImageView) findViewById(R.id.c5_2);

        c5_1.setOnClickListener(this);
        c5_2.setOnClickListener(this);
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
        if (view.getId() == c5_1.getId()) {
            fade();
        } else if (view.getId() == c5_2.getId()) {
            fade();
        }
    }

    private void fade() {
        c5_1.animate().alpha(1f - c5_1.getAlpha()).setDuration(5);
        c5_2.animate().alpha(1f - c5_2.getAlpha()).setDuration(5);

    }
}
