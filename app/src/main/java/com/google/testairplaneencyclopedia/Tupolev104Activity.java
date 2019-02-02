package com.google.testairplaneencyclopedia;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev104Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu104_1;
    ImageView  tu104_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev104);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        tu104_1 = (ImageView) findViewById(R.id.tu104_1);
        tu104_2 = (ImageView) findViewById(R.id.tu104_2);


        tu104_1.setOnClickListener(this);
        tu104_2.setOnClickListener(this);

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
        if (view.getId() == tu104_1.getId()) {
            fade();
        } else if (view.getId() == tu104_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu104_1.animate().alpha(1f - tu104_1.getAlpha()).setDuration(5);
        tu104_2.animate().alpha(1f - tu104_2.getAlpha()).setDuration(5);
    }
}
