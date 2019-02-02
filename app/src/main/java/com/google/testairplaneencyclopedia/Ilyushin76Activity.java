package com.google.testairplaneencyclopedia;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Ilyushin76Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView il76_1;
    ImageView il76_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilyushin76);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        il76_1 = (ImageView) findViewById(R.id.il76_1);
        il76_2 = (ImageView) findViewById(R.id.il76_2);

        il76_1.setOnClickListener(this);
        il76_2.setOnClickListener(this);

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
        if (view.getId() == il76_1.getId()) {
            fade();
        } else if (view.getId() == il76_2.getId()) {
            fade();
        }
    }

    private void fade() {
        il76_1.animate().alpha(1f - il76_1.getAlpha()).setDuration(5);
        il76_2.animate().alpha(1f - il76_2.getAlpha()).setDuration(5);

    }
}
