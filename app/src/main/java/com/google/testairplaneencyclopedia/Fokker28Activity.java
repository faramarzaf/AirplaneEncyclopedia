package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Fokker28Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView fokker28_1;
    ImageView fokker28_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fokker28);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        fokker28_1 = (ImageView) findViewById(R.id.fokker28_1);
        fokker28_2 = (ImageView) findViewById(R.id.fokker28_2);

        fokker28_1.setOnClickListener(this);
        fokker28_2.setOnClickListener(this);
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
        if (view.getId() == fokker28_1.getId()) {
            fade();
        } else if (view.getId() == fokker28_2.getId()) {
            fade();
        }
    }

    private void fade() {
        fokker28_1.animate().alpha(1f - fokker28_1.getAlpha()).setDuration(5);
        fokker28_2.animate().alpha(1f - fokker28_2.getAlpha()).setDuration(5);

    }
}
