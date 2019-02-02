package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Ilyushin14Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView il14_1;
    ImageView il14_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilyushin14);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        il14_1 = (ImageView) findViewById(R.id.il14_1);
        il14_2 = (ImageView) findViewById(R.id.il14_2);

        il14_1.setOnClickListener(this);
        il14_2.setOnClickListener(this);

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
        if (view.getId() == il14_1.getId()) {
            fade();
        } else if (view.getId() == il14_2.getId()) {
            fade();
        }
    }

    private void fade() {
        il14_1.animate().alpha(1f - il14_1.getAlpha()).setDuration(5);
        il14_2.animate().alpha(1f - il14_2.getAlpha()).setDuration(5);
    }
}
