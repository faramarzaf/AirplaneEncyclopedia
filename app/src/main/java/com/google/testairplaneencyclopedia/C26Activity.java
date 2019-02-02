package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class C26Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView c26_1;
    ImageView c26_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c26);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        c26_1 = (ImageView) findViewById(R.id.c26_1);
        c26_2 = (ImageView) findViewById(R.id.c26_2);

        c26_1.setOnClickListener(this);
        c26_2.setOnClickListener(this);
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
        if (view.getId() == c26_1.getId()) {
            fade();
        } else if (view.getId() == c26_2.getId()) {
            fade();
        }
    }

    private void fade() {
        c26_1.animate().alpha(1f - c26_1.getAlpha()).setDuration(5);
        c26_2.animate().alpha(1f - c26_2.getAlpha()).setDuration(5);

    }
}
