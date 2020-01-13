package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class EurocopterAs565Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView as565_1;
    ImageView as565_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eurocopter_as565);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        as565_1 = (ImageView) findViewById(R.id.as565_1);
        as565_2 = (ImageView) findViewById(R.id.as565_2);

        as565_1.setOnClickListener(this);
        as565_2.setOnClickListener(this);
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
        if (view.getId() == as565_1.getId()) {
            fade();
        } else if (view.getId() == as565_2.getId()) {
            fade();
        }
    }
    private void fade() {
        as565_1.animate().alpha(1f - as565_1.getAlpha()).setDuration(5);
        as565_2.animate().alpha(1f - as565_2.getAlpha()).setDuration(5);

    }
}
