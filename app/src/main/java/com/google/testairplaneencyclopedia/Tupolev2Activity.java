package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev2Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu2_1;
    ImageView tu2_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev2);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        tu2_1 = (ImageView) findViewById(R.id.tu2_1);
        tu2_2 = (ImageView) findViewById(R.id.tu2_2);


        tu2_1.setOnClickListener(this);
        tu2_2.setOnClickListener(this);

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
        if (view.getId() == tu2_1.getId()) {
            fade();
        } else if (view.getId() == tu2_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu2_1.animate().alpha(1f - tu2_1.getAlpha()).setDuration(5);
        tu2_2.animate().alpha(1f - tu2_2.getAlpha()).setDuration(5);
    }
}
