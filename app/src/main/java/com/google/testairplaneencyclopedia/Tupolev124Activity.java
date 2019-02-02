package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev124Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu124_1;
    ImageView tu124_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev124);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        tu124_1 = (ImageView) findViewById(R.id.tu124_1);
        tu124_2 = (ImageView) findViewById(R.id.tu124_2);


        tu124_1.setOnClickListener(this);
        tu124_2.setOnClickListener(this);

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
        if (view.getId() == tu124_1.getId()) {
            fade();
        } else if (view.getId() == tu124_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu124_1.animate().alpha(1f - tu124_1.getAlpha()).setDuration(5);
        tu124_2.animate().alpha(1f - tu124_2.getAlpha()).setDuration(5);
    }
}