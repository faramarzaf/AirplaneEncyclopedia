package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Bell222Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell222_1;
    ImageView bell222_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell222);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bell222_1 = (ImageView) findViewById(R.id.bell222_1);
        bell222_2 = (ImageView) findViewById(R.id.bell222_2);

        bell222_1.setOnClickListener(this);
        bell222_2.setOnClickListener(this);
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
        if (view.getId() == bell222_1.getId()) {
            fade();
        } else if (view.getId() == bell222_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell222_1.animate().alpha(1f - bell222_1.getAlpha()).setDuration(5);
        bell222_2.animate().alpha(1f - bell222_2.getAlpha()).setDuration(5);

    }
}
