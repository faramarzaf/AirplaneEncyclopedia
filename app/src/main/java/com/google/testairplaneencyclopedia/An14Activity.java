package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An14Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an14_1;
    ImageView an14_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an14);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an14_1 = (ImageView) findViewById(R.id.an14_1);
        an14_2 = (ImageView) findViewById(R.id.an14_2);

        an14_1.setOnClickListener(this);
        an14_2.setOnClickListener(this);

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
        if (view.getId() == an14_1.getId()) {
            fade();}
        else if (view.getId()==an14_2.getId()){
            fade();}
    }

    private void fade() {
        an14_1.animate().alpha(1f-an14_1.getAlpha()).setDuration(5);
        an14_2.animate().alpha(1f-an14_2.getAlpha()).setDuration(5);

    }
}
