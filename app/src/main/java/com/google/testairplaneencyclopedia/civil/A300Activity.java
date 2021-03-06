package com.google.testairplaneencyclopedia.civil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;


public class A300Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView a300_1;
    ImageView a300_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a300);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        a300_1 = (ImageView) findViewById(R.id.a300_1);
        a300_2 = (ImageView) findViewById(R.id.a300_2);

        a300_1.setOnClickListener(this);
        a300_2.setOnClickListener(this);

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
        if (view.getId() == a300_1.getId()) {
            fade();
        } else if (view.getId() == a300_2.getId()) {
            fade();
        }

    }

    private void fade() {
        a300_1.animate().alpha(1f - a300_1.getAlpha()).setDuration(5);
        a300_2.animate().alpha(1f - a300_2.getAlpha()).setDuration(5);

    }
}