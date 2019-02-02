package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Mig23Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView mig23_1;
    ImageView mig23_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig23);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mig23_1 = (ImageView) findViewById(R.id.mig23_1);
        mig23_2 = (ImageView) findViewById(R.id.mig23_2);


        mig23_1.setOnClickListener(this);
        mig23_2.setOnClickListener(this);


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
        if (view.getId() == mig23_1.getId()) {
            fade();
        } else if (view.getId() == mig23_2.getId()) {
            fade();
        }
    }

    private void fade() {
        mig23_1.animate().alpha(1f - mig23_1.getAlpha()).setDuration(5);
        mig23_2.animate().alpha(1f - mig23_2.getAlpha()).setDuration(5);
    }
}
