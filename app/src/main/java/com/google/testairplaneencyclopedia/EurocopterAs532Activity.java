package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class EurocopterAs532Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView as532_1;
    ImageView as532_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eurocopter_as532);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        as532_1 = (ImageView) findViewById(R.id.as532_1);
        as532_2 = (ImageView) findViewById(R.id.as532_2);

        as532_1.setOnClickListener(this);
        as532_2.setOnClickListener(this);
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
        if (view.getId() == as532_1.getId()) {
            fade();
        } else if (view.getId() == as532_2.getId()) {
            fade();
        }
    }

    private void fade() {
        as532_1.animate().alpha(1f - as532_1.getAlpha()).setDuration(5);
        as532_2.animate().alpha(1f - as532_2.getAlpha()).setDuration(5);

    }
}
