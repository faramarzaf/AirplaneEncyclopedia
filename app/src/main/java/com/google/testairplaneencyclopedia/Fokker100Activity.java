package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Fokker100Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView fokker100_1;
    ImageView fokker100_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fokker100);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        fokker100_1 = (ImageView) findViewById(R.id.fokker100_1);
        fokker100_2 = (ImageView) findViewById(R.id.fokker100_2);

        fokker100_1.setOnClickListener(this);
        fokker100_2.setOnClickListener(this);
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
        if (view.getId() == fokker100_1.getId()) {
            fade();
        } else if (view.getId() == fokker100_2.getId()) {
            fade();
        }
    }

    private void fade() {
        fokker100_1.animate().alpha(1f - fokker100_1.getAlpha()).setDuration(5);
        fokker100_2.animate().alpha(1f - fokker100_2.getAlpha()).setDuration(5);

    }
}
