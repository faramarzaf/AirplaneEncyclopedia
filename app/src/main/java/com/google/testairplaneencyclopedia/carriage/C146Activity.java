package com.google.testairplaneencyclopedia.carriage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class C146Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView c146_1;
    ImageView c146_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c146);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        c146_1 = (ImageView) findViewById(R.id.c146_1);
        c146_2 = (ImageView) findViewById(R.id.c146_2);

        c146_1.setOnClickListener(this);
        c146_2.setOnClickListener(this);
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
        if (view.getId() == c146_1.getId()) {
            fade();
        } else if (view.getId() == c146_2.getId()) {
            fade();
        }
    }

    private void fade() {
        c146_1.animate().alpha(1f - c146_1.getAlpha()).setDuration(5);
        c146_2.animate().alpha(1f - c146_2.getAlpha()).setDuration(5);

    }
}
