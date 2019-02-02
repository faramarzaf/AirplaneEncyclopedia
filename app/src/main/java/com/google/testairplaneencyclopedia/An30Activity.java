package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An30Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an30_1;
    ImageView an30_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an30);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an30_1 = (ImageView) findViewById(R.id.an30_1);
        an30_2 = (ImageView) findViewById(R.id.an30_2);

        an30_1.setOnClickListener(this);
        an30_2.setOnClickListener(this);

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
        if (view.getId() == an30_1.getId()) {
            fade();}
        else if (view.getId()==an30_2.getId()){
            fade();}
    }

    private void fade() {

        an30_1.animate().alpha(1f-an30_1.getAlpha()).setDuration(5);
        an30_2.animate().alpha(1f-an30_2.getAlpha()).setDuration(5);
    }
}
