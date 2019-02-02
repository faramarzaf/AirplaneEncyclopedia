package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev134Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu134_1;
    ImageView tu134_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev134);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        tu134_1 = (ImageView) findViewById(R.id.tu134_1);
        tu134_2 = (ImageView) findViewById(R.id.tu134_2);


        tu134_1.setOnClickListener(this);
        tu134_2.setOnClickListener(this);

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
        if (view.getId() == tu134_1.getId()) {
            fade();
        } else if (view.getId() == tu134_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu134_1.animate().alpha(1f - tu134_1.getAlpha()).setDuration(5);
        tu134_2.animate().alpha(1f - tu134_2.getAlpha()).setDuration(5);
    }
}
