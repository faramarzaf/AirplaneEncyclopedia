package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Boeing787Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView b787_1;
    ImageView b787_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boeing787);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        b787_1 = (ImageView) findViewById(R.id.b787_1);
        b787_2 = (ImageView) findViewById(R.id.b787_2);

        b787_1.setOnClickListener(this);
        b787_2.setOnClickListener(this);
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
        if (view.getId() == b787_1.getId()) {
            fade();}
        else if (view.getId()==b787_2.getId()){
            fade();}
    }

    private void fade() {
        b787_1.animate().alpha(1f-b787_1.getAlpha()).setDuration(5);
        b787_2.animate().alpha(1f-b787_2.getAlpha()).setDuration(5);
    }
}
