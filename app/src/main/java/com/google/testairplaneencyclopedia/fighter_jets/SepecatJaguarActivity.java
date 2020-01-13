package com.google.testairplaneencyclopedia.fighter_jets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class SepecatJaguarActivity extends AppCompatActivity implements View.OnClickListener {



    ImageView sepecat_jaguar_1;
    ImageView sepecat_jaguar_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepecat_jaguar);

      if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        sepecat_jaguar_1 = (ImageView) findViewById(R.id.sepecat_jaguar_1);
        sepecat_jaguar_2 = (ImageView) findViewById(R.id.sepecat_jaguar_2);

        sepecat_jaguar_1.setOnClickListener(this);
        sepecat_jaguar_2.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        if (v.getId() == sepecat_jaguar_1.getId()) {
            fade();
        } else if (v.getId() == sepecat_jaguar_2.getId()) {
            fade();
        }

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    private void fade() {
        sepecat_jaguar_1.animate().alpha(1f - sepecat_jaguar_1.getAlpha()).setDuration(5);
        sepecat_jaguar_2.animate().alpha(1f - sepecat_jaguar_2.getAlpha()).setDuration(5);

    }

}
