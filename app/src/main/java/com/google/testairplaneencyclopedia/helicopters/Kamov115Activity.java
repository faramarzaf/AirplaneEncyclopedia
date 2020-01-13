package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Kamov115Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView ka115_1;
    ImageView ka115_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamov115);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        ka115_1 = (ImageView) findViewById(R.id.ka115_1);
        ka115_2 = (ImageView) findViewById(R.id.ka115_2);

        ka115_1.setOnClickListener(this);
        ka115_2.setOnClickListener(this);

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
        if (view.getId() == ka115_1.getId()) {
            fade();
        } else if (view.getId() == ka115_2.getId()) {
            fade();
        }
    }
    private void fade() {
        ka115_1.animate().alpha(1f - ka115_1.getAlpha()).setDuration(5);
        ka115_2.animate().alpha(1f - ka115_2.getAlpha()).setDuration(5);

    }
}
