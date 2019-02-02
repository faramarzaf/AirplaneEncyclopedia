package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class C130Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView c130_1;
    ImageView c130_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c130);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        c130_1 = (ImageView) findViewById(R.id.c130_1);
        c130_2 = (ImageView) findViewById(R.id.c130_2);

        c130_1.setOnClickListener(this);
        c130_2.setOnClickListener(this);
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
        if (view.getId() == c130_1.getId()) {
            fade();
        } else if (view.getId() == c130_2.getId()) {
            fade();
        }
    }
    private void fade() {
        c130_1.animate().alpha(1f - c130_1.getAlpha()).setDuration(5);
        c130_2.animate().alpha(1f - c130_2.getAlpha()).setDuration(5);

    }
}
