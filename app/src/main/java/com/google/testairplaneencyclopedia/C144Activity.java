package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class C144Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView c144_1;
    ImageView c144_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c144);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        c144_1 = (ImageView) findViewById(R.id.c144_1);
        c144_2 = (ImageView) findViewById(R.id.c144_2);

        c144_1.setOnClickListener(this);
        c144_2.setOnClickListener(this);
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
        if (view.getId() == c144_1.getId()) {
            fade();
        } else if (view.getId() == c144_2.getId()) {
            fade();
        }
    }
    private void fade() {
        c144_1.animate().alpha(1f - c144_1.getAlpha()).setDuration(5);
        c144_2.animate().alpha(1f - c144_2.getAlpha()).setDuration(5);

    }
}
