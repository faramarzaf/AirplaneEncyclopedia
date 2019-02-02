package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An28Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an28_1;
    ImageView an28_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an28);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an28_1 = (ImageView) findViewById(R.id.an28_1);
        an28_2 = (ImageView) findViewById(R.id.an28_2);


        an28_1.setOnClickListener(this);
        an28_2.setOnClickListener(this);
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
        if (view.getId() == an28_1.getId()) {
            fade();
        } else if (view.getId() == an28_2.getId()) {
            fade();
        }
    }

    private void fade() {
        an28_1.animate().alpha(1f - an28_1.getAlpha()).setDuration(5);
        an28_2.animate().alpha(1f - an28_2.getAlpha()).setDuration(5);
    }
}
