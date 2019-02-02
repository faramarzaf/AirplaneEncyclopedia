package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An148Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an148_1;
    ImageView an148_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an148);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an148_1 = (ImageView) findViewById(R.id.an148_1);
        an148_2 = (ImageView) findViewById(R.id.an148_2);

        an148_1.setOnClickListener(this);
        an148_2.setOnClickListener(this);
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
        if (view.getId() == an148_1.getId()) {
            fade();}
        else if (view.getId()==an148_2.getId()){
            fade();}
    }

    private void fade() {
        an148_1.animate().alpha(1f-an148_1.getAlpha()).setDuration(5);
        an148_2.animate().alpha(1f-an148_2.getAlpha()).setDuration(5);
    }
}
