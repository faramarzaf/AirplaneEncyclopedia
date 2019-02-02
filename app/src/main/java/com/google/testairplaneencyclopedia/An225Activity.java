package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An225Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an225_1;
    ImageView an225_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an225);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        an225_1 = (ImageView) findViewById(R.id.an225_1);
        an225_2 = (ImageView) findViewById(R.id.an225_2);

        an225_1.setOnClickListener(this);
        an225_2.setOnClickListener(this);
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
        if (view.getId() == an225_1.getId()) {
            fade();
        } else if (view.getId() == an225_2.getId()) {
            fade();
        }
    }

    private void fade() {
        an225_1.animate().alpha(1f - an225_1.getAlpha()).setDuration(5);
        an225_2.animate().alpha(1f - an225_2.getAlpha()).setDuration(5);

    }
}
