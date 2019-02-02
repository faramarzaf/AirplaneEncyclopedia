package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An38Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an38_1;
    ImageView an38_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an38);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an38_1 = (ImageView) findViewById(R.id.an38_1);
        an38_2 = (ImageView) findViewById(R.id.an38_2);

        an38_1.setOnClickListener(this);
        an38_2.setOnClickListener(this);


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
        if (view.getId() == an38_1.getId()) {
            fade();}
        else if (view.getId()==an38_2.getId()){
            fade();}
    }

    private void fade() {
        an38_1.animate().alpha(1f-an38_1.getAlpha()).setDuration(5);
        an38_2.animate().alpha(1f-an38_2.getAlpha()).setDuration(5);

    }
}
