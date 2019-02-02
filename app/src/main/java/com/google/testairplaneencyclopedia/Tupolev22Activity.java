package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev22Activity extends AppCompatActivity implements View.OnClickListener {
    ImageView tu22_1;
    ImageView tu22_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev22);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        tu22_1 = (ImageView) findViewById(R.id.tu22_1);
        tu22_2 = (ImageView) findViewById(R.id.tu22_2);


        tu22_1.setOnClickListener(this);
        tu22_2.setOnClickListener(this);
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
        if (view.getId() == tu22_1.getId()) {
            fade();
        } else if (view.getId() == tu22_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu22_1.animate().alpha(1f - tu22_1.getAlpha()).setDuration(5);
        tu22_2.animate().alpha(1f - tu22_2.getAlpha()).setDuration(5);
    }
}
