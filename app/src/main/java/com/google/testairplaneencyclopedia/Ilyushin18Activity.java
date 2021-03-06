package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Ilyushin18Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView il18_1;
    ImageView il18_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilyushin18);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        il18_1 = (ImageView) findViewById(R.id.il18_1);
        il18_2 = (ImageView) findViewById(R.id.il18_2);

        il18_1.setOnClickListener(this);
        il18_2.setOnClickListener(this);
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
        if (view.getId() == il18_1.getId()) {
            fade();
        } else if (view.getId() == il18_2.getId()) {
            fade();
        }
    }

    private void fade() {
        il18_1.animate().alpha(1f - il18_1.getAlpha()).setDuration(5);
        il18_2.animate().alpha(1f - il18_2.getAlpha()).setDuration(5);

    }
}
