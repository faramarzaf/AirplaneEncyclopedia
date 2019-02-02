package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An8Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an8_1;
    ImageView an8_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an8);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an8_1= (ImageView) findViewById(R.id.an8_1);
        an8_2= (ImageView) findViewById(R.id.an8_2);

        an8_1.setOnClickListener(this);
        an8_2.setOnClickListener(this);
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
        if (view.getId() == an8_1.getId()) {
            fade();}
        else if (view.getId()==an8_2.getId()){
            fade();}
    }

    private void fade() {
        an8_1.animate().alpha(1f-an8_1.getAlpha()).setDuration(5);
        an8_2.animate().alpha(1f-an8_2.getAlpha()).setDuration(5);
    }
}
