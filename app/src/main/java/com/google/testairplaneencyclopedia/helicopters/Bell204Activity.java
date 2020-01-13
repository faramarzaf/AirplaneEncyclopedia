package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Bell204Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell204_1;
    ImageView bell204_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell204);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bell204_1 = (ImageView) findViewById(R.id.bell204_1);
        bell204_2 = (ImageView) findViewById(R.id.bell204_2);

        bell204_1.setOnClickListener(this);
        bell204_2.setOnClickListener(this);
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
        if (view.getId() == bell204_1.getId()) {
            fade();
        } else if (view.getId() == bell204_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell204_1.animate().alpha(1f - bell204_1.getAlpha()).setDuration(5);
        bell204_2.animate().alpha(1f - bell204_2.getAlpha()).setDuration(5);

    }
}
