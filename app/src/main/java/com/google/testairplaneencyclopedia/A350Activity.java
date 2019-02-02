package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class A350Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView a350_1;
    ImageView a350_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a350);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        a350_1 = (ImageView) findViewById(R.id.a350_1);
        a350_2 = (ImageView) findViewById(R.id.a350_2);

        a350_1.setOnClickListener(this);
        a350_2.setOnClickListener(this);
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
        if (view.getId()==a350_1.getId()){
            fade();
        }else if (view.getId()==a350_2.getId()){
            fade();
        }


    }

    private void fade() {
        a350_1.animate().alpha(1f-a350_1.getAlpha()).setDuration(5);
        a350_2.animate().alpha(1f-a350_2.getAlpha()).setDuration(5);
    }
}
