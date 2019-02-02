package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev160Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu160_1;
    ImageView tu160_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev160);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tu160_1 = (ImageView) findViewById(R.id.tu160_1);
        tu160_2 = (ImageView) findViewById(R.id.tu160_2);


        tu160_1.setOnClickListener(this);
        tu160_2.setOnClickListener(this);

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
        if (view.getId() == tu160_1.getId()) {
            fade();
        } else if (view.getId() == tu160_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu160_1.animate().alpha(1f - tu160_1.getAlpha()).setDuration(5);
        tu160_2.animate().alpha(1f - tu160_2.getAlpha()).setDuration(5);
    }
}
