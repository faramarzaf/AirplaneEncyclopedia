package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class FokkerS13Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView fokker_s13_1;
    ImageView fokker_s13_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fokker_s13);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        fokker_s13_1 = (ImageView) findViewById(R.id.fokker_s13_1);
        fokker_s13_2 = (ImageView) findViewById(R.id.fokker_s13_2);

        fokker_s13_1.setOnClickListener(this);
        fokker_s13_2.setOnClickListener(this);
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
        if (view.getId() == fokker_s13_1.getId()) {
            fade();
        } else if (view.getId() == fokker_s13_2.getId()) {
            fade();
        }
    }

    private void fade() {
        fokker_s13_1.animate().alpha(1f - fokker_s13_1.getAlpha()).setDuration(5);
        fokker_s13_2.animate().alpha(1f - fokker_s13_2.getAlpha()).setDuration(5);

    }
}
