package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Kamov18Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView ka18_1;
    ImageView ka18_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamov18);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ka18_1 = (ImageView) findViewById(R.id.ka18_1);
        ka18_2 = (ImageView) findViewById(R.id.ka18_2);

        ka18_1.setOnClickListener(this);
        ka18_2.setOnClickListener(this);

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
        if (view.getId() == ka18_1.getId()) {
            fade();
        } else if (view.getId() == ka18_2.getId()) {
            fade();
        }
    }

    private void fade() {
        ka18_1.animate().alpha(1f - ka18_1.getAlpha()).setDuration(5);
        ka18_2.animate().alpha(1f - ka18_2.getAlpha()).setDuration(5);
    }
}
