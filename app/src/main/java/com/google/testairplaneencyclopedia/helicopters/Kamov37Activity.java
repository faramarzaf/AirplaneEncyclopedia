package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Kamov37Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView ka37_1;
    ImageView ka37_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamov37);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        ka37_1 = (ImageView) findViewById(R.id.ka37_1);
        ka37_2 = (ImageView) findViewById(R.id.ka37_2);

        ka37_1.setOnClickListener(this);
        ka37_2.setOnClickListener(this);
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
        if (view.getId() == ka37_1.getId()) {
            fade();
        } else if (view.getId() == ka37_2.getId()) {
            fade();
        }
    }

    private void fade() {
        ka37_1.animate().alpha(1f - ka37_1.getAlpha()).setDuration(5);
        ka37_2.animate().alpha(1f - ka37_2.getAlpha()).setDuration(5);
    }
}
