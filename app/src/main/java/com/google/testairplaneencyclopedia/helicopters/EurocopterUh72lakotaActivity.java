package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class EurocopterUh72lakotaActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView lakota_1;
    ImageView lakota_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eurocopter_uh72lakota);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        lakota_1 = (ImageView) findViewById(R.id.lakota_1);
        lakota_2 = (ImageView) findViewById(R.id.lakota_2);

        lakota_1.setOnClickListener(this);
        lakota_2.setOnClickListener(this);
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
        if (view.getId() == lakota_1.getId()) {
            fade();
        } else if (view.getId() == lakota_2.getId()) {
            fade();
        }
    }
    private void fade() {
        lakota_1.animate().alpha(1f - lakota_1.getAlpha()).setDuration(5);
        lakota_2.animate().alpha(1f - lakota_2.getAlpha()).setDuration(5);

    }
}
