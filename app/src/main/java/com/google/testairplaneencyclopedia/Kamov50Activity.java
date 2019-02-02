package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Kamov50Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView ka50_1;
    ImageView ka50_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamov50);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        ka50_1 = (ImageView) findViewById(R.id.ka50_1);
        ka50_2 = (ImageView) findViewById(R.id.ka50_2);

        ka50_1.setOnClickListener(this);
        ka50_2.setOnClickListener(this);

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
        if (view.getId() == ka50_1.getId()) {
            fade();
        } else if (view.getId() == ka50_2.getId()) {
            fade();
        }
    }

    private void fade() {
        ka50_1.animate().alpha(1f - ka50_1.getAlpha()).setDuration(5);
        ka50_2.animate().alpha(1f - ka50_2.getAlpha()).setDuration(5);

    }
}
