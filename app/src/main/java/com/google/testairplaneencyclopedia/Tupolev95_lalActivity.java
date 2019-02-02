package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev95_lalActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu95lal_1;
    ImageView tu95lal_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev95_lal);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tu95lal_1 = (ImageView) findViewById(R.id.tu95lal_1);
        tu95lal_2 = (ImageView) findViewById(R.id.tu95lal_2);


        tu95lal_1.setOnClickListener(this);
        tu95lal_2.setOnClickListener(this);

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
        if (view.getId() == tu95lal_1.getId()) {
            fade();
        } else if (view.getId() == tu95lal_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu95lal_1.animate().alpha(1f - tu95lal_1.getAlpha()).setDuration(5);
        tu95lal_2.animate().alpha(1f - tu95lal_2.getAlpha()).setDuration(5);
    }
}
