package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Ilyushin114Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView il114_1;
    ImageView il114_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilyushin114);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        il114_1 = (ImageView) findViewById(R.id.il114_1);
        il114_2 = (ImageView) findViewById(R.id.il114_2);

        il114_1.setOnClickListener(this);
        il114_2.setOnClickListener(this);
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
        if (view.getId() == il114_1.getId()) {
            fade();
        } else if (view.getId() == il114_2.getId()) {
            fade();
        }
    }

    private void fade() {
        il114_1.animate().alpha(1f - il114_1.getAlpha()).setDuration(5);
        il114_2.animate().alpha(1f - il114_2.getAlpha()).setDuration(5);

    }
}
