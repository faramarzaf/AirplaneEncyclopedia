package com.google.testairplaneencyclopedia.fighter_jets;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Su25Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView su25_1;
    ImageView su25_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_su25);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        su25_1 = (ImageView) findViewById(R.id.su25_1);
        su25_2 = (ImageView) findViewById(R.id.su25_2);


        su25_1.setOnClickListener(this);
        su25_2.setOnClickListener(this);

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

        if (view.getId() == su25_1.getId()) {
            fade();
        } else if (view.getId() == su25_2.getId()) {
            fade();
        }
    }

    private void fade() {
        su25_1.animate().alpha(1f - su25_1.getAlpha()).setDuration(5);
        su25_2.animate().alpha(1f - su25_2.getAlpha()).setDuration(5);
    }
}
