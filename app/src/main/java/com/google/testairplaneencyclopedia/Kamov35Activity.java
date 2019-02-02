package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Kamov35Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView ka35_1;
    ImageView ka35_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamov35);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ka35_1 = (ImageView) findViewById(R.id.ka35_1);
        ka35_2 = (ImageView) findViewById(R.id.ka35_2);

        ka35_1.setOnClickListener(this);
        ka35_2.setOnClickListener(this);

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
        if (view.getId() == ka35_1.getId()) {
            fade();
        } else if (view.getId() == ka35_2.getId()) {
            fade();
        }
    }

    private void fade() {
        ka35_1.animate().alpha(1f - ka35_1.getAlpha()).setDuration(5);
        ka35_2.animate().alpha(1f - ka35_2.getAlpha()).setDuration(5);
    }
}
