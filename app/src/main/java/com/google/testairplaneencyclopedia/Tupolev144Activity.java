package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev144Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu144_1;
    ImageView tu144_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev144);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        tu144_1 = (ImageView) findViewById(R.id.tu144_1);
        tu144_2 = (ImageView) findViewById(R.id.tu144_2);


        tu144_1.setOnClickListener(this);
        tu144_2.setOnClickListener(this);

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
        if (view.getId() == tu144_1.getId()) {
            fade();
        } else if (view.getId() == tu144_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu144_1.animate().alpha(1f - tu144_1.getAlpha()).setDuration(5);
        tu144_2.animate().alpha(1f - tu144_2.getAlpha()).setDuration(5);

    }
}
