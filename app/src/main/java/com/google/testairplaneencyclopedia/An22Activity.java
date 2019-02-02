package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An22Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an22_1;
    ImageView an22_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an22);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an22_1 = (ImageView) findViewById(R.id.an22_1);
        an22_2 = (ImageView) findViewById(R.id.an22_2);

        an22_1.setOnClickListener(this);
        an22_2.setOnClickListener(this);
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
        if (view.getId() == an22_1.getId()) {
            fade();}
        else if (view.getId()==an22_2.getId()){
            fade();}
    }

    private void fade() {
        an22_1.animate().alpha(1f-an22_1.getAlpha()).setDuration(5);
        an22_2.animate().alpha(1f-an22_2.getAlpha()).setDuration(5);
    }
}
