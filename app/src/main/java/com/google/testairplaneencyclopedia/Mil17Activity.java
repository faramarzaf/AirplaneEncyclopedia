package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Mil17Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView mil17_1;
    ImageView mil17_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mil17);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mil17_1 = (ImageView) findViewById(R.id.mil17_1);
        mil17_2 = (ImageView) findViewById(R.id.mil17_2);

        mil17_1.setOnClickListener(this);
        mil17_2.setOnClickListener(this);
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
        if (view.getId() == mil17_1.getId()) {
            fade();
        } else if (view.getId() == mil17_2.getId()) {
            fade();
        }
    }
    private void fade() {
        mil17_1.animate().alpha(1f - mil17_1.getAlpha()).setDuration(5);
        mil17_2.animate().alpha(1f - mil17_2.getAlpha()).setDuration(5);

    }

}
