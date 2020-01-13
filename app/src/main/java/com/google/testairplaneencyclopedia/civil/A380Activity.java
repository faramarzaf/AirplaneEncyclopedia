package com.google.testairplaneencyclopedia.civil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class A380Activity extends AppCompatActivity implements View.OnClickListener {


    ImageView a380_1;
    ImageView a380_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a380);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        a380_1 = (ImageView) findViewById(R.id.a380_1);
        a380_2 = (ImageView) findViewById(R.id.a380_2);

        a380_1.setOnClickListener(this);
        a380_2.setOnClickListener(this);

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
        if (view.getId()==a380_1.getId()){
            fade();
        }else if (view.getId()==a380_2.getId()){
            fade();
        }
    }

    private void fade() {
        a380_1.animate().alpha(1f-a380_1.getAlpha()).setDuration(5);
        a380_2.animate().alpha(1f-a380_2.getAlpha()).setDuration(5);
    }
}
