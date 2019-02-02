package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Ilyushin32Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView il32_1;
    ImageView il32_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilyushin32);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        il32_1 = (ImageView) findViewById(R.id.il32_1);
        il32_2 = (ImageView) findViewById(R.id.il32_2);

        il32_1.setOnClickListener(this);
        il32_2.setOnClickListener(this);
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
        if (view.getId() == il32_1.getId()) {
            fade();
        } else if (view.getId() == il32_2.getId()) {
            fade();
        }
    }

    private void fade() {
        il32_1.animate().alpha(1f - il32_1.getAlpha()).setDuration(5);
        il32_2.animate().alpha(1f - il32_2.getAlpha()).setDuration(5);

    }
}
