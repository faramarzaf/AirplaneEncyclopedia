package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Kamov25Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView ka25_1;
    ImageView ka25_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamov25);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ka25_1 = (ImageView) findViewById(R.id.ka25_1);
        ka25_2 = (ImageView) findViewById(R.id.ka25_2);

        ka25_1.setOnClickListener(this);
        ka25_2.setOnClickListener(this);

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
        if (view.getId() == ka25_1.getId()) {
            fade();
        } else if (view.getId() == ka25_2.getId()) {
            fade();
        }
    }

    private void fade() {
        ka25_1.animate().alpha(1f - ka25_1.getAlpha()).setDuration(5);
        ka25_2.animate().alpha(1f - ka25_2.getAlpha()).setDuration(5);

    }
}

