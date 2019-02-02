package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An140Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an140_1;
    ImageView an140_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an140);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an140_1 = (ImageView) findViewById(R.id.an140_1);
        an140_2 = (ImageView) findViewById(R.id.an140_2);

        an140_1.setOnClickListener(this);
        an140_2.setOnClickListener(this);
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
        if (view.getId() == an140_1.getId()) {
            fade();}
        else if (view.getId()==an140_2.getId()){
            fade();}
    }

    private void fade() {
        an140_1.animate().alpha(1f-an140_1.getAlpha()).setDuration(5);
        an140_2.animate().alpha(1f-an140_2.getAlpha()).setDuration(5);
    }
}
