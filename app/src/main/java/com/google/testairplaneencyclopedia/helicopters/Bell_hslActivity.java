package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Bell_hslActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell_hsl_1;
    ImageView bell_hsl_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell_hsl);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bell_hsl_1 = (ImageView) findViewById(R.id.bell_hsl_1);
        bell_hsl_2 = (ImageView) findViewById(R.id.bell_hsl_2);

        bell_hsl_1.setOnClickListener(this);
        bell_hsl_2.setOnClickListener(this);
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
        if (view.getId() == bell_hsl_1.getId()) {
            fade();
        } else if (view.getId() == bell_hsl_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell_hsl_1.animate().alpha(1f - bell_hsl_1.getAlpha()).setDuration(5);
        bell_hsl_2.animate().alpha(1f - bell_hsl_2.getAlpha()).setDuration(5);

    }
}
