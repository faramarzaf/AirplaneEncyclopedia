package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Bell429Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell429_1;
    ImageView bell429_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell429);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        bell429_1 = (ImageView) findViewById(R.id.bell429_1);
        bell429_2 = (ImageView) findViewById(R.id.bell429_2);

        bell429_1.setOnClickListener(this);
        bell429_2.setOnClickListener(this);
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
        if (view.getId() == bell429_1.getId()) {
            fade();
        } else if (view.getId() == bell429_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell429_1.animate().alpha(1f - bell429_1.getAlpha()).setDuration(5);
        bell429_2.animate().alpha(1f - bell429_2.getAlpha()).setDuration(5);

    }
}
