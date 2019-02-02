package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An32Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an32_1;
    ImageView an32_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an32);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an32_1 = (ImageView) findViewById(R.id.an32_1);
        an32_2 = (ImageView) findViewById(R.id.an32_2);

        an32_1.setOnClickListener(this);
        an32_2.setOnClickListener(this);
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
        if (view.getId() == an32_1.getId()) {
            fade();}
        else if (view.getId()==an32_2.getId()){
            fade();}

    }

    private void fade() {
        an32_1.animate().alpha(1f-an32_1.getAlpha()).setDuration(5);
        an32_2.animate().alpha(1f-an32_2.getAlpha()).setDuration(5);
    }
}
