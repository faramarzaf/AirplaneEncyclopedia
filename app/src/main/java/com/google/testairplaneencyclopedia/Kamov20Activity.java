package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Kamov20Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView ka20_1;
    ImageView ka20_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamov20);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ka20_1 = (ImageView) findViewById(R.id.ka20_1);
        ka20_2 = (ImageView) findViewById(R.id.ka20_2);

        ka20_1.setOnClickListener(this);
        ka20_2.setOnClickListener(this);

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
        if (view.getId() == ka20_1.getId()) {
            fade();
        } else if (view.getId() == ka20_2.getId()) {
            fade();
        }
    }
    private void fade() {
        ka20_1.animate().alpha(1f - ka20_1.getAlpha()).setDuration(5);
        ka20_2.animate().alpha(1f - ka20_2.getAlpha()).setDuration(5);

    }
}
