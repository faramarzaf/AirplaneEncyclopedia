package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev155Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu155_1;
    ImageView tu155_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev155);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        tu155_1 = (ImageView) findViewById(R.id.tu155_1);
        tu155_2 = (ImageView) findViewById(R.id.tu155_2);


        tu155_1.setOnClickListener(this);
        tu155_2.setOnClickListener(this);


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
        if (view.getId() == tu155_1.getId()) {
            fade();
        } else if (view.getId() == tu155_2.getId()) {
            fade();
        }

    }

    private void fade() {
        tu155_1.animate().alpha(1f - tu155_1.getAlpha()).setDuration(5);
        tu155_2.animate().alpha(1f - tu155_2.getAlpha()).setDuration(5);

    }
}
