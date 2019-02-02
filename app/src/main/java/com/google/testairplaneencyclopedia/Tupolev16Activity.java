package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev16Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu16_1;
    ImageView tu16_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev16);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tu16_1 = (ImageView) findViewById(R.id.tu16_1);
        tu16_2 = (ImageView) findViewById(R.id.tu16_2);


        tu16_1.setOnClickListener(this);
        tu16_2.setOnClickListener(this);


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
        if (view.getId() == tu16_1.getId()) {
            fade();
        } else if (view.getId() == tu16_2.getId()) {
            fade();
        }

    }

    private void fade() {
        tu16_1.animate().alpha(1f - tu16_1.getAlpha()).setDuration(5);
        tu16_2.animate().alpha(1f - tu16_2.getAlpha()).setDuration(5);

    }
}
