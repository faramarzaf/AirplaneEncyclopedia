package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Mig25Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView mig25_1;
    ImageView mig25_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig25);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        mig25_1 = (ImageView) findViewById(R.id.mig25_1);
        mig25_2 = (ImageView) findViewById(R.id.mig25_2);


        mig25_1.setOnClickListener(this);
        mig25_2.setOnClickListener(this);


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
        if (view.getId() == mig25_1.getId()) {
            fade();
        } else if (view.getId() == mig25_2.getId()) {
            fade();
        }

    }

    private void fade() {
        mig25_1.animate().alpha(1f - mig25_1.getAlpha()).setDuration(5);
        mig25_2.animate().alpha(1f - mig25_2.getAlpha()).setDuration(5);

    }
}
