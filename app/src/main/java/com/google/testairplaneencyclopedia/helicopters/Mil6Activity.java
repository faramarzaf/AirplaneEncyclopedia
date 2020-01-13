package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Mil6Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView mil6_1;
    ImageView mil6_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mil6);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mil6_1 = (ImageView) findViewById(R.id.mil6_1);
        mil6_2 = (ImageView) findViewById(R.id.mil6_2);

        mil6_1.setOnClickListener(this);
        mil6_2.setOnClickListener(this);
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
        if (view.getId() == mil6_1.getId()) {
            fade();
        } else if (view.getId() == mil6_2.getId()) {
            fade();
        }
    }
    private void fade() {
        mil6_1.animate().alpha(1f - mil6_1.getAlpha()).setDuration(5);
        mil6_2.animate().alpha(1f - mil6_2.getAlpha()).setDuration(5);

    }

}
