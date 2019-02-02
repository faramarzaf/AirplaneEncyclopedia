package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class EurocopterTigerActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView eurocopter_tiger_1;
    ImageView eurocopter_tiger_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eurocopter_tiger);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        eurocopter_tiger_1 = (ImageView) findViewById(R.id.eurocopter_tiger_1);
        eurocopter_tiger_2 = (ImageView) findViewById(R.id.eurocopter_tiger_2);

        eurocopter_tiger_1.setOnClickListener(this);
        eurocopter_tiger_2.setOnClickListener(this);
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
        if (view.getId() == eurocopter_tiger_1.getId()) {
            fade();
        } else if (view.getId() == eurocopter_tiger_2.getId()) {
            fade();
        }
    }

    private void fade() {
        eurocopter_tiger_1.animate().alpha(1f - eurocopter_tiger_1.getAlpha()).setDuration(5);
        eurocopter_tiger_2.animate().alpha(1f - eurocopter_tiger_2.getAlpha()).setDuration(5);

    }
}
