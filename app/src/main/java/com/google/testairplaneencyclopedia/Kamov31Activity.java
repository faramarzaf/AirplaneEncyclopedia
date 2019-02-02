package com.google.testairplaneencyclopedia;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Kamov31Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView ka31_1;
    ImageView ka31_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamov31);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        ka31_1 = (ImageView) findViewById(R.id.ka31_1);
        ka31_2 = (ImageView) findViewById(R.id.ka31_2);

        ka31_1.setOnClickListener(this);
        ka31_2.setOnClickListener(this);
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
        if (view.getId() == ka31_1.getId()) {
            fade();
        } else if (view.getId() == ka31_2.getId()) {
            fade();
        }
    }
    private void fade() {
        ka31_1.animate().alpha(1f - ka31_1.getAlpha()).setDuration(5);
        ka31_2.animate().alpha(1f - ka31_2.getAlpha()).setDuration(5);

    }
}
