package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Kamov26Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView ka26_1;
    ImageView ka26_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamov26);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ka26_1 = (ImageView) findViewById(R.id.ka26_1);
        ka26_2 = (ImageView) findViewById(R.id.ka26_2);

        ka26_1.setOnClickListener(this);
        ka26_2.setOnClickListener(this);
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
        if (view.getId() == ka26_1.getId()) {
            fade();
        } else if (view.getId() == ka26_2.getId()) {
            fade();
        }
    }

    private void fade() {
        ka26_1.animate().alpha(1f - ka26_1.getAlpha()).setDuration(5);
        ka26_2.animate().alpha(1f - ka26_2.getAlpha()).setDuration(5);

    }
}
