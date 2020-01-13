package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class EurocopterEc635Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView ec_635_1;
    ImageView ec_635_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eurocopter_ec635);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        ec_635_1 = (ImageView) findViewById(R.id.ec_635_1);
        ec_635_2 = (ImageView) findViewById(R.id.ec_635_2);

        ec_635_1.setOnClickListener(this);
        ec_635_2.setOnClickListener(this);
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
        if (view.getId() == ec_635_1.getId()) {
            fade();
        } else if (view.getId() == ec_635_2.getId()) {
            fade();
        }
    }

    private void fade() {
        ec_635_1.animate().alpha(1f - ec_635_1.getAlpha()).setDuration(5);
        ec_635_2.animate().alpha(1f - ec_635_2.getAlpha()).setDuration(5);

    }
}
