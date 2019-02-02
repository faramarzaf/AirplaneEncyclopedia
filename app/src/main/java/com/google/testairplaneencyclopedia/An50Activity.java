package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An50Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an50_1;
    ImageView an50_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an50);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an50_1 = (ImageView) findViewById(R.id.an50_1);
        an50_2 = (ImageView) findViewById(R.id.an50_2);

        an50_1.setOnClickListener(this);
        an50_2.setOnClickListener(this);

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
        if (view.getId() == an50_1.getId()) {
            fade();}
        else if (view.getId()==an50_2.getId()){
            fade();}
    }

    private void fade() {
        an50_1.animate().alpha(1f-an50_1.getAlpha()).setDuration(5);
        an50_2.animate().alpha(1f-an50_2.getAlpha()).setDuration(5);
    }
}
