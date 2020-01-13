package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Mil28Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView mil28_1;
    ImageView mil28_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mil28);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        mil28_1 = (ImageView) findViewById(R.id.mil28_1);
        mil28_2 = (ImageView) findViewById(R.id.mil28_2);

        mil28_1.setOnClickListener(this);
        mil28_2.setOnClickListener(this);


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
        if (view.getId() == mil28_1.getId()) {
            fade();
        } else if (view.getId() == mil28_2.getId()) {
            fade();
        }
    }
    private void fade() {
        mil28_1.animate().alpha(1f - mil28_1.getAlpha()).setDuration(5);
        mil28_2.animate().alpha(1f - mil28_2.getAlpha()).setDuration(5);

    }
}
