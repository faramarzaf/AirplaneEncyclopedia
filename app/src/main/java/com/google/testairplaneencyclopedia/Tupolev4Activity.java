package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev4Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu4_1;
    ImageView tu4_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev4);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        tu4_1 = (ImageView) findViewById(R.id.tu4_1);
        tu4_2 = (ImageView) findViewById(R.id.tu4_2);


        tu4_1.setOnClickListener(this);
        tu4_2.setOnClickListener(this);
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
        if (view.getId() == tu4_1.getId()) {
            fade();
        } else if (view.getId() == tu4_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu4_1.animate().alpha(1f - tu4_1.getAlpha()).setDuration(5);
        tu4_2.animate().alpha(1f - tu4_2.getAlpha()).setDuration(5);
    }
}
