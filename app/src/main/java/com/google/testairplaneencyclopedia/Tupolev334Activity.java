package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev334Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu334_1;
    ImageView tu334_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev334);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        tu334_1 = (ImageView) findViewById(R.id.tu334_1);
        tu334_2 = (ImageView) findViewById(R.id.tu334_2);


        tu334_1.setOnClickListener(this);
        tu334_2.setOnClickListener(this);

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
        if (view.getId() == tu334_1.getId()) {
            fade();
        } else if (view.getId() == tu334_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu334_1.animate().alpha(1f - tu334_1.getAlpha()).setDuration(5);
        tu334_2.animate().alpha(1f - tu334_2.getAlpha()).setDuration(5);
    }
}