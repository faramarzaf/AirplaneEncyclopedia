package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Bell47Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell47_1;
    ImageView bell47_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell47);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bell47_1 = (ImageView) findViewById(R.id.bell47_1);
        bell47_2 = (ImageView) findViewById(R.id.bell47_2);

        bell47_1.setOnClickListener(this);
        bell47_2.setOnClickListener(this);
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
        if (view.getId() == bell47_1.getId()) {
            fade();
        } else if (view.getId() == bell47_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell47_1.animate().alpha(1f - bell47_1.getAlpha()).setDuration(5);
        bell47_2.animate().alpha(1f - bell47_2.getAlpha()).setDuration(5);

    }
}
