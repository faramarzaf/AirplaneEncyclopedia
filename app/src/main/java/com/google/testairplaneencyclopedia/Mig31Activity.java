package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Mig31Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView mig31_1;
    ImageView mig31_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig31);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        mig31_1 = (ImageView) findViewById(R.id.mig31_1);
        mig31_2 = (ImageView) findViewById(R.id.mig31_2);


        mig31_1.setOnClickListener(this);
        mig31_2.setOnClickListener(this);

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
        if (view.getId() == mig31_1.getId()) {
            fade();
        } else if (view.getId() == mig31_2.getId()) {
            fade();
        }
    }

    private void fade() {
        mig31_1.animate().alpha(1f - mig31_1.getAlpha()).setDuration(5);
        mig31_2.animate().alpha(1f - mig31_2.getAlpha()).setDuration(5);
    }
}
