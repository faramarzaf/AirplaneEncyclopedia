package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Bell_ah1supercobraActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell_ah1supercobra_1;
    ImageView bell_ah1supercobra_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell_ah1supercobra);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bell_ah1supercobra_1 = (ImageView) findViewById(R.id.bell_ah1supercobra_1);
        bell_ah1supercobra_2 = (ImageView) findViewById(R.id.bell_ah1supercobra_2);

        bell_ah1supercobra_1.setOnClickListener(this);
        bell_ah1supercobra_2.setOnClickListener(this);
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
        if (view.getId() == bell_ah1supercobra_1.getId()) {
            fade();
        } else if (view.getId() == bell_ah1supercobra_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell_ah1supercobra_1.animate().alpha(1f - bell_ah1supercobra_1.getAlpha()).setDuration(5);
        bell_ah1supercobra_2.animate().alpha(1f - bell_ah1supercobra_2.getAlpha()).setDuration(5);

    }
}
