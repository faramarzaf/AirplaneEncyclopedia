package com.google.testairplaneencyclopedia;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class EurocopterEc725Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView ec725_1;
    ImageView ec725_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eurocopter_ec725);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        ec725_1 = (ImageView) findViewById(R.id.ec725_1);
        ec725_2 = (ImageView) findViewById(R.id.ec725_2);

        ec725_1.setOnClickListener(this);
        ec725_2.setOnClickListener(this);
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
        if (view.getId() == ec725_1.getId()) {
            fade();
        } else if (view.getId() == ec725_2.getId()) {
            fade();
        }
    }

    private void fade() {
        ec725_1.animate().alpha(1f - ec725_1.getAlpha()).setDuration(5);
        ec725_2.animate().alpha(1f - ec725_2.getAlpha()).setDuration(5);
    }
}
