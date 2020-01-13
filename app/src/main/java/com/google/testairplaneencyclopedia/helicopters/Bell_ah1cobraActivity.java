package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Bell_ah1cobraActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell_ah1cobra_1;
    ImageView bell_ah1cobra_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell_ah1cobra);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bell_ah1cobra_1 = (ImageView) findViewById(R.id.bell_ah1cobra_1);
        bell_ah1cobra_2 = (ImageView) findViewById(R.id.bell_ah1cobra_2);

        bell_ah1cobra_1.setOnClickListener(this);
        bell_ah1cobra_2.setOnClickListener(this);
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
        if (view.getId() == bell_ah1cobra_1.getId()) {
            fade();
        } else if (view.getId() == bell_ah1cobra_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell_ah1cobra_1.animate().alpha(1f - bell_ah1cobra_1.getAlpha()).setDuration(5);
        bell_ah1cobra_2.animate().alpha(1f - bell_ah1cobra_2.getAlpha()).setDuration(5);

    }
}
