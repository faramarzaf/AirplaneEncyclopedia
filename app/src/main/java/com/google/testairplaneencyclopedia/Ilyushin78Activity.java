package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Ilyushin78Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView il78_1;
    ImageView il78_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilyushin78);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        il78_1 = (ImageView) findViewById(R.id.il78_1);
        il78_2 = (ImageView) findViewById(R.id.il78_2);

        il78_1.setOnClickListener(this);
        il78_2.setOnClickListener(this);

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
        if (view.getId() == il78_1.getId()) {
            fade();
        } else if (view.getId() == il78_2.getId()) {
            fade();
        }
    }

    private void fade() {
        il78_1.animate().alpha(1f - il78_1.getAlpha()).setDuration(5);
        il78_2.animate().alpha(1f - il78_2.getAlpha()).setDuration(5);

    }
}
