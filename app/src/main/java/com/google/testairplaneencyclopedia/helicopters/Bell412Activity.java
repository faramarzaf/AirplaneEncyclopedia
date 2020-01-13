package com.google.testairplaneencyclopedia.helicopters;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Bell412Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell412_1;
    ImageView bell412_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell412);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        bell412_1 = (ImageView) findViewById(R.id.bell412_1);
        bell412_2 = (ImageView) findViewById(R.id.bell412_2);

        bell412_1.setOnClickListener(this);
        bell412_2.setOnClickListener(this);
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
        if (view.getId() == bell412_1.getId()) {
            fade();
        } else if (view.getId() == bell412_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell412_1.animate().alpha(1f - bell412_1.getAlpha()).setDuration(5);
        bell412_2.animate().alpha(1f - bell412_2.getAlpha()).setDuration(5);

    }
}
