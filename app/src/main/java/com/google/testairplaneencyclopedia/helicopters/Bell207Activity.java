package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Bell207Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell207_1;
    ImageView bell207_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell207);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        bell207_1 = (ImageView) findViewById(R.id.bell207_1);
        bell207_2 = (ImageView) findViewById(R.id.bell207_2);

        bell207_1.setOnClickListener(this);
        bell207_2.setOnClickListener(this);
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
        if (view.getId() == bell207_1.getId()) {
            fade();
        } else if (view.getId() == bell207_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell207_1.animate().alpha(1f - bell207_1.getAlpha()).setDuration(5);
        bell207_2.animate().alpha(1f - bell207_2.getAlpha()).setDuration(5);

    }
}
