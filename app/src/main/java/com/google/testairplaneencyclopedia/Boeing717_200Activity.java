package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Boeing717_200Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView b717_1;
    ImageView b717_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boeing717_200);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        b717_1= (ImageView) findViewById(R.id.b717_1);
        b717_2= (ImageView) findViewById(R.id.b717_2);

        b717_1.setOnClickListener(this);
        b717_2.setOnClickListener(this);
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
        if (view.getId()==b717_1.getId()){
            fade();}
        else if (view.getId()==b717_2.getId()){fade();
            }
    }

    private void fade() {
        b717_1.animate().alpha(1f-b717_1.getAlpha()).setDuration(5);
        b717_2.animate().alpha(1f-b717_2.getAlpha()).setDuration(5);
    }
}
