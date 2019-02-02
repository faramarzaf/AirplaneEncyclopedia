package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Ilyushin28Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView il28_1;
    ImageView il28_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilyushin28);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        il28_1 = (ImageView) findViewById(R.id.il28_1);
        il28_2 = (ImageView) findViewById(R.id.il28_2);

        il28_1.setOnClickListener(this);
        il28_2.setOnClickListener(this);
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
        if (view.getId() == il28_1.getId()) {
            fade();
        } else if (view.getId() == il28_2.getId()) {
            fade();
        }

    }

    private void fade() {
        il28_1.animate().alpha(1f - il28_1.getAlpha()).setDuration(5);
        il28_2.animate().alpha(1f - il28_2.getAlpha()).setDuration(5);
    }
}
