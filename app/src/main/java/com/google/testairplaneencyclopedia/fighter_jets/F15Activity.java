package com.google.testairplaneencyclopedia.fighter_jets;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class F15Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView f15_1;
    ImageView f15_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f15);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        f15_1 = (ImageView) findViewById(R.id.f15_1);
        f15_2 = (ImageView) findViewById(R.id.f15_2);


        f15_1.setOnClickListener(this);
        f15_2.setOnClickListener(this);


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
        if (view.getId() == f15_1.getId()) {
            fade();
        } else if (view.getId() == f15_2.getId()) {
            fade();
        }

    }

    private void fade() {
        f15_1.animate().alpha(1f - f15_1.getAlpha()).setDuration(5);
        f15_2.animate().alpha(1f - f15_2.getAlpha()).setDuration(5);
    }
}
