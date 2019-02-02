package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An26Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an26_1;
    ImageView an26_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an26);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an26_1 = (ImageView) findViewById(R.id.an26_1);
        an26_2 = (ImageView) findViewById(R.id.an26_2);

        an26_1.setOnClickListener(this);
        an26_2.setOnClickListener(this);
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
        if (view.getId() == an26_1.getId()) {
            fade();}
        else if (view.getId()==an26_2.getId()){
            fade();}
    }

    private void fade() {
        an26_1.animate().alpha(1f-an26_1.getAlpha()).setDuration(5);
        an26_2.animate().alpha(1f-an26_2.getAlpha()).setDuration(5);

    }
}

