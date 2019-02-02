package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev142Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu142_1;
    ImageView tu142_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev142);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tu142_1 = (ImageView) findViewById(R.id.tu142_1);
        tu142_2 = (ImageView) findViewById(R.id.tu142_2);


        tu142_1.setOnClickListener(this);
        tu142_2.setOnClickListener(this);

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
        if (view.getId() == tu142_1.getId()) {
            fade();
        } else if (view.getId() == tu142_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu142_1.animate().alpha(1f - tu142_1.getAlpha()).setDuration(5);
        tu142_2.animate().alpha(1f - tu142_2.getAlpha()).setDuration(5);
    }
}
