package com.google.testairplaneencyclopedia.fighter_jets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Su35Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView su35_1;
    ImageView su35_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_su35);


        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        su35_1 = (ImageView) findViewById(R.id.su35_1);
        su35_2 = (ImageView) findViewById(R.id.su35_2);


        su35_1.setOnClickListener(this);
        su35_2.setOnClickListener(this);
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
        if (view.getId() == su35_1.getId()) {
            fade();
        } else if (view.getId() == su35_2.getId()) {
            fade();
        }
    }

    private void fade() {
        su35_1.animate().alpha(1f - su35_1.getAlpha()).setDuration(5);
        su35_2.animate().alpha(1f - su35_2.getAlpha()).setDuration(5);
    }
}
