package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class C17Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView c17_1;
    ImageView c17_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c17);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        c17_1 = (ImageView) findViewById(R.id.c17_1);
        c17_2 = (ImageView) findViewById(R.id.c17_2);

        c17_1.setOnClickListener(this);
        c17_2.setOnClickListener(this);
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
        if (view.getId() == c17_1.getId()) {
            fade();
        } else if (view.getId() == c17_2.getId()) {
            fade();
        }
    }
    private void fade() {
        c17_1.animate().alpha(1f - c17_1.getAlpha()).setDuration(5);
        c17_2.animate().alpha(1f - c17_2.getAlpha()).setDuration(5);

    }
}
