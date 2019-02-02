package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Bell_h12Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell_h12_1;
    ImageView bell_h12_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell_h12);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bell_h12_1 = (ImageView) findViewById(R.id.bell_h12_1);
        bell_h12_2 = (ImageView) findViewById(R.id.bell_h12_2);

        bell_h12_1.setOnClickListener(this);
        bell_h12_2.setOnClickListener(this);
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
        if (view.getId() == bell_h12_1.getId()) {
            fade();
        } else if (view.getId() == bell_h12_2.getId()) {
            fade();
        }

    }
    private void fade() {
        bell_h12_1.animate().alpha(1f - bell_h12_1.getAlpha()).setDuration(5);
        bell_h12_2.animate().alpha(1f - bell_h12_2.getAlpha()).setDuration(5);

    }
}
