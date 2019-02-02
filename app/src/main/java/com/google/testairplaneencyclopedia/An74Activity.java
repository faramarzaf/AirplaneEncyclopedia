package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An74Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an74_1;
    ImageView an74_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an74);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        an74_1 = (ImageView) findViewById(R.id.an74_1);
        an74_2 = (ImageView) findViewById(R.id.an74_2);

        an74_1.setOnClickListener(this);
        an74_2.setOnClickListener(this);
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
        if (view.getId() == an74_1.getId()) {
            fade();}
        else if (view.getId()==an74_2.getId()){
            fade();}
    }

    private void fade() {
        an74_1.animate().alpha(1f-an74_1.getAlpha()).setDuration(5);
        an74_2.animate().alpha(1f-an74_2.getAlpha()).setDuration(5);
    }
}
