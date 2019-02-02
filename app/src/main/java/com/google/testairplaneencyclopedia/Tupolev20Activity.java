package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev20Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu20_1;
    ImageView tu20_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev20);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tu20_1 = (ImageView) findViewById(R.id.tu20_1);
        tu20_2 = (ImageView) findViewById(R.id.tu20_2);

        tu20_1.setOnClickListener(this);
        tu20_2.setOnClickListener(this);

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
        if (view.getId() == tu20_1.getId()) {
            fade();
        } else if (view.getId() == tu20_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu20_1.animate().alpha(1f - tu20_1.getAlpha()).setDuration(5);
        tu20_2.animate().alpha(1f - tu20_2.getAlpha()).setDuration(5);
    }
}
