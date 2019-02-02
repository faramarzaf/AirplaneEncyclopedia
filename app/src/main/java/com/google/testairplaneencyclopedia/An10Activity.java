package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An10Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an10_1;
    ImageView an10_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an10);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        an10_1 = (ImageView) findViewById(R.id.an10_1);
        an10_2 = (ImageView) findViewById(R.id.an10_2);

        an10_1.setOnClickListener(this);
        an10_2.setOnClickListener(this);
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
        if (view.getId() == an10_1.getId()) {
            fade();}
        else if (view.getId()==an10_2.getId()){
            fade();}
    }

    private void fade() {
        an10_1.animate().alpha(1f-an10_1.getAlpha()).setDuration(5);
        an10_2.animate().alpha(1f-an10_2.getAlpha()).setDuration(5);
    }
}
