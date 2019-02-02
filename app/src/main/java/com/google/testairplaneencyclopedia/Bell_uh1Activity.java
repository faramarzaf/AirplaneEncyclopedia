package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Bell_uh1Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell_uh1_1;
    ImageView bell_uh1_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell_uh1);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bell_uh1_1 = (ImageView) findViewById(R.id.bell_uh1_1);
        bell_uh1_2 = (ImageView) findViewById(R.id.bell_uh1_2);

        bell_uh1_1.setOnClickListener(this);
        bell_uh1_2.setOnClickListener(this);

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
        if (view.getId() == bell_uh1_1.getId()) {
            fade();
        } else if (view.getId() == bell_uh1_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell_uh1_1.animate().alpha(1f - bell_uh1_1.getAlpha()).setDuration(5);
        bell_uh1_2.animate().alpha(1f - bell_uh1_2.getAlpha()).setDuration(5);

    }
}
