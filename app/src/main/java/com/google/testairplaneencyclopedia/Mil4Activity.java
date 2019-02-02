package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Mil4Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView mil4_1;
    ImageView mil4_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mil4);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        mil4_1 = (ImageView) findViewById(R.id.mil4_1);
        mil4_2 = (ImageView) findViewById(R.id.mil4_2);

        mil4_1.setOnClickListener(this);
        mil4_2.setOnClickListener(this);

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
        if (view.getId() == mil4_1.getId()) {
            fade();
        } else if (view.getId() == mil4_2.getId()) {
            fade();
        }
    }
    private void fade() {
        mil4_1.animate().alpha(1f - mil4_1.getAlpha()).setDuration(5);
        mil4_2.animate().alpha(1f - mil4_2.getAlpha()).setDuration(5);

    }
}
