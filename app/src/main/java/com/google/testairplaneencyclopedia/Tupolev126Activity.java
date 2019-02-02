package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev126Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu126_1;
    ImageView tu126_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev126);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tu126_1 = (ImageView) findViewById(R.id.tu126_1);
        tu126_2 = (ImageView) findViewById(R.id.tu126_2);


        tu126_1.setOnClickListener(this);
        tu126_2.setOnClickListener(this);

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
        if (view.getId() == tu126_1.getId()) {
            fade();
        } else if (view.getId() == tu126_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu126_1.animate().alpha(1f - tu126_1.getAlpha()).setDuration(5);
        tu126_2.animate().alpha(1f - tu126_2.getAlpha()).setDuration(5);
    }
}
