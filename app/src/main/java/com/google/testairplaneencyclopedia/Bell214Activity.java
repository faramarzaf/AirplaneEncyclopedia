package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Bell214Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell214_1;
    ImageView bell214_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell214);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bell214_1 = (ImageView) findViewById(R.id.bell214_1);
        bell214_2 = (ImageView) findViewById(R.id.bell214_2);

        bell214_1.setOnClickListener(this);
        bell214_2.setOnClickListener(this);
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
        if (view.getId() == bell214_1.getId()) {
            fade();
        } else if (view.getId() == bell214_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell214_1.animate().alpha(1f - bell214_1.getAlpha()).setDuration(5);
        bell214_2.animate().alpha(1f - bell214_2.getAlpha()).setDuration(5);

    }
}
