package com.google.testairplaneencyclopedia;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class F5Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView f5_1;
    ImageView f5_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f5);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        f5_1 = (ImageView) findViewById(R.id.f5_1);
        f5_2 = (ImageView) findViewById(R.id.f5_2);


        f5_1.setOnClickListener(this);
        f5_2.setOnClickListener(this);

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
        if (view.getId() == f5_1.getId()) {
            fade();
        } else if (view.getId() == f5_2.getId()) {
            fade();
        }
    }

    private void fade() {
        f5_1.animate().alpha(1f - f5_1.getAlpha()).setDuration(5);
        f5_2.animate().alpha(1f - f5_2.getAlpha()).setDuration(5);
    }
}
