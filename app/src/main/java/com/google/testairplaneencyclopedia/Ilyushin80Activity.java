package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Ilyushin80Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView il80_1;
    ImageView il80_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilyushin80);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        il80_1 = (ImageView) findViewById(R.id.il80_1);
        il80_2 = (ImageView) findViewById(R.id.il80_2);

        il80_1.setOnClickListener(this);
        il80_2.setOnClickListener(this);

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
        if (view.getId() == il80_1.getId()) {
            fade();
        } else if (view.getId() == il80_2.getId()) {
            fade();
        }
    }

    private void fade() {
        il80_1.animate().alpha(1f - il80_1.getAlpha()).setDuration(5);
        il80_2.animate().alpha(1f - il80_2.getAlpha()).setDuration(5);
    }
}
