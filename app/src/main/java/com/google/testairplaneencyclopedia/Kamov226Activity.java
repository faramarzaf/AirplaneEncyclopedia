package com.google.testairplaneencyclopedia;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Kamov226Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView ka226_1;
    ImageView ka226_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamov226);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ka226_1 = (ImageView) findViewById(R.id.ka226_1);
        ka226_2 = (ImageView) findViewById(R.id.ka226_2);

        ka226_1.setOnClickListener(this);
        ka226_2.setOnClickListener(this);
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
        if (view.getId() == ka226_1.getId()) {
            fade();
        } else if (view.getId() == ka226_2.getId()) {
            fade();
        }
    }

    private void fade() {
        ka226_1.animate().alpha(1f - ka226_1.getAlpha()).setDuration(5);
        ka226_2.animate().alpha(1f - ka226_2.getAlpha()).setDuration(5);

    }

}
