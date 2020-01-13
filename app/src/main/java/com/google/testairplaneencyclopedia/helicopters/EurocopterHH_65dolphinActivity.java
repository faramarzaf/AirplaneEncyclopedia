package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class EurocopterHH_65dolphinActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView hh65_1;
    ImageView hh65_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eurocopter_hh_65dolphin);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        hh65_1 = (ImageView) findViewById(R.id.hh65_1);
        hh65_2 = (ImageView) findViewById(R.id.hh65_2);

        hh65_1.setOnClickListener(this);
        hh65_2.setOnClickListener(this);
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
        if (view.getId() == hh65_1.getId()) {
            fade();
        } else if (view.getId() == hh65_2.getId()) {
            fade();
        }
    }

    private void fade() {
        hh65_1.animate().alpha(1f - hh65_1.getAlpha()).setDuration(5);
        hh65_2.animate().alpha(1f - hh65_2.getAlpha()).setDuration(5);

    }
}
