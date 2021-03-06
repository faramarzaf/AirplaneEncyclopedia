package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An12Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an12_1;
    ImageView an12_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an12);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        an12_1 = (ImageView) findViewById(R.id.an12_1);
        an12_2 = (ImageView) findViewById(R.id.an12_2);

        an12_1.setOnClickListener(this);
        an12_2.setOnClickListener(this);
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
        if (view.getId() == an12_1.getId()) {
            fade();}
        else if (view.getId()==an12_2.getId()){
            fade();}
    }

    private void fade() {
        an12_1.animate().alpha(1f-an12_1.getAlpha()).setDuration(5);
        an12_2.animate().alpha(1f-an12_2.getAlpha()).setDuration(5);
    }
}
