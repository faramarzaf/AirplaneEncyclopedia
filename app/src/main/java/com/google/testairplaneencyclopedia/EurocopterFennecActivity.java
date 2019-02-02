package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class EurocopterFennecActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView fennec_1;
    ImageView fennec_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eurocopter_fennec);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        fennec_1 = (ImageView) findViewById(R.id.fennec_1);
        fennec_2 = (ImageView) findViewById(R.id.fennec_2);

        fennec_1.setOnClickListener(this);
        fennec_2.setOnClickListener(this);
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
        if (view.getId() == fennec_1.getId()) {
            fade();
        } else if (view.getId() == fennec_2.getId()) {
            fade();
        }
    }
    private void fade() {
        fennec_1.animate().alpha(1f - fennec_1.getAlpha()).setDuration(5);
        fennec_2.animate().alpha(1f - fennec_2.getAlpha()).setDuration(5);

    }
}
